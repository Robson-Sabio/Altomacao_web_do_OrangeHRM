package pageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CadastroUsuarioPage extends LoginPage {
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement CampoUserRole;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/*[*='ESS']")
	private WebElement OpcaoESS;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/*[*='Admin']")
	private WebElement OpcaoAdmin;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement CampoStatus;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/*[*='Enabled']")
	private WebElement OpcaoEnabled;
	@FindBy(xpath="//div[@class='oxd-select-wrapper']/*[*='Disabled']")
	private WebElement OpcaoDisabled;
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	private WebElement CampoNomeDoEmpregador;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement CampoNomeDoUsuario;
	@FindBy(xpath="(//input[@type=\"password\"])[1]e")
	private WebElement CampoSenha;
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	private WebElement CampoConfirmarSenha;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement BotaoSalvar;
	
	
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
		
		CampoNomeDoUsuario.sendKeys(NomeUsuario);
		CampoSenha.sendKeys(Senha);
		CampoConfirmarSenha.sendKeys(Senha);
		BotaoSalvar.click();
	
	}

}
