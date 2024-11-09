package SeleniumFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class SeleniumMethodsPractice {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinith Mythili\\Vinith\\Selenium\\FirefoxDriver\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //get()
        driver.get("https://www.youtube.com/");
        
        //getCurrentUrl()
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is "+currentUrl);
        
        //getTitle()
        String titleOfWebPage = driver.getTitle();
        System.out.println("Title of the webpage is "+titleOfWebPage);
        
        //getPageSource()
        String pageSource = driver.getPageSource();
        //System.out.println("Page source is /n"+pageSource);
        
        //getWindowHandle()
        String idOfTheWindow = driver.getWindowHandle();
        System.out.println("ID of the current window is "+idOfTheWindow);
        
        //deleteAllCookies()
        driver.manage().deleteAllCookies();
        
        //set the size of the window
        Dimension d = new Dimension(500, 500);
        driver.manage().window().setSize(d);
        Thread.sleep(5000);
        
        //set the position of the window
        Point p = new Point(250, 250);
        driver.manage().window().setPosition(p);
        Thread.sleep(5000);
        
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        //navigate to next page
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        
        //navigate to previous page
        driver.navigate().back();
        Thread.sleep(5000);
        
        //navigate to next page
        driver.navigate().forward();
        Thread.sleep(5000);
        
        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        //close()
        driver.close();
	}
}
