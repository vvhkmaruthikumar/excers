package classWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		//driver.findElementByXPath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a").click();
		driver.switchTo().frame(driver.findElementByXPath("//*[@id=\"content\"]/iframe"));
		WebElement element= driver.findElement(By.xpath("//*[@id='draggable\']/p"));
		WebElement subelement=driver.findElementByXPath("//*[@id='droppable']");
		Actions action=new Actions(driver);
		action.moveToElement(element).moveToElement(subelement).build().perform();
		action.dragAndDrop(element, subelement).build().perform();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//*[@id=\'sidebar\']/aside[1]/ul/li[1]/a").click();
		driver.switchTo().frame(driver.findElementByXPath("//*[@id=\"content\"]/iframe"));
		
		WebElement To=driver.findElementByXPath("//*[@id='draggable']");
		
		WebElement From=driver.findElementByXPath("//*[@id=\'draggable\']");
		action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		driver.getWindowHandles();
		/*driver.switchTo().defaultContent();
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[4]/a").click();
		driver.switchTo().frame(driver.findElementByXPath("//*[@id=\'content\']/iframe"));
		List <WebElement> li=driver.findElementsByXPath(".//*[@id='selectable']/li*.*");
		action.clickAndHold(li.get(0)).clickAndHold(li.get(2)).clickAndHold(li.get(3)).release().build().perform();
*/		
		Actions action1=new Actions(driver);
		

	}

}
