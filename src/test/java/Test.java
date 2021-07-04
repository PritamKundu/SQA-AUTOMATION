import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
	 WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.get("http://pritamkundu.xyz");
     
     //Thread.sleep(5000);
     
     //driver.close();
     
     System.out.println("Title of the page :" +driver.getTitle());
     System.out.println("Url of the page :"+driver.getCurrentUrl());
     System.out.println("Source code of the page "+driver.getPageSource());
     
     
     
	}


}
