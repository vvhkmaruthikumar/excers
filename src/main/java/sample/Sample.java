package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.findElementByXPath("//input[@class='c-input u-v-align-middle']").click();
		driver.findElementByXPath("//input[@class='c-input u-v-align-middle']").sendKeys("HYD - Hyderabad");
		driver.findElementByXPath("(//input[@class='c-input u-v-align-middle'])[2]").click();
		driver.findElementByXPath("(//input[@class='c-input u-v-align-middle'])[2]").sendKeys("DEL - New Delhi");
		driver.findElement(By.cssSelector(""));
				
		//driver.close();
		
		
	}

}
