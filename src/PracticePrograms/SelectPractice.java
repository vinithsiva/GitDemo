package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		//To print all the options and text
		WebElement coffeeDropdown = driver.findElement(By.name("coffee"));
		Select s = new Select(coffeeDropdown);
		List<WebElement> listOfAllOptions = s.getOptions();
		for(WebElement e : listOfAllOptions) {
			System.out.println("Value : "+e.getAttribute("value"));
			System.out.println("Text : "+e.getText());
		}
		
		//SelectByIndex
		s.selectByIndex(0);
		
		//SelectByValue
		s.selectByValue("cream");
		
		//SelectByVisibleText
		s.selectByVisibleText("With sugar");
		
		//getAllSelectedOptions()
		List<WebElement> getAllSelectedOptions = s.getAllSelectedOptions();
		for(int i=0; i<getAllSelectedOptions.size(); i++) {
			System.out.println(getAllSelectedOptions.get(i).getText());
		}
		
		//isMultiple()
		System.out.println(s.isMultiple());
		System.out.println("=============================================================");
		
		System.out.println("Coffee2 Dropdown");
		
		
		WebElement coffee2Dropdown = driver.findElement(By.name("coffee2"));
		Select s1 = new Select(coffee2Dropdown);
		s1.deselectByValue("cream");
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		List<WebElement> getAllSelectedOptions1 = s1.getAllSelectedOptions();
		for(int i=0; i<getAllSelectedOptions1.size(); i++) {
			System.out.println(getAllSelectedOptions1.get(i).getText());
		}
		
		System.out.println(s1.isMultiple());
		
		Thread.sleep(10000);
		
		driver.close();
	}
}
