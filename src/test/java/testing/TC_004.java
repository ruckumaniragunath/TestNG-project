package testing;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_004 {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"url"})
	public void launchApplication(String url) {
		System.out.println("I am launching Child Support Application");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	@Parameters({"title", "url"})
	public void testHomePage_1(String title, String url) {
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String runTimeTitle = driver.getTitle();
		Assert.assertEquals(title, runTimeTitle);
		
		//validate testContactUsPage_2
		testContactUsPage_2();
		
	}

	
	
	
	//@Test
	public void testContactUsPage_2() {
		
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		
		
		Assert.assertTrue(driver.findElement(By.xpath("(//span[@class='et_pb_image_wrap '])[1]/img")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to calculate child support.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to make a payment.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to apply for services.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to access frequently asked questions.']")).isDisplayed());	
		
		
		
		
		
	}

//	@Test
//	public void do_testing_1() {
//		System.out.println("My second testng testscript");
//		
//		
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='logo']")).isDisplayed());
//		
//
//	}
	
	@AfterClass
	public void closeApplication() {
		System.out.println("I am closing Child Support Application");
		driver.quit();
	}
	
	
	

}
