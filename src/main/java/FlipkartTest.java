import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver Flipkart= new ChromeDriver();
		Flipkart.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Flipkart.get("https://www.flipkart.com/");
		
		Flipkart.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9561828733");
		
		
		Flipkart.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("mh282797");
		
		Flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
		Flipkart.manage().window().maximize();
		
		Flipkart.close();
	}
	

}
