package pageObject;

import org.openqa.selenium.By;

public class StackOverflowHomePage {
	public By stackOverflowLogo() {
		return By.xpath("//a[text()='Stack Overflow']");
	}
	
	public By headerAbout() {
		return By.xpath("(//a[text()='About'])[1]");
	}
	public By headerProducts() {
		return By.xpath("(//a[contains(.,'Products')])[1]");
	}
	public By headerFor_Teams() {
		return By.xpath("(//a[text()='For Teams']]");
	}
	public By headerSearch() {
		return By.xpath("//input[@name='q']");
	}
	
	
	
	public By headerLogin() {
		return By.xpath("//a[text()='Log in']");
	}
	public By headerSignup() {
		return By.xpath("(//a[text()='Sign up'])[2]");
	}

}
