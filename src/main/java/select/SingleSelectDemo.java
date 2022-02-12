package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/admin/Desktop/java%20program/New%20folder/select.html");
		obj.manage().window().maximize();
		
		WebElement src= obj.findElement(By.xpath("//select[@id='cars']"));
		Select sel= new Select(src);
		
		sel.selectByVisibleText("Saab");
		
		boolean b=sel.isMultiple();
		System.out.println(b);
	}
}
