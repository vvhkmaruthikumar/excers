package classWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		String URL="Z:\\Kishore\\Sample_HTML2.html";
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txt']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("Z:\\\\Kishore\\mysample.exe");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@value='Click']"));
		Thread.sleep(3000);
		driver.close();			
				
	}}
