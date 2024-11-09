package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablesPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		int k=1;
		List<WebElement> listOfRows = driver.findElements(By.tagName("tr"));
		List<WebElement> listOfColumns = driver.findElements(By.xpath("//tbody//tr["+k+"]//td"));
		
		for(int i=0; i<listOfRows.size(); i++) {
			System.out.println(listOfRows.get(i).getText());
			/*
			 * for(int j=1; j<listOfColumns.size(); j++) {
			 * System.out.println(listOfColumns.get(j).getText()); } k++;
			 */
		}
		
		driver.close();
	}
}
