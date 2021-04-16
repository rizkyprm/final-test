package com.assignment.final_test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.ContainsData;
import org.testng.annotations.Test;

import com.assignment.baseapi.BaseAPITest;
import com.assignment.page_object.LandingAPI;
import com.assignment.utility.APIActions;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiTest extends BaseAPITest{
	
	int number = (int)(Math.random()*100);
	String emailx = "test" + number + "@gmail.com";
	
	@Test(priority = 1)
	public void testRegisterAPI() {
		
		String loginPayLoad = "{\"user\":{\"first_name\":\"justesting\",\"last_name\":\"\",\"email\":\""+emailx+"\",\"password\":\"testing123\",\"phone_number\":\"+62-82124151617\",\"user_type\":\"User\",\"currency_id\":3}}";
		
		Response loginResponse = RestAssured.given().spec(commonRequestSpec).body(loginPayLoad)
		.when().post(APIEndpoint.loginAPI);
		
		APIActions.verifyResponseDetails(loginResponse);
	
		String email = APIActions.getResponseDataUsingJsonPath(loginResponse, JsonPaths.email);
		String phone = APIActions.getResponseDataUsingJsonPath(loginResponse, JsonPaths.phone);

		assertEquals(email, emailx);
		assertEquals(phone, LandingAPI.phoneAPI);

	}
	
	@Test(priority = 2)
	public void testCurrencyAPI() {
		
		String loginPayLoad = "{\"email\":\"test48@gmail.com\",\"password\":\"testing123\"}";
		
		
		Response loginResponse = RestAssured.given().spec(commonRequestSpec).body(loginPayLoad)
		.when().post(APIEndpoint.profileAPI);
		
		APIActions.verifyResponseDetails(loginResponse);
		String currency = APIActions.getResponseDataUsingJsonPath(loginResponse, JsonPaths.currency);
	
		assertEquals(currency, LandingAPI.currencyAPI);
	
	}
	
	@Test
		public void testProfileAPI() {
		
		String loginPayLoad = "{\"email\":\"test48@gmail.com\",\"password\":\"testing123\"}";
		
		Response loginResponse = RestAssured.given().spec(commonRequestSpec).body(loginPayLoad)
		.when().post(APIEndpoint.profileAPI);
		
		APIActions.verifyResponseDetails(loginResponse);
		String email = APIActions.getResponseDataUsingJsonPath(loginResponse, JsonPaths.email);
		String phone = APIActions.getResponseDataUsingJsonPath(loginResponse, JsonPaths.phone);
		assertEquals(email, LandingAPI.emailAPI);
		assertEquals(phone, LandingAPI.phoneAPI);
	}
	
	
}
