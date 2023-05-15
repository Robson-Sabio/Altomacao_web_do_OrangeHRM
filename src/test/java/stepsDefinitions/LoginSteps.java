package stepsDefinitions;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	
	@Quando("informar um login com os dados invalidos")
	public void informarUmLoginComOsDadosInvalidos() {
		Na(LoginPage.class).informarCampoUsusario(valorAleatorio());
		Na(LoginPage.class).informarCampoSenha(valorAleatorio());
	}

	@Quando("informar um login com os dados validos")
	public void informarUmLoginComOsDadosValidos() {
		Na(LoginPage.class).informarCampoUsusario("Admin");
		Na(LoginPage.class).informarCampoSenha("admin123");
	}

	@Quando("aperta o botao de logar")
	public void apertaOBotaoDeLogar() {
	    Na(LoginPage.class).acionarBotaoLogin();
	}
    
	@Entao("o sistema exibe usuario invalido")
	public void oSistemaExiberUsuarioInvalido() {
	    assertEquals("Invalid credentials", driver.findElement(By.xpath("//p[contains(.,'Invalid')]")).getText());
	
	}
	@Entao("o sistema exibe usuario logado")
	public void oSistemaExiberUsuarioLogado() {
		assertEquals("Dashboard", driver.findElement(By.xpath("//h6[@class]")).getText());
	}
	
}
