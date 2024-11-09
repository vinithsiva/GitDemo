package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/handling-dynamic-selenium-webdriver.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To scroll down
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		
		//To scroll up
		js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(5000);
		
		//To scroll up to a particular webelement
		WebElement image = driver.findElement(By.xpath("//img[@data-lazy-src='https://www.guru99.com/images/2-2017/050217_0717_HandlingDyn7.png']"));
		js.executeScript("arguments[0].scrollIntoView(true)", image);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
