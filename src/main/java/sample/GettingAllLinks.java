package sample;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GettingAllLinks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List <WebElement>li =driver.findElements(By.tagName("a"));
		System.out.println("Number of Links"+li.size());
		for (WebElement We: li) {
			System.out.println(We.getText());
		}
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
		
	}

}
