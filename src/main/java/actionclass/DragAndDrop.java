package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com/droppable/");
		obj.manage().window().maximize();
		WebElement e = obj.findElement(By.xpath("//div[@id='content']/iframe"));
		obj.switchTo().frame(e);
		WebElement drag = obj.findElement(By.id("draggable"));
		WebElement dest = obj.findElement(By.id("droppable"));
		Actions act = new Actions(obj);
		act.dragAndDrop(drag, dest).build().perform();
		
		
	}

}
