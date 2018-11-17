package aprendendoselenium;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class TestesComFaker {

	private static WebDriver driver;

	@BeforeClass
	public static void antesDeTudo() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void cadastroFacebook() {
		Faker faker = new Faker();
		driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
		driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
		driver.findElement(By.name("reg_email__")).sendKeys(faker.internet().emailAddress());
	}
}
