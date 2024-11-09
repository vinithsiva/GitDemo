package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'selenium')]//child::b")).getText());
		List<WebElement> printSearchResults = driver.findElements(By.xpath("//span[contains(text(),'selenium')]//b"));
		System.out.println(printSearchResults.size());
		for(WebElement e : printSearchResults) {
			System.out.println("selenium "+e.getText());
		}
		/*
		 * List<WebElement> listOfSearchResults =
		 * driver.findElements(By.xpath("//span[contains(text(),'selenium')]")); sysout
		 * listOfSearchResults.get(listOfSearchResults.size()-1).click();
		 */
		Thread.sleep(5000);
		driver.close();
	}
}
