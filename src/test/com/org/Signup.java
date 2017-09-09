package test.com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utlity.Reusbale;

public class Signup {
	 WebDriver driver;
	public Signup(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}
	public void signin() throws InterruptedException

	{
		Reusbale ref= new Reusbale();  // object creation, new reusable is object, ref is variable, Reusable before ref is Data type & Resuable() is constructor
		
		int rd=ref.randomNum();
		driver.findElement(By.xpath("//*[@class='btn btn-cta btn-cta-secondary' and @href='trackoweb/signup.html']")).click();;
		driver.findElement(By.id("name")).sendKeys("Madhav");
	    driver.findElement(By.id("email")).sendKeys("madh"+rd+"@gmail.com");
	//  driver.findElement(By.className("form-control login-email emailallow")).sendKeys("mdk.madhav2@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("989672"+rd+"98");
		driver.findElement(By.id("sub_btn_signup")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("otp")).sendKeys("123456");
		driver.findElement(By.id("sub_btn_verify")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='OK']")).click();
		driver.findElement(By.id("password")).sendKeys("password10");
		driver.findElement(By.id("repassword")).sendKeys("password10");
		driver.findElement(By.id("sub_btn_setpass")).click();
	}
}

