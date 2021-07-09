package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_page_web_locator {

private static WebElement element=null;
	
	// Email box web locator
	public static WebElement emailbox(WebDriver pritam)
	{
		element=pritam.findElement(By.name("Email"));
		return element;
	}
	
	// Password box web locator
	public static WebElement passwordbox(WebDriver pritam)
	{
		element=pritam.findElement(By.id("Password"));
		return element;
	}
	
	// Remember me web locator
	public static WebElement rememberme(WebDriver pritam)
	{
		element=pritam.findElement(By.id("RememberMe"));
		return element;
	}
	
	// sign in button web locator
	public static WebElement signinbutton(WebDriver pritam)
	{
		element=pritam.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		return element;
	}

}
