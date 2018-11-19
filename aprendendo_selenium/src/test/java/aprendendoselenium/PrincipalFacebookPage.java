package aprendendoselenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PrincipalFacebookPage {
	@CacheLookup
	@FindBy(id = "email")
	private WebElement usuario;
	@CacheLookup
	@FindBy(id = "pass")
	private WebElement senha;
	@CacheLookup

	@FindBy(id = "u_0_5")
	private WebElement btnEntrar;
	@CacheLookup
	@FindBy(name = "websubmit")
	private WebElement btnAbrirConta;

	public void loginAs(String username, String password) {
		usuario.sendKeys(username);
		senha.sendKeys(password);
		btnEntrar.click();
	}

	public void clicaAbrirUmaConta() {
		btnAbrirConta.click();
	}
}
