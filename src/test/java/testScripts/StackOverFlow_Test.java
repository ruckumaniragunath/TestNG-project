package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Reusable;
import pageObject.StackOverflowHomePage;


public class StackOverFlow_Test {
	private WebDriver driver=null;
	private Reusable reu;
	private StackOverflowHomePage SOF;


	@BeforeClass
	public void setUp(){
	reu=new Reusable();
	SOF = new StackOverflowHomePage();
	driver = reu.createDriverInstance();
	driver.get(reu.getGlobalData("StackOverflow_url"));
	
	
	}
	@Test
	public void test_Logo(){
		
	Assert.assertTrue(driver.findElement(SOF.stackOverflowLogo()).isDisplayed());
	
	}
	@Test
	public void testHeaderAbout(){
	Assert.assertTrue(driver.findElement(SOF.headerAbout()).isDisplayed());
	
	}
	@Test
	public void testHeaderProducts(){
	
	Assert.assertTrue(driver.findElement(SOF.headerProducts()).isDisplayed());
	}
	
	@Test
	public void testHeaderSearch(){
	
	Assert.assertTrue(driver.findElement(SOF.headerSearch()).isDisplayed());
	}
	
	@Test
	public void sendTextToSearch() throws InterruptedException{
	
	driver.findElement(SOF.headerSearch()).sendKeys(reu.getGlobalData("text"));
	Thread.sleep(5000);
	}
	
	
	@Test
	public void testHeaderLogin(){
	
	Assert.assertTrue(driver.findElement(SOF.headerLogin()).isDisplayed());
	}
	
	@Test
	public void testHeaderSignup(){
	
	Assert.assertTrue(driver.findElement(SOF.headerSignup()).isDisplayed());
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown(){
	driver.quit();
	}
	}
