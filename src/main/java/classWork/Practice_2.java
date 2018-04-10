package classWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String strTitle=driver.getTitle();
		System.out.println(strTitle);
		driver.findElementByXPath("//*[@id=\'lst-ib\']").sendKeys("Maruthi");
		boolean Presence = driver.findElementByXPath("//*[@id=\'lst-ib\']").isDisplayed();
		if (Presence=true) {
			System.out.println("Element is present in webpage");
		}else {
			System.out.println("Element is not present in webpage");
		}
		boolean Enabled =driver.findElementByXPath("//*[@id=\'lst-ib\']").isEnabled();
		if(Enabled=true) {
			System.out.println("Element is Enabled in Webpage");
		}else {
			System.out.println("Element is not enabled in Webpage");
		}
		/*boolean Selected =driver.findElementByXPath("//@[id=\'lst-ib\']").isSelected();
		if(Selected=true) {
			System.out.println("Element is selected in Webpage");
		}else {
			System.out.println("Element is not selected in Webpage");
		}*/
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	}

}
