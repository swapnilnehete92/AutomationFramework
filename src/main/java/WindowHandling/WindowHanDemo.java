package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHanDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		
		obj.get("https://www.toolsqa.com/");
		obj.manage().window().maximize();
		
	
		
		//WebElement e=obj.findElement(By.id("hamburger-menu"));
		
		//Actions act=new Actions(obj);
		
		//act.moveToElement(e);
		
		
		
		
		

		
				
				
					
				
			

		}
}
