package classWork;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetTest {
    public static void main(String[] args) throws Exception  {
        // TODO Auto-generated method stub
/*        File file =  new File("D:\\PhpCollab.xlsx");
        FileInputStream NewFIle = new FileInputStream(file);
        XSSFWorkbook NewWB = new XSSFWorkbook(NewFIle);
        XSSFSheet sheet1 = NewWB.getSheet("CreateUser");
        String data0 = sheet1.getRow(4).getCell(4).getStringCellValue();
        
        System.out.println("Data is "+data0);
        */
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://localhost/phpcollab/projects/viewproject.php?id=4&PHPSESSID=1e270bdd25e30244786414ff060347e0");
		
		driver.findElementByXPath("//*[@id='wbTuu']/table[1]/tbody/tr/td[1]/a").click();
		
    }
}