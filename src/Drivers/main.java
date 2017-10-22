package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class main {

	
	public static void main(String[] args) throws InterruptedException {
		
		String url1 = "http://www.DemoQA.com";
		String url2 = "http://www.DemoQA.com/registration";
		BrowserNavigationCommandsDrivers commandsDriver = new BrowserNavigationCommandsDrivers();
		commandsDriver.BrowserCommand(url1, FireFooxDriver(url1));
		commandsDriver.NavigationCommands(url1, FireFooxDriver(url1));
		WebElementCommands webElement = new WebElementCommands(FireFooxDriver(url2));
		CheckBoxRadioButtonOperations checboxRadioButton = new CheckBoxRadioButtonOperations(FireFooxDriver(url2));
		DropDownMultipleSelectOperations dropDownMultipleSelect = new DropDownMultipleSelectOperations(FireFooxDriver(url2));
	
		
		//FireFooxDriver(url);
		//IEDriver(url);
		//ChomeDriver(url);

	}

	// Create a new instance of the Firefox driver
	private static WebDriver FireFooxDriver(String url) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		return driver;
	}

	// Create a new instance of the Chrome driver
	private static WebDriver ChomeDriver(String url) throws InterruptedException {
		String exePath = "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	// Create a new instance of the IE driver
	private static WebDriver IEDriver(String url) throws InterruptedException {
		String service = "C:\\Users\\saaib\\Google Drive\\UNAC\\VIII semestre\\Calidad\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		WebDriver driver = new InternetExplorerDriver();
		driver.get(url);
		return driver;
	}

}
