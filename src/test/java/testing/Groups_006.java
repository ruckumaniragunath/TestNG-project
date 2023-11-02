package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups_006 {

	WebDriver driver;

	@BeforeSuite
	public void launchApplication() {

		System.out.println("Launch the Application");
	}


	@Test(groups= {"regression"})
	public void homePageValidation() {

		System.out.println("Testing homepage");
	}


	@Test(groups= {"regression"})
	public void signInPage() {

		System.out.println("Testing signInPage");
	}


	@Test(groups= {"smoke"})
	public void signUpPage() {

		System.out.println("Testing signUpPage");
	}

	@Test(groups= {"E2E"})
	public void testingCartPage() {

		System.out.println("Testing testingCartPage");
	}

	@AfterSuite
	public void closeApplication() {
		System.out.println("Closing the Application");
	}

}
