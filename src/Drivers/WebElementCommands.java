package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementCommands {
	public WebElement element;

	public WebElementCommands(WebDriver driver) {
		// Clear and SendKeys
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("ToolsQA");

		// isDisplayed
		boolean staus = driver.findElement(By.id("username")).isDisplayed();
		System.out.println("isDisplayed : " + staus);

		// isEnabled
		element = driver.findElement(By.id("username"));
		boolean status = element.isEnabled();
		if (status) {
			element.sendKeys("Hola este es mi username");
		}

		// isSelected
		boolean staus2 = driver.findElement(By.id("mm_date_8")).isSelected();
		System.out.println("isSelected : " + staus2);

		// submit
		driver.findElement(By.name("pie_submit")).submit();

		// getText
		element = driver.findElement(By.id("piereg_passwordStrength"));
		String linkText = element.getText();
		System.out.println("GetText : " + linkText);

		// getTagName
		String tagName = driver.findElement(By.id("username")).getTagName();
		System.out.println("GetTagName : " + tagName);

		// getAttribute
		element = driver.findElement(By.className("piereg_validate[required,custom[email]]"));
		String attValue = element.getAttribute("name");
		System.out.println("GetAttribute : " + attValue);

		// getSize
		element = driver.findElement(By.id("name_3_firstname"));
		Dimension dimensions = element.getSize();
		System.out.println("Height :" + dimensions.height + "  Width : " + dimensions.width);

		// getLocation
		WebElement element = driver.findElement(By.name("radio_4[]"));
		Point point = element.getLocation();
		System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);

		// click
		// driver.findElement(By.linkText("ToolsQA")).click();
	}
}