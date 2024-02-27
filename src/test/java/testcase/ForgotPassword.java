package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class ForgotPassword extends BaseTest{

	@Test
	public static void ForgotPwdTest() throws InterruptedException
	{
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(Loc.getProperty("forgotPin_btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("forgotpwd_phoneNumber_field"))).sendKeys("08130842230");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("forgotPin_continue_btn"))).click();
		Thread.sleep(5000);

	}

}
