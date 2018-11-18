package aprendendoselenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipalTest {

	private WebDriver driver;
	private PrincipalPage page;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		page = new PrincipalPage(driver);
	}

	@Test
	public void testaPesquisa() {
		page.pesquisaPor("Casa do Código");
		boolean contemTextoPesquisa = driver.getPageSource().contains("Casa do Código");
		Assert.assertTrue(contemTextoPesquisa);
	}

	@Test
	public void validaQuantidadeDeLinksExistentes() {
		Assert.assertEquals(47, page.quantidadeDeLinks());
	}
	
	@Test
	public void validaQtdeElementosComAmbasClasses() {
		Assert.assertEquals(8, page.qtdeElementosComAmbasClasses());
	}
}
