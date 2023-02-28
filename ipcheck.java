package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ipcheck {

		@Test
		public void validateIP() {
			String ipResponce = RestAssured.given().when().get("https://api.ipify.org/format+json").thenReturn().asString();
			System.out.println(ipResponce);
			Assert.assertNotNull(ipResponce);
		}
		
}
