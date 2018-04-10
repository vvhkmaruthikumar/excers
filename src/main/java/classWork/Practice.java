package classWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		// Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	driver.manage().window().maximize();
     
     	driver.findElementByXPath("//*[contains(@name,'cusid')]").sendKeys("53920");
     	
       driver.findElementByXPath("//*[contains(@name,'submit')]").click();
        
       /* driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
*/	}

}
