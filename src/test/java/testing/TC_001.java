package testing;

import java.nio.file.FileSystemLoopException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001 {

	WebDriver driver;

	@BeforeClass
	public void launchApplication() {
		System.out.println("I am launching google chrome browser");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
	}

	@Test

	public void do_testing() {
		System.out.println("My first testng testscript");

	}

	@Test

	public void do_testing_1() {
		System.out.println("My second testng testscript");
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
		

	}
	
	@AfterClass
	public void closeApplication() {
		System.out.println("I am closing google chrome");
		driver.quit();
	}
	
	



}
