package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnWeb {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com");
		obj.manage().window().maximize();
		
		WebElement e= obj.findElement(By.xpath("//a[text()='Contribute']"));
		
		Actions act= new Actions(obj);
		
		WebElement web =obj.findElement(By.xpath("//a[text()='Web Sites']"));
		
		act.moveToElement(e).build().perform();
		web.click();
		
		
	}

}
