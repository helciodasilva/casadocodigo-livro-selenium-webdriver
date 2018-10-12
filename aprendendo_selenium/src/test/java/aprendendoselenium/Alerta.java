package aprendendoselenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerta {

	private ChromeDriver driver;

	@Test
	public void inicializa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.cssSelector("#content > p:nth-child(7) > button")).click();

		// Aqui vai o código da espera.
		Thread.sleep(5000);

		Alert alerta = driver.switchTo().alert();
		alerta.accept();

		driver.quit();
	}
}
