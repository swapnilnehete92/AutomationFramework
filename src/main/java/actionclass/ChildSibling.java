package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildSibling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/admin/Desktop/java%20program/mega.html");
		obj.manage().window().maximize();
		
		WebElement src=obj.findElement(By.className("dropdown"));
		Actions act= new Actions(obj);
		act.moveToElement(src).build().perform();
		List<WebElement> l= obj.findElements(By.xpath("//div[@class='row']/div/h3"));
		for (WebElement u : l) {
			System.out.println(u.getText());
			}
		List<WebElement> ll= obj.findElements(By.xpath("//h3[contains(text(),'Category ')]/following-sibling::a"));
		for (WebElement web : ll) {
			System.out.println(web.getText());
			
		}
	}

}
