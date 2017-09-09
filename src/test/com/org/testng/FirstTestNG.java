package test.com.org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
	  System.out.println("Hello world");
  }
	
  @BeforeTest
  public void beforeTest() {
  driver = new ChromeDriver();
  
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
