package com.assignment.utility;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIActions {
		
	public static void verifyResponseDetails(Response response) {		
		System.out.println("status code: "+response.getStatusCode());
		assertEquals(String.valueOf(response.getStatusCode()).startsWith("20"),true);

	}
	
	public static <T> T getResponseDataUsingJsonPath(Response response, String jsonPath) {
		
	JsonPath jPath = response.jsonPath();
	System.out.println(jsonPath + " value is = "+jPath.get(jsonPath));
	
	return jPath.get(jsonPath);
	
	}
}
