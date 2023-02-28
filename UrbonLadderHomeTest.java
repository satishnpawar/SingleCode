package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.POMUrbonLadderHome;
import Pojo.Browser;

public class UrbonLadderHomeTest {

	WebDriver driver;
	@Test
	public void OpenBrowser() {
		driver = Browser.OpenChromeBrowser("https://www.urbanladder.com");
		POMUrbonLadderHome obj = new POMUrbonLadderHome(driver);
		obj.login();
	}
	
}
