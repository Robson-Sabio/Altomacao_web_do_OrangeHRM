package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement CampoUsuario;
	
	@FindBy(name="password")
	private WebElement CampoSenha;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement BotaoLogin;
	
	
	
	public void informarCampoUsusario(String nome) {
		CampoUsuario.sendKeys(nome);	
	}
	public void informarCampoSenha(String senha) {
		CampoSenha.sendKeys(senha);
	}
	public void acionarBotaoLogin() {
		BotaoLogin.click();
	}
	
	public void realizarLogin(String nome, String senha) {
		CampoUsuario.sendKeys(nome);
		CampoSenha.sendKeys(senha);
		BotaoLogin.click();
	}
	
}
