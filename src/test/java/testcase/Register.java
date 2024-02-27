package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;
public class Register extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testdatas")
	public static void RegisterTest(String firstName, String lastName, String emailAddress, String phoneNumber, String pin, String reEnterPin, String answerQuestion) throws InterruptedException 
	{
		//Invalid Register
		Thread.sleep(7000);
		driver.findElement(By.xpath(Loc.getProperty("register_Btn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("firstNameField"))).sendKeys(firstName);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("lastNameField"))).sendKeys(lastName);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("register_emailField"))).sendKeys(emailAddress);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("register_phoneField"))).sendKeys(phoneNumber);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("security_informationBtn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("pinButton"))).sendKeys(pin);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("reEnterPin_Button"))).sendKeys(reEnterPin);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Loc.getProperty("secret_question_dropdown"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Loc.getProperty("answer_to_secret_question_field"))).sendKeys(answerQuestion);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Loc.getProperty("how_did_you_hear_aboutUs_Dropdown"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Loc.getProperty("termsAndCondition_checkbox"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Loc.getProperty("register_button1"))).click();
		Thread.sleep(10000);		

}
	
}