package classWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel {

	public static void main(String[] args) throws IOException {
	      File file =  new File("D:\\PhpCollab.xlsx");
	        FileInputStream NewFIle = new FileInputStream(file);
	        XSSFWorkbook NewWB = new XSSFWorkbook(NewFIle);
	        XSSFSheet sheet1 = NewWB.getSheet("CreateUser");
	        String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
	        
	        System.out.println("Data is "+data0);

	}

}
