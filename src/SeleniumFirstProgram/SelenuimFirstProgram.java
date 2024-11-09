package SeleniumFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimFirstProgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\ChromeDriverExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.youtube.com/");
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.close();
	}
}
