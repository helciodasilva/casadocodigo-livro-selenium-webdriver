package aprendendoselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class DriverFactory {

	private static WebDriver driver;
	private static final String DRIVER_CHROME = "chrome";
	private static final String DRIVER_IE = "ie";
	private static final String DRIVER_FIREFOX = "firefox";
	private static final String HEADLESS_CHROME = "chrome-headless";

	private static final String DRIVER_PHANTOM = "phantom";

	public static WebDriver createDriver(String browserName) {
		if (browserName.equals(DRIVER_CHROME)) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals(DRIVER_IE)) {
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equals(DRIVER_FIREFOX)) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals(HEADLESS_CHROME)) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		} else if (browserName.equals(DRIVER_PHANTOM)) {
			System.setProperty("phantomjs.binary.path", "C:\\phantomjs");
			driver = new PhantomJSDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

}
