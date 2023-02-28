package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Test;

public class TestVilocity {
	WebDriver driver;
	@Test
	public void vilocity() {
		driver = Browser.
				CHROME("https://www.urbanladder.com");
		
		
	}
}
