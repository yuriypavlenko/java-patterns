package homework;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.CsrfConfig;
import io.restassured.config.RedirectConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@WireMockTest(httpPort = 9876)
public class AuthTest {

    private RequestSpecification requestSpec;

    @BeforeEach
    public void preConditions() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(9876)
                .setConfig(RestAssuredConfig.config().csrfConfig(CsrfConfig.csrfConfig().loggingEnabled()))
                .build();
    }

    @Test
    public void formAuthTest() {
        given()
                .spec(requestSpec)
                .auth().form("root", "123456", new FormAuthConfig("/auth/form", "username", "password").withLoggingEnabled())
                .log().all()
        .when()
                .get("/auth/no")
        .then()
                .log().all();
    }

    @Test
    public void csrfFormTokenAuth() {
        given()
                .spec(requestSpec)
                .csrf("http://localhost:9876/users/csrf", "_csrf")
                .formParam("username", "User1")
                .formParam("password", "12345678")
        .when()
                .post("/users/csrf")
        .then()
                .assertThat()
                .statusCode(200)
                .body("code", equalTo(0));
    }

    @Test
    public void csrfHeaderTokenAuth() {
        given().
                spec(requestSpec).
                csrf("http://localhost:9876/users/csrf/header").
                log().all().
                when().
                post("http://localhost:9876/users/csrf").
                then().
                log().all().
                statusCode(200);
    }
}
