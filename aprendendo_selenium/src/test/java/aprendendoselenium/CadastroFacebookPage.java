package aprendendoselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CadastroFacebookPage {

	WebDriver driver;

	public CadastroFacebookPage(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroFacebookPage preencheNome(String nome) {
		driver.findElement(By.name("firstname")).sendKeys(nome);
		return this;
	}

	public CadastroFacebookPage preencheSobrenome(String sobrenome) {
		driver.findElement(By.name("lastname")).sendKeys(sobrenome);
		return this;
	}

	public CadastroFacebookPage preencheUsuario(String usu) {
    	
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(10, TimeUnit.SECONDS)
        		.pollingEvery(10, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        
        usuario.sendKeys(usu);        
        return this;
	}

	public CadastroFacebookPage preencheSenha(String senha) {
		driver.findElement(By.id("pass")).sendKeys(senha);
		return this;
	}

	public void clicaBotaoEntrar() {
		driver.findElement(By.id("u_0_2")).click();
	}

	public void logarComo(String user, String pass) {
		preencheUsuario(user).preencheSenha(pass).clicaBotaoEntrar();
	}
}
