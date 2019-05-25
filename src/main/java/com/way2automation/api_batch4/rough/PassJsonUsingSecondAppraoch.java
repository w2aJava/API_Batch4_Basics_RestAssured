package com.way2automation.api_batch4.rough;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonUsingSecondAppraoch {
	
	public static void main(String[] args) {
		
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("email", "abc@gmail.com");
		jsonObject.put("firstname", "Rahul");
		jsonObject.put("lastname", "Jha");
		
		JSONArray listOfMobiles= new JSONArray();
		listOfMobiles.put(23423423);
		listOfMobiles.put(5645456);
		jsonObject.put("mobile", listOfMobiles);
		
		
		JSONObject address= new JSONObject();
		address.put("flatno", "a-111");
		address.put("city", "new delhi");
		address.put("state", "delhi");
		address.put("country", "India");
		
		jsonObject.put("address", address);
		
		
		Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all()
				.post("https://reqres.in/api/users");
		
		System.out.println("*****************************");
		response.prettyPrint();
		
	}

}
