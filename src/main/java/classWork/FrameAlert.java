package classWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("/html/body/button").click();
	Thread.sleep(5000);
	Alert alt=driver.switchTo().alert();
	//alt.dismiss();
	String str="Excers";

	alt.sendKeys(str);
	
	Thread.sleep(2000);
	alt.accept();
	
	String txt=driver.findElementByXPath("//*[@id='demo']").getText();
	if (txt.contains(str)) {
		System.out.println("Enter String is preseneted in the text box");
	
	}
	driver.switchTo().defaultContent();
	driver.findElementByXPath("//*[@id='tryhome']").click();

	driver.findElementByXPath("//*[@id='tryhome']");
	//driver.close();
	//driver.quit();
	}

}
