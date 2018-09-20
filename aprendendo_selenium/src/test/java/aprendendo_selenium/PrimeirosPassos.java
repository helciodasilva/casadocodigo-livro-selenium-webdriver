package aprendendo_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {

	WebDriver driver;

	@Before
	public void preCondicao() {
		// apenas define o local do driver
		// o primeiro parâmetro é fixo
		// no segundo você digita o caminho do diretório onde descompactou o chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
