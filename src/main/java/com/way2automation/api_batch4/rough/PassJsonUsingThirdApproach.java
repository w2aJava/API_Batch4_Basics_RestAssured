package com.way2automation.api_batch4.rough;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonUsingThirdApproach {

	public static void main(String[] args) {
		User user = new User("Ashish@gmail.com", "Ashish", "Jha", "D-111", "new delhi", "delhi", "India");

		user.setMobileNumbers(12123, 234234, 34534535);
		
		Response response = given().contentType(ContentType.JSON).body(user).log().all()
				.post("https://reqres.in/api/users");

		System.out.println("*****************************");
		response.prettyPrint();

	}
}
