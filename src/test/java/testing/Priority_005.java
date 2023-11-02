package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_005 {

	WebDriver driver;

	@BeforeClass
	public void launchApplication() {

		System.out.println("Launch the Application");
	}


	@Test(priority=2)
	public void homePageValidation() {

		System.out.println("Testing homepage");
	}


	@Test(priority=1)
	public void signInPage() {

		System.out.println("Testing signInPage");
	}


	@Test(priority=0)
	public void signUpPage() {

		System.out.println("Testing signUpPage");
	}

	@Test(priority=3)
	public void testingCartPage() {

		System.out.println("Testing testingCartPage");
	}

	@AfterClass
	public void closeApplication() {
		System.out.println("Closing the Application");
	}

}
