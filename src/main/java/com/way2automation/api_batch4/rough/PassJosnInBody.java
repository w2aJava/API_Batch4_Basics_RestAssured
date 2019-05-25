package com.way2automation.api_batch4.rough;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PassJosnInBody {

	public static void main(String[] args) {

		/*
		 * Response response = given().contentType(ContentType.JSON).body(new
		 * File("D:/Workspace/API_Batch4/user.json"))
		 * .post("https://reqres.in/api/users");
		 * 
		 * response.prettyPrint();
		 */

		/*
		 * Response response = given().contentType(ContentType.JSON).
		 * body("{\"name\": \"Raman\",\"job\": \"Java developer\"}")
		 * .post("https://reqres.in/api/users");
		 * 
		 * response.prettyPrint();
		 */

		// Approach 1 to create json at runtime:- Using map
		/*
		 * HashMap<String, String> map = new HashMap<String, String>();
		 * 
		 * map.put("name", "Sachin"); map.put("job", "Team Lead");
		 * 
		 * Response response =
		 * given().contentType(ContentType.JSON).body(map).log().all()
		 * .post("https://reqres.in/api/users");
		 * 
		 * response.prettyPrint();
		 */

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("email", "abc@gmail.com");
		map.put("firstname", "Rahul");
		map.put("lastname", "Jha");

		ArrayList<Integer> listOfMobileNos = new ArrayList<Integer>();

		listOfMobileNos.add(23423423);
		listOfMobileNos.add(4456456);

		map.put("mobile", listOfMobileNos);

		HashMap<String, String> address = new HashMap<String, String>();
		address.put("flatno", "a-121");
		address.put("city", "new delhi");
		address.put("state", "delhi");
		address.put("country", "India");

		map.put("address", address);

		Response response = given().contentType(ContentType.JSON).body(map).log().all()
				.post("https://reqres.in/api/users");
		
		System.out.println("*****************************");
		response.prettyPrint();

	}

}
