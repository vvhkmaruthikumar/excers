package sample;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		WebDriver driver;
		String ch=null;
		System.out.println("Enter String\n1.IE\n2.Chrome\n3.FireFox");
		System.out.println("Enter Your Choice");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()) {
			ch=sc.nextLine();
					
		}
		if(ch.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://www.google.com");
			System.out.println("IE browser selected successuffully ");	
		}
		else if(ch.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in");
		 System.out.println("Chrome browser selected successuffully ");	
		}
		else if(ch.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.flipkart.com");
			System.out.println("FireFox browser Opened");
			
		}else {
			System.out.println("Invalid Choice");
			System.exit(0);
		}
		sc.close();
	}

}
