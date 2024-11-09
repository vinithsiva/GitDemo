package PracticePrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassContextClickMethodPractice {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		
		Actions a = new Actions(driver);
		a.contextClick(gmailLink).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(9000);
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent window ID : "+parentWindowId);
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId : windowIds) {
			if(!(parentWindowId.equals(windowId))) {
				System.out.println("Child Window ID : "+windowId);
				driver.switchTo().window(windowId);
				Thread.sleep(2000);
			}
		}
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\gmailPageScreenshot.png");
		FileUtils.copyFile(source, destination);
		
		driver.quit();
	}
}
