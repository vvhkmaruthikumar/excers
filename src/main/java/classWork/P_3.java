package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl="http://www.popuptest.com/popuptest2.html";
		String tagName="";
		//driver.get(baseUrl);
		driver.navigate().to(baseUrl);
		//tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//System.exit(0);
		driver.quit();
	}

}
