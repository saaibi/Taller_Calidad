package Drivers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserNavigationCommandsDrivers {
	WebElement element;
	Select oSelect;

	public void BrowserCommand(String url, WebDriver driver) {
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("Title of the page is : " + title);
		System.out.println("Length of the title is : " + titleLength);
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened.");
		} else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);
		}
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("Total length of the Page Source is : " + pageSourceLength);
		driver.close();
	}

	public void NavigationCommands(String url, WebDriver driver) {
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.close();
	}
}
