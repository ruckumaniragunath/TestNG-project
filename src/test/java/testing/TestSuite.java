package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestSuite {

	WebDriver driver;

	@BeforeSuite()
	public void launchApplication() {

		System.out.println("Launch the Application");
	}


	@AfterSuite
	public void closeApplication() {
		System.out.println("Closing the Application");
	}
}
