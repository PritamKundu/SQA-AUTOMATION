import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
	 WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.get("http://pritamkundu.xyz");
     
		
	}

}
