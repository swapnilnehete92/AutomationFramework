package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver obj= new ChromeDriver();
		
		obj.get("https://www.seleniumeasy.com/selenium-tutorials/launching-firefox-browser-with-geckodriver-selenium-3");
	}
}
