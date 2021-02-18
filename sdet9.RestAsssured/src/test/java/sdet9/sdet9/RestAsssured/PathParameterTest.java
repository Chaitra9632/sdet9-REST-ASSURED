package sdet9.sdet9.RestAsssured;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PathParameterTest {
	
@Test
 public void pathParameterTest()
 {
	
	given()
	.contentType(ContentType.JSON)
	.pathParam("projectId", "TY_PROJ_1802")
	.baseUri("http://localhost:8084/")
   .when()
   .post("addProject")
   .then()
   .log().all()
   .assertThat().statusCode(200);
	
	
 }

}
