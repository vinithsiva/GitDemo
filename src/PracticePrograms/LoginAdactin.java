package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdactin {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement usrName = driver.findElement(By.id("username"));
		usrName.sendKeys("vinith971403");
		String s1 = usrName.getAttribute("value");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Vks_1403");
		String s2 = pwd.getAttribute("value");
		driver.findElement(By.id("login")).click();
		if(driver.getCurrentUrl().contains("adactin")) {
			System.out.println("You are in adactin website");
		}else {
			System.out.println("Your are not in adactin website");
		}
		System.out.println("Username : "+s1);
		System.out.println("Password : "+s2);
		boolean isAdactinLogoDisplayed = driver.findElement(By.xpath("//body//table//tbody//tr/td//img[@src='img/AdactIn_logo.png']")).isDisplayed();
		System.out.println("Is Adactin Logo Displayed? : "+isAdactinLogoDisplayed);
		Thread.sleep(5000);
		driver.close();
		
		System.out.println("Git practice line");
		System.out.println("Git practice line develop-master");
	}
}
