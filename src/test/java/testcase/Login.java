package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;
public class Login extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testdatas", priority=1)
	public static void LoginTest(String emailAddress, String pin) throws InterruptedException 
	{
		//Invalid Login
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(emailAddress);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(Loc.getProperty("passsword_field"))).sendKeys(pin);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("login_btn"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Loc.getProperty("loginErrorMessage"))).isDisplayed();
		Thread.sleep(10000);
		//driver.findElement(By.xpath(Loc.getProperty("pop_up_cancel_btn"))).click();	
	

}
	
	@Test (priority=2)
	public static void LoginTest() throws InterruptedException
	{
		//Valid Login
		Thread.sleep(7000);
		driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys("funmilayoakinwale02@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(Loc.getProperty("passsword_field"))).sendKeys("626262");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("login_btn"))).click();
		Thread.sleep(10000);

	}
	
}