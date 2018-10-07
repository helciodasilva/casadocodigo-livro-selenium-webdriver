package aprendendoselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class TestaHeadless {

	@Test
	public void testeComPhantomJS() {
		System.setProperty("phantomjs.binary.path", "C:\\IEDriverServer.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.com.br");
		String titulo = driver.getTitle();
		System.out.println(titulo);
		Assert.assertTrue(titulo.equals("Google"));
	}

	@Test
	public void chromeHeadless() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	public void tiraPrint(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("path/to/screenshot.png"));
	}

}
