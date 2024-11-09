package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		List<WebElement> listOfTableHeaders = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
		List<WebElement> listOfTableData = driver.findElements(By.xpath("//div[@class='rt-tr-group']/descendant::div[@class='rt-td']"));
		int j=0;
		for(int i=0; i<listOfTableHeaders.size()-1; i++) {
		  System.out.print(listOfTableHeaders.get(i).getText() + " : ");
		  if(j < listOfTableData.size()-64) {
		    System.out.print(listOfTableData.get(j).getText());
		    j++;
		    System.out.println();
		  }
		}
		driver.close();
	}
}
