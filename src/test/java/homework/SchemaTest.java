package homework;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsd;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

@WireMockTest(httpPort = 9876)
public class SchemaTest {

    private RequestSpecification requestSpec;
    private final String customerSchema = "schemas/customer.json";

    @BeforeEach
    public void prepare() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(9876)
                .build();
    }

    @Test
    public void jsonSchemaCheck() {
        given()
                .spec(requestSpec)
        .when()
                .get("/customer/12212")
        .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath(customerSchema));
    }

    @Test
    public void jsonSchemaCheckStandAlone() {
        String responce = given()
                .spec(requestSpec)
        .when()
                .get("/customer/12212")
        .then()
                .extract().body().asString();

        assertThat(responce, matchesJsonSchemaInClasspath(customerSchema));
    }

    @Test
    public void anonymousJsonRootValidation() {
        stubFor(get(urlEqualTo("/json"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("[1, 2, 3]"))
        );

        given()
                .spec(requestSpec)
        .when()
                .get("/json")
        .then()
                .body("$", hasItems(1, 2, 3));
    }

    @Test
    public void rootValidationWithFileStubConfigAndValidationSchema() {
        // StubConfig in /resources/mappings/json_get.json

        // validation schema
        String validationSchemaPath = "schemas/json.json";

        given()
                .spec(requestSpec)
        .when()
                .get("/json")
        .then()
                .body(matchesJsonSchemaInClasspath(validationSchemaPath));
    }

    @Test
    public void xmlValidation() {
        given()
                .spec(requestSpec)
        .when()
                .get("/greetXML")
        .then()
                .body("greeting.firstName", equalTo("John"))
                .body("greeting.lastName", equalTo("Doe"));
    }

    @Test
    public void searchByXpath() {
        given()
                .spec(requestSpec)
        .when()
                .get("/greetXML")
        .then()
                .body(hasXPath("/greeting/firstName", containsString("Jo")))
                .body(hasXPath("/greeting/lastName[text()='Doe']"));
    }

    @Test
    public void xmlSchemaValidation() throws IOException {
        URL xsd = getClass().getClassLoader().getResource("schemas/shiporder.xsd");
        assert xsd != null;
        given()
                .spec(requestSpec)
        .when()
                .get("/shiporder")
        .then()
                .body(matchesXsd(xsd.openStream()));
    }

    @Test
    public void xmlComplexValidation() {
        given()
                .spec(requestSpec)
        .when()
                .get("/shopping")
        .then()
                .body("shopping.category.find { it.@type == 'groceries'}.item", hasItems("Chocolate", "Coffee"));
    }

    @Test
    public void xmlGetCollection() {
        List<String> items = given().spec(requestSpec).get("/shopping").body().xmlPath().getList("shopping.category.find { it.@type == 'groceries' }.item");
        assertThat(items, hasItems("Chocolate", "Coffee"));
    }
}
