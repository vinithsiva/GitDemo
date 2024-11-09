package PracticePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropPractice {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source1 = driver.findElement(By.xpath("//a[@class='button button-orange']//parent::li[@id='credit']/following-sibling::li[@id='fourth'][1]"));
		WebElement destination1 = driver.findElement(By.xpath("//li[@class='placeholder']//parent::ol[@id='amt7']"));
		WebElement source2 = driver.findElement(By.xpath("//a[@class='button button-orange']//parent::li[@id='credit']/following-sibling::li[@id='fourth'][2]"));
		WebElement destination2 = driver.findElement(By.xpath("//li[@class='placeholder']//parent::ol[@id='amt8']"));
		
		Actions a = new Actions(driver);
		
		//First Method
		a.dragAndDrop(source1, destination1).perform();
		
		Thread.sleep(2000);
		
		//Second Method
		a.clickAndHold(source2).moveToElement(destination2).release().perform();
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\dragAndDropSchreenshot.png");
		FileUtils.copyFile(source, Destination);
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
