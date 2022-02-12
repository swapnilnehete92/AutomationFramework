package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	
	WebDriver obj= new ChromeDriver();
	obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	obj.get("https://www.amazon.in/");
	obj.findElement(By.className("nav-a nav-a-2   nav-progressive-attribute ")).click();
}
}