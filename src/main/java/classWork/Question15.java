package classWork;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class Question15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String ParnetWindow=driver.getWindowHandle();
		String a = "window.open('http://facebook.com','_blank');";
		((JavascriptExecutor)driver).executeScript(a);
		String url="http://excers.com";
		System.out.println(driver.getCurrentUrl());
		Set <String> allwin = driver.getWindowHandles();
		//driver.getWindowHandle();
		
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		for (String eachwin : allwin) {
			driver.switchTo().window(eachwin);
			String curl=driver.getCurrentUrl();
			if (curl.equals(url)) {
				driver.switchTo().window(ParnetWindow);
				driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Selenium");
				
			}
			
		}
		
	}

}
;