package aprendendoselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PrimeirosPassosComFirefox {
	WebDriver driver;

	@Before
	public void preCondicao(){
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	    driver.get("http://www.google.com.br");
	    driver.manage().window().maximize();
	  }

	@Test
	public void teste() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@After
	public void posCondicao() {
		driver.quit();
	}
}
