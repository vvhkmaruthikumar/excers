package classWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAlert {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
			driver.manage().window().maximize();
			// This step will result in an alert on screen
			WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

			Alert confirmationAlert = driver.switchTo().alert();
			String alertText = confirmationAlert.getText();
			System.out.println("Alert text is " + alertText);
			Thread.sleep(3000);
			confirmationAlert.dismiss();
		}

	}


