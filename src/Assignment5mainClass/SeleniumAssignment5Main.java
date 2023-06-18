package Assignment5mainClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ReadAndWrite.writeAminity;
import SeleniumAssignment5.*;

public class SeleniumAssignment5Main {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		BrowserSetting bs = new  BrowserSetting();
		driver =bs.driverSettings("chrome");
		driver.get("https://www.oyorooms.com/");
		EnterDetails e = new EnterDetails();      
			e.enteringDetails(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/span/div/div/div[1]/div/div[2]/span")));
		e.usingFirstSearchSuggestion(driver);
		
		SelectBookingDate sbd = new SelectBookingDate();   sbd.chooseBookingDate(driver);
		
		AddOrDeleteRooms aodr = new AddOrDeleteRooms();    aodr.addRooms(driver);
		
		AddOrReduceGuest aorg = new AddOrReduceGuest();  	aorg.addGuestFromSecondRoom(driver);
		
		SearchHotel sh = new SearchHotel();                sh.searchHotel(driver);
		
		SortingRooms sr = new SortingRooms();              sr.sortByGuestRating(driver);
		sr.gettingDetailsOfFirstSortedHotel(driver); 
		
		AmenitiesList al = new AmenitiesList();            al.amenitiesList(driver);
		writeAminity wA = new writeAminity();              wA.ExcelWrite(driver);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
