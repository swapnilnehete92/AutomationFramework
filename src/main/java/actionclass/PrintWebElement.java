package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintWebElement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com");
		obj.manage().window().maximize();
		
		WebElement e=obj.findElement(By.xpath("//a[text()='Contribute']"));
		Actions act =new Actions(obj);
		act.moveToElement(e).build().perform();
		List<WebElement> l=obj.findElements(By.xpath("//a[text()='Contribute']/parent::li/ul/li/a"));
		
		for (WebElement web : l) {
			System.out.println(web.getText());
		}
	}

}
