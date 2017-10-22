package Drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckBoxRadioButtonOperations {
	public WebElement element;

	public CheckBoxRadioButtonOperations(WebDriver driver) {
		element = driver.findElement(By.name("radio_4[]"));
		element.click();

		RadioButton(driver);

		CheckBox(driver);
	}
	
	
	private void CheckBox(WebDriver driver) {
		List<WebElement> oCheckBox = driver.findElements(By.name("checkbox_5[]"));
		for (int i = 0; i < oCheckBox.size(); i++) {
			System.out.println(oCheckBox.get(i).getAttribute("value"));
			String sValue = oCheckBox.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase("cricket ")) {
				oCheckBox.get(i).click();
				break;
			}
		}
	}

	private void RadioButton(WebDriver driver) {
		List<WebElement> oRadioButton = driver.findElements(By.name("radio_4[]"));

		for (WebElement webElement : oRadioButton) {
			System.out.println(webElement.getAttribute("value"));
		}
		boolean bValue = false;
		bValue = oRadioButton.get(0).isSelected();
		if (bValue = true)
			oRadioButton.get(2).click();
		else
			oRadioButton.get(0).click();
	}


}
