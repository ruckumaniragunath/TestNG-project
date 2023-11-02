package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IFrameLearning {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"url"})
	public void launchHeroupapp(String url) {
		System.out.println("Executed");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		System.out.println("Executed3");
	}
	
	@Test
	
	public void testIframe() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//body[@id='tinymce'])/p[text()='Your content goes here.']")).clear();
	
		driver.findElement(By.xpath("(//body[@id='tinymce'])/p")).sendKeys("Hellllooooooooo");
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//h3")).isDisplayed();
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.quit();
	}

}
