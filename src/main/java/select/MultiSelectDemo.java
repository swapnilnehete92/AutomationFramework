package select;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/admin/Desktop/java%20program/New%20folder/multiselect.html");
		obj.manage().window().maximize();
		
		WebElement dropdown= obj.findElement(By.xpath("//select[@id='mySelect']"));
		Select sel= new Select(dropdown);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("Pear");
		Actions act= new Actions(obj);
		act.keyDown(Keys.CONTROL).perform();
		sel.selectByVisibleText("Banana");
		sel.selectByVisibleText("Orange");
		
		act.keyUp(Keys.CONTROL).perform();
	}

}
