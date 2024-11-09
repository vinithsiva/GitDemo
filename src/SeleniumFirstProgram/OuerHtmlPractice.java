package SeleniumFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OuerHtmlPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		WebElement outerHtml = driver.findElement(By.id("Welcome_to_Wikipedia"));
		String s1 = outerHtml.getAttribute("outerHTML");
		System.out.println(s1);
		String s2 = outerHtml.getAttribute("innerHTML");
		System.out.println(s2);
		driver.close();
	}
}
