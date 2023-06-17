package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CadastroUsuarioPage extends LoginPage {
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement CampoUserRole;
	@FindBy(xpath="(//div[@role='option'])[3]")
	private WebElement OpcaoESS;
	@FindBy(xpath="(//div[@role='option'])[2]")
	private WebElement OpcaoAdmin;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement CampoStatus;
	@FindBy(xpath="(//div[@role='option'])[2]")
	private WebElement OpcaoEnabled;
	@FindBy(xpath="(//div[@role='option'])[3]")
	private WebElement OpcaoDisabled;
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	private WebElement CampoNomeDoEmpregador;
	@FindBy(xpath="//div[@class='oxd-autocomplete-dropdown --positon-bottom']/*[*='Odis  Adalwin']")
	private WebElement CampoOpcaoDeEmpregador;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement CampoNomeDoUsuario;
	@FindBy(xpath="(//input[@type=\"password\"])[1]")
	private WebElement CampoSenha;
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	private WebElement CampoConfirmarSenha;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement BotaoSalvar;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	private WebElement SalvoComSucesso;
	@FindBy(xpath="//div[*='PedroDaRocha']//i[@class=\"oxd-icon bi-trash\"]")
	private WebElement DeletarContaP1;
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")
	private WebElement DeletarContaP2;
	
	
	public void informarUserRole(String UserRole, String Status, String NomeEmpregado, String NomeUsuario, String Senha) {
		CampoUserRole.click();
		if(UserRole == "ESS"){
			OpcaoESS.click();
		}else{
			OpcaoAdmin.click();
		}
		CampoStatus.click();
		if(Status == "Enabled") {
			OpcaoEnabled.click();
		}else{
			OpcaoDisabled.click();
		}
		CampoNomeDoEmpregador.sendKeys(NomeEmpregado);
		EspereAte(CampoOpcaoDeEmpregador,10);
		CampoOpcaoDeEmpregador.click();
		CampoNomeDoUsuario.sendKeys(NomeUsuario);
		CampoSenha.sendKeys(Senha);
		CampoConfirmarSenha.sendKeys(Senha);
		BotaoSalvar.click();
	
	
	}

	public void confirmarCadastro() {
		EspereAte(SalvoComSucesso,20);
		assertEquals("Successfully Saved",SalvoComSucesso.getText());
	}
	public void deletarCadastro() {
		DeletarContaP1.click();
		DeletarContaP2.click();
	}
	public void confirmarCadastroDeletado() {
		EspereAte(SalvoComSucesso,20);
		assertEquals("Successfully Deleted",SalvoComSucesso.getText());
	}
}
