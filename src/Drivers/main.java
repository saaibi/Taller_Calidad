package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class main {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://es-la.facebook.com";
		FireFooxDriver(url);
		IEDriver(url);
		ChomeDriver(url);

	}

	// Create a new instance of the Firefox driver
	private static void FireFooxDriver(String url) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		getDrivers(url, driver);
	}

	// Create a new instance of the Chrome driver
	private static void ChomeDriver(String url) throws InterruptedException {
		String exePath = "C:\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		getDrivers(url, driver);
	}

	// Create a new instance of the IE driver
	private static void IEDriver(String url) throws InterruptedException {
		String service = "C:\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		WebDriver driver = new InternetExplorerDriver();
		getDrivers(url, driver);

	}

	private static void getDrivers(String url, WebDriver driver) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
		driver.quit();
	}

}
