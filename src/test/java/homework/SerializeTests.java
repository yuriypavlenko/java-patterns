package homework;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@WireMockTest(httpPort = 8797)
public class SerializeTests {

    RequestSpecification spec;
    Message message;

    public class Message {
        String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class Response {
        int code;
        String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @BeforeEach
    public void preConditions() {
        spec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setConfig(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset("UTF-8")))
                .setPort(8797)
                .build();

        message = new Message();
        message.setMessage("test message");
    }

    @Test
    public void serialize() {
        Response resp = given()
                .spec(spec)
                .log().all()
                .contentType(ContentType.JSON)
                //.body(message)
                .formParam("message", message)
       .when()
                .post("/message")
       .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .as(Response.class);

        assertThat(resp.getCode(), equalTo(0));
        assertThat(resp.getMessage(), equalTo("Message received"));
    }
}
