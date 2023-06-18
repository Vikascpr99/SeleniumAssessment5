package ReadAndWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class writeAminity {
public void ExcelWrite(WebDriver driver) throws IOException {

XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet("Amentities");

List<WebElement> aminities= driver.findElements(By.xpath("//*[@id=\"1204\"]/div/div/div[2]"));

for(WebElement options:aminities) {

String am=options.getText();

sheet.createRow(0);
sheet.getRow(0).createCell(0).setCellValue(am);

}


File file=new File("C:\\Users\\VK65778\\Downloads\\Book 7.xlsx");
FileOutputStream fos=new FileOutputStream(file);
workbook.write(fos);



workbook.close();
}



}