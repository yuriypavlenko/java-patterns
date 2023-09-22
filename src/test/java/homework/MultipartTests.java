package homework;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.MultiPartConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;

@WireMockTest(httpPort = 8897)
public class MultipartTests {
    RequestSpecification spec;

    @BeforeEach
    public void preConditions() {
        spec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(8897)
                .build();
    }

    @Test
    public void multipartFileUpload() {
        byte[] file2 = "content".getBytes();
        JSONObject json = new JSONObject();
        given()
                .spec(spec)
                .multiPart(new File("src/test/resources/__files/cars.xml"))
                .multiPart("file2", "test-file.txt", file2, "text/plain")
                .multiPart("file3", json, "application/json")
                .log().all()
        .when()
                .post("/upload")
        .then()
                .assertThat()
                .statusCode(200)
                .log().all();


    }
}
