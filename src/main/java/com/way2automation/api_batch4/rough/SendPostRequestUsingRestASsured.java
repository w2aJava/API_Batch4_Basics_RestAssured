package com.way2automation.api_batch4.rough;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequestUsingRestASsured {

	/*
	 * public static void main(String[] args) { Response response =
	 * given().auth().basic("sk_test_kzxPb2wjsBPiIh7QxZKqJU3a", "")
	 * .formParam("email", "deepak1@gmail.com").formParam("description",
	 * "This is a test cust") .formParam("account_balance",
	 * 10000).post("https://api.stripe.com/v1/customers");
	 * 
	 * response.prettyPrint(); }
	 */

	public static void main(String[] args) {
		/*String bodyString = "{\"name\":\"rahuljha\",\"job\":\"apiTrainer\"}";
		Response res = given().contentType(ContentType.JSON).body(bodyString).post("https://reqres.in/api/users");
		res.prettyPrint();*/
		
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("name","Ashish");
		map.put("job", "Trainer");
		
		Response res=given().contentType(ContentType.JSON).body(map).post("https://reqres.in/api/users");
		res.prettyPrint();
		
	}

}
