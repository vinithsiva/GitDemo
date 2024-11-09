package PracticePrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[@class='browse']")).click();
		Thread.sleep(2000);
		Robot r = new Robot(); 
		String path = "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\uiuxTrainingPageScreenshot.png";
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null); 
		r.keyPress(KeyEvent.VK_CONTROL); 
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_CONTROL); 
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER); 
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//System.out.println("File Uploaded Successfully");
	}
}
