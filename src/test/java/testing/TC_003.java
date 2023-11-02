package testing;


import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_003 {
	WebDriver driver;
	@BeforeClass
	public void launchApplication() {
		
		driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void testBasicAuth() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		String actualTitle = "The Internet";
		String expectedTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Not displayed");
		Thread.sleep(5000);
		System.out.println("Executed");
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void testCheckbox() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		boolean checkbox1_status = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();

		if(!checkbox1_status)
		{
			System.out.println("Checkbox 1 is not checked by default");
		}
		else {
			System.out.println("Checkbox 1 is checked by default");
		}
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}
	
	
	@Test
	public void testHovers() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Hovers']")).click();
		boolean status = driver.findElement(By.xpath("//h3")).isDisplayed();
		
		if(status) {
			System.out.println("Hover Page is dislayed");
		}
		
		
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}
	
	@AfterClass
	public void quitApplication() {
		driver.quit();
	}
	

}
