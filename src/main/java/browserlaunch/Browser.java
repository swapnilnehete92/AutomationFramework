package browserlaunch;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver obj;

	public String launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			obj = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geko.driver",
					"D:\\Firefox Driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			obj = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\edgedriver_win32\\msedgedriver.exe");
			obj = new EdgeDriver();
		}
		System.out.println(browsername);
		return browsername;
	}

	public String openURL(String url) {
		obj.get(url);
		System.out.println(url);
		return url;

	}

	public String click(String xpathvalue) {

		obj.findElement(By.xpath(xpathvalue));
		System.out.println(xpathvalue);
		return xpathvalue;

	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser("EDGE");

		b.openURL("file:///C:/Users/admin/Desktop/java%20program/New%20folder/select.html");
		b.click("//select[@id='cars']");

	}
}
