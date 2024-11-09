package PracticePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorEnteringTextPractice{
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		//Highlight the username text field
		WebElement usernameTextField = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('style','background/; green; border: solid 2px red')", usernameTextField);
		
		//First method
		js.executeScript("document.getElementById('username').setAttribute('value','vinith')");
		Thread.sleep(1000);
		
		//To print the entered text
		Object ob = js.executeScript("return document.getElementById('username').getAttribute('value')");
		System.out.println(ob);
		
		//Second Method
		WebElement pwdTxtField = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('style','background: green; border: solid 2px red')", pwdTxtField);
		js.executeScript("arguments[0].setAttribute('value','vinith')", pwdTxtField);
		Thread.sleep(1000);
		
		//click the button - first method
		WebElement loginButton = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: solid 2px green')", loginButton);
		js.executeScript("arguments[0].click()", loginButton);
		
		File takeSceenShot = tk.getScreenshotAs(OutputType.FILE);
		File destinationFolder = new File("C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\Screenshots\\loginPageScreenShot.png");
		FileUtils.copyFile(takeSceenShot, destinationFolder);
		
		//click the button - second method
		//js.executeAsyncScript("document.getElementById('login').click()");
		
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[text()='Forgot Password?']")));
		Thread.sleep(1000);
		
		driver.close();
	}
}
