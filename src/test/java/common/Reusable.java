package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObject.StackOverflowHomePage;

import java.io.FileReader;
import java.util.Properties;


public class Reusable {


	public WebDriver createDriverInstance(){

		WebDriver driver=null;
		if(getGlobalData("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if(getGlobalData("browser").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		return driver;
	}


	public String getGlobalData(String key){


		String value = null;
		try {
			FileReader reader = new FileReader("C:\\Eclipse_Project\\Test.learning.selenium\\testData.properties");
			Properties prop = new Properties();
			prop.load(reader);
			value = prop.getProperty(key);
		}
		catch(Exception e){}


		return value;
	}
	
	
	


}
