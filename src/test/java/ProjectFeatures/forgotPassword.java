package ProjectFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class forgotPassword {

	public static String browser = "firefox";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://frontend-test.stg.parthiantechnology.com/");
		driver.manage().window().maximize();
		Thread.sleep(40000);
		//Invalid phone number password reset
		driver.findElement(By.cssSelector(".paragraph-5.d-flex.justify-content-end.mr-4")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("080123456");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#button-signup")).click();
	}

}