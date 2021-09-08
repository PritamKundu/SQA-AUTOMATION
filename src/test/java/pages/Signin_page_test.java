package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Signin_page_web_locator;

public class Signin_page_test {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver pritam= new ChromeDriver();
		
		// Url visit
		pritam.get("https://nexchar.com/signout");
		
		// email box test method
		Signin_page_web_locator.emailbox(pritam).sendKeys("hamidsaymon9@gmail.com");
		
		// password box test method
		Signin_page_web_locator.passwordbox(pritam).sendKeys("Abc12345");
		
		// remember me test method
		Signin_page_web_locator.rememberme(pritam).click();
		
		// sign in button test method
		Signin_page_web_locator.signinbutton(pritam).click();
		
		
	}
}
