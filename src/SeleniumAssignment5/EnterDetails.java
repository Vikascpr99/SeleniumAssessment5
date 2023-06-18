package SeleniumAssignment5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReadAndWrite.ReadFromExcel;

public class EnterDetails {
	
	public void enteringDetails(WebDriver driver) throws Exception {
		ReadFromExcel re = new ReadFromExcel();
		WebElement search_by_city = driver.findElement(By.id("autoComplete__home"));
		String city = re.readData();
		search_by_city.sendKeys(city);
	}
	public void usingFirstSearchSuggestion(WebDriver driver) {
		WebElement search_by_suggestion = driver.findElement(By.id("autoComplete__home"));
		
		search_by_suggestion.sendKeys(Keys.ARROW_DOWN);
		//search.sendKeys(Keys.ARROW_DOWN);
		search_by_suggestion.sendKeys(Keys.ENTER);
	}
	
}
