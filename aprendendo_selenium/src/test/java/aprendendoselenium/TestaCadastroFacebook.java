package aprendendoselenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaCadastroFacebook {

	private static CadastroFacebookPage facebook;
	private static WebDriver driver;

	@BeforeClass
	public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebook = new CadastroFacebookPage(driver);
	}

	@Test
	public void preencheNomeSobrenome() {
		facebook
			.preencheNome("José")
			.preencheSobrenome("da	Silva");
	}
}
