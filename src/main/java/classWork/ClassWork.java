package classWork;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	private static final JavascriptExecutor JavascriptExecutor = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		WebElement ele=driver.findElementByPartialLinkText("Partial Link Test");
		highlight(driver,ele);
		Thread.sleep(2000);
		ele.click();
		System.out.println("Partial Link Test Clicked");
		driver.navigate().back();
		System.out.println("Back to home page");
		jse.executeScript("window.scrollBy(250,100)", "");
		WebElement li=driver.findElementByLinkText("Link Test");
		highlight(driver,li);
		//Thread.sleep(2000);
		li.click();
		driver.navigate().back();
		WebElement fn=driver.findElementByName("firstname");
		
		HighlightMyElement(fn);
		highlight(driver,fn);
		fn.sendKeys("Maruthi");
		WebElement ln=driver.findElementByName("lastname");
		highlight(driver,ln);
		ln.sendKeys("Vinjamuri");
		WebElement se=driver.findElementByXPath("//*[@id=\"sex-1\"]");
		highlight(driver,se);
		se.click();
		WebElement ex=driver.findElementByXPath("//*[@id=\"exp-6\"]");
		highlight(driver,ex);
		ex.click();
		WebElement dt=driver.findElementById("datepicker");
		highlight(driver,dt);
		dt.sendKeys("12/12/2017");
		WebElement at1=driver.findElementById("tool-0");
		WebElement at2=driver.findElementById("tool-1");
		WebElement at3=driver.findElementById("tool-2");
		highlight(driver,at1);
		highlight(driver,at2);
		highlight(driver,at3);
		at1.click();
		at2.click();
		at3.click();
		List<WebElement> con=driver.findElementsById("continents");
		for (WebElement cn : con) {
			System.out.println(cn.getSize());
			boolean i=cn.isDisplayed();
			if (i=true) {
				System.out.println("Field Displayed");
			}
			else { 
				System.out.println("Field not Displayed");
				
				
			}
		}
		
	}
	private static void HighlightMyElement(WebElement fn) {
		JavascriptExecutor js = JavascriptExecutor;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');");
		
	}
	public static void highlight(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
	}

}
