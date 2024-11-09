package SeleniumFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		WebElement chennaiIcon = driver.findElement(By.xpath("//span[text()='Chennai']"));
		chennaiIcon.click();
		Thread.sleep(4000);
		WebElement selectionPanel = driver.findElement(By.xpath("//a[contains(text(),'Mov')]"));
		selectionPanel.click();
		Thread.sleep(4000);
		driver.navigate().back();
		WebElement selectionPanel1 = driver.findElement(By.xpath("//a[contains(@href,'/c/stream')]"));
		selectionPanel1.click();
		driver.navigate().back();
		WebElement openCitiesPanel = driver.findElement(By.xpath("//div[contains(@id,'common-header-region')]//child::span[1]"));
        openCitiesPanel.click();
		WebElement selectMumbaiCityByImmediateChild = driver.findElement(By.xpath("//ul//child::li[1]"));
		selectMumbaiCityByImmediateChild.click();
		openCitiesPanel.click();
		WebElement selectDelhiCityByParentAndAncestor = driver.findElement(By.xpath("//span[text()='Delhi-NCR']//parent::div/ancestor::li"));
		selectDelhiCityByParentAndAncestor.click();
		openCitiesPanel.click();
		WebElement selectChandigarhCityByDescendant = driver.findElement(By.xpath("//ul/descendant::span[text()='Chandigarh']"));
		selectChandigarhCityByDescendant.click();
		openCitiesPanel.click();
		WebElement selectPuneCityByFollowingSibling = driver.findElement(By.xpath("//div/descendant::ul//child::li[1]/following-sibling::li//descendant::div//child::span[text()='Pune']"));
		selectPuneCityByFollowingSibling.click();
		openCitiesPanel.click();
		WebElement selectAhmedabadCityByPrecedingSibling = driver.findElement(By.xpath("//span[text()='Kochi']/ancestor::li/preceding-sibling::li/descendant::div//child::span[text()='Ahmedabad']"));
		selectAhmedabadCityByPrecedingSibling.click();
	}
}
