package SeleniumFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\ChromeDriverExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.navigate().refresh();
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("vinithkumar.sivakumar@seleniumpractice.com");
		userName.clear();
		Thread.sleep(5000);
		userName.sendKeys("vinithkumar.sivakumar@seleniumpractice.com");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("vkmvkm");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='Submit']"));
		loginBtn.click();
		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPassword.click();
		Thread.sleep(5000);
		WebElement forgottenAccount = driver.findElement(By.partialLinkText("Forgotten"));
		forgottenAccount.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
