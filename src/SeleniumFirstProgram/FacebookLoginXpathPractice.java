package SeleniumFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginXpathPractice {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\ChromeDriverExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement signUpForFacebook = driver.findElement(By.linkText("Sign up for Facebook"));
		signUpForFacebook.click();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		maleRadioButton.click();
		Thread.sleep(5000);
		boolean isMaleRadioButtonSelected = maleRadioButton.isSelected();
		if(isMaleRadioButtonSelected==true) {
			System.out.println("Male radio button is selected");
		}else {
			System.out.println("Male radio button is not selected");
		}
		driver.navigate().back();
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		boolean isUserNameTxtBoxEnabled = userName.isEnabled();
		if(isUserNameTxtBoxEnabled==true) {
			System.out.println("Username text box is enabled to print");
		}else {
			System.out.println("Username text box is not enabled to print");
		}
		userName.sendKeys("vinithkumar.sivakumar@gmail.com");
		String s = userName.getAttribute("value");
		System.out.println(s);
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div/div[1]/input"));
		password.sendKeys("password");
		String s1 = password.getAttribute("value");
	    System.out.println(s1);
		Thread.sleep(5000);
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='Submit']"));
		loginBtn.click();
		Thread.sleep(5000);
		boolean faceBookLogo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(faceBookLogo==true) {
			System.out.println("Facebook logo is displayed");
		}else {
			System.out.println("Facebook logo is not displayed");
		}
		driver.close();
	}
}
