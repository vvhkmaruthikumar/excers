package classWork;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://irctc.co.in");
		driver.findElementByXPath("//*[@id=\"topnavHP\"]/li[4]/a").click();
		String newwin=driver.getWindowHandle();
		System.out.println(newwin);
	//	driver.getCurrentUrl(newwin);
		System.out.println(driver.getCurrentUrl());
	//	for (String win: driver.getWindowHandles()) {
		//	System.out.println(win);
			//driver.switchTo().window(win);
		//	System.out.println(driver.getCurrentUrl());
			
		//}
	}

}
