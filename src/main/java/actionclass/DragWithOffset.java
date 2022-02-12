package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragWithOffset {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com/draggable/");
		obj.manage().window().maximize();
		
		WebElement e=obj.findElement(By.xpath("//div[@id='content']/iframe"));
		obj.switchTo().frame(e);
		WebElement src=obj.findElement(By.id("draggable"));
		Actions act= new Actions(obj);
		
		act.dragAndDropBy(src, 190, 140).build().perform();

	}
}
