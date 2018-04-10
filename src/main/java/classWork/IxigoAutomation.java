package classWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.findElementByXPath("//div[@class='orgn u-ib u-v-align-bottom u-text-left']/div/div/div[contains(text(),'From')]").click();
	}

}
