package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AxisBankLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElementByXPath("//*[@id='mgmenu-locateus']/div[2]/button[1]")).build().perform();
		
		//driver.findElementByClassName("");
		//driver.findElement(By.className(""));
		driver.findElementByXPath("//*[@class='pinkLogin hidden-xs']//child::a").click();
		
		driver.switchTo().window("https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/");
		
		//driver.close();
		
	}

}
