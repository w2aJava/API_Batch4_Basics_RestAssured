package com.way2automation.api_batch4.rough;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
/*import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;*/

public class SendGetRequestUsingRestAssured {
	/*
	 * set authentication:-basic auth/ Bearer token using Header
	 * 
	 * set some request Specification --> send the Request-->
	 * 
	 * 
	 * Response-> Validate the response
	 * 
	 */

	/*
	 * public static void main(String[] args) { // in basic(String arg0, String
	 * arg1);-> argo--> username, arg1--> // password
	 * 
	 * // given().auth().basic("sk_test_kzxPb2wjsBPiIh7QxZKqJU3a", "");
	 * 
	 * // given().contentType(ContentType.JSON);
	 * 
	 * // given().contentType("application/xwwwform-")
	 * 
	 * //
	 * given().header("Content-Type","application/xwwwform-").auth().basic(arg0,
	 * // arg1)
	 * 
	 * Response response =
	 * given().auth().basic("sk_test_kzxPb2wjsBPiIh7QxZKqJU3a", "")
	 * .get("https://api.stripe.com/v1/customers");
	 * 
	 * System.out.println(response.asString());
	 * //System.out.println(response.getBody());
	 * 
	 * String jsonResponse=response.asString();
	 * System.out.println("Response code -->"+response.statusCode());
	 * 
	 * //response.prettyPrint(); }
	 */

	public static void main(String[] args) {
		Response response=given().header("Authorization", "Bearer sk_test_kzxPb2wjsBPiIh7QxZKqJU3a")
				.get("https://api.stripe.com/v1/customers/cus_F0e5kkTS2680kL");
		
		response.prettyPrint();
	}

}
