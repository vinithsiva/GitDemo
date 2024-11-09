package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Elements']/parent::div/preceding-sibling::div[@class='avatar mx-auto white']")).click();
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//button[@title='Expand all']")).click();
		List<WebElement> listOfCheckBoxes = driver.findElements(By.xpath("//span[text()='Home']/ancestor::ol//child::ol//li[@class='rct-node rct-node-parent rct-node-expanded']/child::span/descendant::span[@class='rct-title']"));
        for(int i=0; i<listOfCheckBoxes.size(); i++) {
        	System.out.println(listOfCheckBoxes.get(i).getText());
        }
	}
}
