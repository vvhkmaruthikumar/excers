package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='source']")).sendKeys("Ban");
		

	}

}
