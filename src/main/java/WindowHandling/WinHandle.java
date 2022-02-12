package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();
		obj.get("https://www.naukri.com");
		obj.manage().window().maximize();

		String pw = obj.getWindowHandle();
		System.out.println(pw);

		Set<String> aw = obj.getWindowHandles();
		System.out.println(aw);

		for (String cw : aw) {
			if (!(cw.equals(pw))) {
				obj.switchTo().window(cw);
				System.out.println(obj.getTitle());
				obj.manage().window().maximize();
				obj.close();
			}

		}
		obj.switchTo().window(pw);
		obj.findElement(By.xpath("//div[text()='Companies']")).click();
		System.out.println(obj.getTitle());

		Set<String> a = obj.getWindowHandles();
		System.out.println(a);
		for (String c : a) {
			if (!(c.equals(a))) {

				obj.switchTo().window(c);
				System.out.println(obj.getTitle());

				

			}

		}
		obj.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']")).sendKeys("Java");
		 obj.findElement(By.xpath("//input[@class='sugInp w135']")).sendKeys("Pune");
	}
}
