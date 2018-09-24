package aprendendoselenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebElement caixaPesquisa = driver.findElement(By.xpath("//*[@id='q']"));
		caixaPesquisa.clear(); // nesse caso nem precisa, mas apenas para treinar
		caixaPesquisa.sendKeys("teste");

		WebElement botaoEntrar = driver.findElement(By.id("idDoBotao"));
		botaoEntrar.click();
	}

	@Test
	public void validarTitulo() {
		//ACT
		String tituloAtual = driver.getTitle();
		String tituloEsperado = "Google";

		// Assert
		Assert.assertTrue("não são iguais", tituloAtual.equals(tituloEsperado));
		Assert.assertEquals("são diferentes", tituloAtual, tituloEsperado);
	}

	@After
	public void posCondicao() {
		driver.quit();
	}
}
