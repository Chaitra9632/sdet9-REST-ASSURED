package sdet9.sdet9.RestAsssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;

public class QueryParameterTest {

	@Test
	public void queryParameterTest()
	{
		Response res = given()
		.contentType(ContentType.JSON)
		.queryParam("page", 2)
		.baseUri("https://reqres.in/")
		.when()
		.get("api/users");
		
		
       ArrayList<String> val=res.jsonPath().get("data.first_name");
       for(String str:val)
       {
    	 System.out.println(str);
       }
       
	}
}
