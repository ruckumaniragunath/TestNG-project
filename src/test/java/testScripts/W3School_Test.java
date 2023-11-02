package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import common.Reusable;


public class W3School_Test {
private WebDriver driver;


@BeforeClass
public void setUp(){
Reusable reu=new Reusable();
driver = reu.createDriverInstance();
driver.get(reu.getGlobalData("w3School_url"));

}
@Test
public void test_theLogo(){
Assert.assertTrue(driver.findElement(By.xpath("//a[@id='w3-logo']")).isDisplayed());
}
@Test
public void test_the_SearchTextBox(){
Assert.assertTrue(driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")).isDisplayed());
}
@Test
public void title_url(){
Assert.assertEquals("HTML Tutorial" , driver.getTitle());
Assert.assertEquals("https://www.w3schools.com/html/" , driver.getCurrentUrl());
}
@AfterClass
public void tearDown(){
driver.quit();
}
}
