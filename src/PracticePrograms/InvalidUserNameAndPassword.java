package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUserNameAndPassword {
   public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement usrName = driver.findElement(By.id("username"));
		usrName.sendKeys("kshdkasho");
		Dimension d = usrName.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println("Height : "+height);
		System.out.println("Width : "+width);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("khsdfiuhau");
		Point p = pwd.getLocation();
		int xPosition = p.getX();
		int yPosition = p.getY();
		System.out.println("X Position of Password text field : "+xPosition);
		System.out.println("Y Position of Passwrod text field : "+yPosition);
		driver.findElement(By.id("login")).click();
		String loginErrorMsg = driver.findElement(By.xpath("//div[@class='auth_error']//b")).getAttribute("innerHTML");
		if(loginErrorMsg.contains("Invalid Login details or Your Password might have expired. ")) {
			System.out.println("Login error message is present");
		}else {
			System.out.println("Login error message is not present");
		}
		driver.close();
   }
}
