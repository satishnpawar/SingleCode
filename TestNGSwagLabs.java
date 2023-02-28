package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGSwagLabs {


	@Test
	public void OpenBrowser() throws IOException {
	WebDriver driver = Pojo.Browser.OpenChromeBrowser("https://www.saucedemo.com");
	POM.POMSwagLabs obj = new POM.POMSwagLabs(driver);
		obj.EnterUsername("standard_user");
		obj.EnterPassword("secret_sauce");
		obj.ClickOnLogin();
		String Title = driver.getTitle(); 
		System.out.println("Page Title is:"+Title);	
 		driver.close();
	}
		
}