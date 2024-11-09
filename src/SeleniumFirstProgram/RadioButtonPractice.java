package SeleniumFirstProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@type='radio' and @name='vehicle']"));
		for(int i = 1; i<=listOfRadioButtons.size(); i++) {
			System.out.println(driver.findElement(By.xpath("//input[@type='radio' and @name='vehicle']["+i+"]")).getAttribute("value"));
		}
		driver.close();
	}
}
