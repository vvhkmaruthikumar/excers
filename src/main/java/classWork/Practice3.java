package classWork;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		((JavascriptExecutor)driver).executeScript("window.open('https://gmail.com', '_blank'"); 

		
		
		
		
		
	    /*String baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");

	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");*/
		/*//driver.get("https://www.google.com");
		driver.get("https://mail.google.com/");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		driver.navigate().to("https://www.google.com");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("https://www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		
        driver.navigate().to("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().back();
        
        driver.findElement(By.tagName("Body")).sendKeys(Keys.CONTROL +"t");
        driver.navigate().to("https://www.facebook.com");
        Actions act=new Actions(driver);       
        act.keyDown(Keys.CONTROL).sendKeys(Keys.CONTROL+"t").keyUp(Keys.CONTROL).build().perform(); //Open new tab
        driver.get("https://www.facebook.com"); // open facebook
        act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform(); //switch back to google.com tab
		*/
	}

}
