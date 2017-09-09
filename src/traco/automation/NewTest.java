package traco.automation;

import org.testng.annotations.Test;

import test.com.org.Login;
import test.com.org.Signup;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
		Signup ref = new Signup(driver);
		ref.signin();
	
		 Login ref1 = new Login(driver);
			ref1.login_method();
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://dev.tracko.co.in/");
	  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
