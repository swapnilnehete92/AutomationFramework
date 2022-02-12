
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver RSN= new ChromeDriver();
		
		RSN.get("https://www.facebook.com/");
	
		
		
		RSN.findElement(By.xpath("//input[@id='pass']")).sendKeys("Whatever@1234");
		
		RSN.findElement(By.xpath("//button[@name='login']")).click();

		String s=RSN.getTitle();
		System.out.println(s);
		RSN.manage().window().maximize();
		RSN.findElement(By.xpath("//input[@id='email']")).sendKeys("rupeshnehete92@gmail.com");
		RSN.close();
		
	}

}
