package aprendendoselenium;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import categorias.NegativeTest;
import categorias.PositiveTest;
import categorias.SmokeTest;

public class LoginFacebookTest {
	private WebDriver driver;
	private PrincipalFacebookPage page;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		page = PageFactory.initElements(driver, PrincipalFacebookPage.class);
	}

	@Test
	@Category({PositiveTest.class,	SmokeTest.class})
	public void loginComSucesso() {
		page.loginAs("teste@gmail.com", "123456");
	}

	@Test
	@Category(NegativeTest.class)
	public void loginComSenhaInvalida() {
		page.loginAs("teste@gmail.com", "senhaInvalida.");
	}
}
