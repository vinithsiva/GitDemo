package SeleniumFirstProgram;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserBasedOnUserInput {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = null;
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		if(userInput.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\ChromeDriverExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}else if (userInput.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\FirefoxDriver\\geckodriver-v0.35.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}
	}
}
