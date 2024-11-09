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
import org.openqa.selenium.interactions.*;

public class ActionClassPractice {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();

		WebElement coursesDropDown = driver.findElement(By.linkText("COURSES"));

		Actions a = new Actions(driver);
		a.moveToElement(coursesDropDown).perform();

		Thread.sleep(2000);

		WebElement uiuxTraining = driver.findElement(By.xpath("//span[text()='UI / UX Training']"));
		a.click(uiuxTraining).perform();

		Thread.sleep(2000);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\uiuxTrainingPageScreenshot.png");
		FileUtils.copyFile(source, destination);

		driver.close();
	}
}
