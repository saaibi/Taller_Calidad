package Drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelectOperations {
	public WebElement element;
	public Select oSelect;

	public DropDownMultipleSelectOperations(WebDriver driver) {
		// selectByVisibleText
		oSelect = new Select(driver.findElement(By.id("mm_date_8")));
		oSelect.selectByVisibleText("5");

		// selectByIndex
		oSelect = new Select(driver.findElement(By.id("dd_date_8")));
		oSelect.selectByIndex(15);

		// selectByValue

		oSelect = new Select(driver.findElement(By.id("yy_date_8")));
		oSelect.selectByValue("1996");

		// getOptions
		Select oSelect = new Select(driver.findElement(By.id("dropdown_7")));
		List<WebElement> elementCount = oSelect.getOptions();
		System.out.println(elementCount.size());
		for (WebElement webElement : elementCount) {
			System.out.println(webElement.getText());
		}
	}

}
