package PracticePrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksPractice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vinith Mythili\\\\Vinith\\\\Selenium\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		int brokenLinksCount = 0, NotBrokenLinksCount = 0;
		List<WebElement> listOfLinksInAPage = driver.findElements(By.tagName("a"));
		for(WebElement e : listOfLinksInAPage) {
			System.out.println("URL : "+e.getAttribute("href"));
			URL url = new URL(null, e.getAttribute("href"));
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			con.connect();
			if(con.getResponseCode()==200) {
				System.out.println(e.getAttribute("href")+" is not broken");
				NotBrokenLinksCount++;
			}else {
				System.out.println(e.getAttribute("href")+" is broken");
				brokenLinksCount++;
			}
		}
		System.out.println("Total links in a page : "+listOfLinksInAPage.size());
		System.out.println("Broken links : "+brokenLinksCount);
		System.out.println("Not broken links : "+NotBrokenLinksCount);
	}
}
