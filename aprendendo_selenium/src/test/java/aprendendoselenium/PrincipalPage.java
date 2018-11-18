package aprendendoselenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {

	@FindBy(name = "q")
	private WebElement caixaDePesquisa;

	@FindBys({
		@FindBy(tagName = "a") 
	})
	private List<WebElement> allLinks;

	@FindAll({
		@FindBy(className="gb_ke"),
		@FindBy(className="gb_R")
	})
	
	@CacheLookup
	@FindBy(id="nome")
	private	WebElement	campoNome;

	private List<WebElement> todosComAmbasClasses;
	
	// construtor inicializando os elementos
	public PrincipalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void pesquisaPor(String minhaPesquisa) {
		caixaDePesquisa.sendKeys(minhaPesquisa);
		caixaDePesquisa.submit();
	}
	
	public int quantidadeDeLinks() {
		return allLinks.size();
	}
	
	public int qtdeElementosComAmbasClasses() {
		return todosComAmbasClasses.size();
	}
	
	public void digitaNome(String nome) {
		String conteudoOriginal = campoNome.getText();
		campoNome.clear();
		campoNome.sendKeys(nome);
	}
}
