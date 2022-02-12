import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver obj= new ChromeDriver();
	
	
	
	obj.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
	
	
}
}
