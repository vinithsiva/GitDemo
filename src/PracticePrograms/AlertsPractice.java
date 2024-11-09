package PracticePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@type='submit' and @value='Sign in']")));
		
		Alert a = driver.switchTo().alert();
		/*
		 * TakesScreenshot tk = (TakesScreenshot) driver; File source =
		 * tk.getScreenshotAs(OutputType.FILE); File destination = new
		 * File("C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\alertBox.png"
		 * ); FileUtils.copyFile(source, destination);
		 */
		String alertBoxText = a.getText();
		System.out.println(alertBoxText);
		a.accept();
		
		driver.close();
	}
}
