package ReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumAssignment5.AmenitiesList;

public class ReadFromExcel {
	
		
	public String readData() throws Exception {	
	File src1 = new File("C:\\Users\\VK65778\\Downloads\\Book 6.xlsx");
	FileInputStream fis = new FileInputStream(src1);
	XSSFWorkbook input = new XSSFWorkbook(fis);
	XSSFSheet sheet1= input.getSheetAt(0);
	String CityName = sheet1.getRow(1).getCell(0).getStringCellValue();
	System.out.println(CityName);
	return CityName;
	
	}
	
	}

