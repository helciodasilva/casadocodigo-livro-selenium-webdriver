package aprendendoselenium;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janelas {

	@Test
	public void testeComJanelas() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		// Guarda o id da janela original e imprime no console
		String original = driver.getWindowHandle();
		System.out.println("Janela original: " + original);

		// Clica no botão que vai abrir uma nova janela
		driver.findElement(By.id("button1")).click();

		// Cria um array com todos os identificadores de janelas abertas
		Set<String> todasJanelas = driver.getWindowHandles();

		// Navega entre as janelas e compara se é janela atual
		// é igual à janela original
		for (String janela : todasJanelas) {
			if (!janela.equals(original)) {
				driver.switchTo().window(janela);
			}
		}

		String novaJanela = driver.getWindowHandle();
		System.out.println("Nova janela: " + novaJanela);

		driver.quit();
	}

}
