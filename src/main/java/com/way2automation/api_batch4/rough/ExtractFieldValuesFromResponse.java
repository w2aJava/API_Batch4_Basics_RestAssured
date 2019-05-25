package com.way2automation.api_batch4.rough;

import io.restassured.RestAssured;

//import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ExtractFieldValuesFromResponse {
	
	
	public static void main(String[] args) {
		
		RequestSpecification reqSpecs=RestAssured.given();
		reqSpecs=reqSpecs.auth().basic("", "");
		reqSpecs.formParam("", "");
	}
	
/*
	public static void main(String[] args) {

		Response response = given().auth().basic("sk_test_kzxPb2wjsBPiIh7QxZKqJU3a", "")
				.formParam("email", "").formParam("name", "Rahul Arora 1010")
				.post("https://api.stripe.com/v1/customers");

		
		System.out.println("*************************************");
		response.prettyPrint();
		// fetching the status code of the response
		
		System.out.println(response.jsonPath().getMap("$").size());

		System.out.println(response.jsonPath().getMap("tax_ids").size());
		
		System.out.println("Response status code:- " + response.statusCode());

		
		 * Fetching the field value from the response:
		 * 
		 
		
		JsonPath json=response.jsonPath();
		// fetching the value of field "id" from the response and priting the value
		
		String idInResponse=json.get("id");
		System.out.println("Id in the response= "+idInResponse);
		
		//Fetching the value of "created" field available in the response
		
		
		int created= json.get("created");
		System.out.println("created in the response:-"+created);
		
		String email= json.get("email");
		System.out.println("email in trhe response= "+email);
		
		String name= json.get("name");
		System.out.println("name in trhe response= "+name);
		
		String objectInsideSources= json.get("sources.object");
		System.out.println("objectInsideSources in trhe response= "+objectInsideSources);
		
		
		// get the size of data field available inside sources field
		
		System.out.println(json.getList("sources.data").size());
		
	}*/

}
