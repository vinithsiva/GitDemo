package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValuePractice {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement importantNoteTxt = driver.findElement(By.xpath("//td[text()='Important Note:']"));
		String s1 = importantNoteTxt.getCssValue("font-size");
		System.out.println(s1);
		String s2 = importantNoteTxt.getCssValue("color");
		System.out.println(s2);
		String s3 = importantNoteTxt.getCssValue("font-weight");
		System.out.println(s3);
		String s4 = importantNoteTxt.getCssValue("font-family");
		System.out.println(s4);
		String s5 = importantNoteTxt.getCssValue("background");
		System.out.println(s5);
		driver.close();
		}
}