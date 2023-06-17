package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroUsuarioPage;
import pageObjects.LoginPage;
import pageObjects.TelaInicialPage;


import static utils.Utils.*;







public class CadastroUsuarioSteps {

	@Dado("que esteja logado no sistema")
	public void queEstejaLogadoNoSistema() {
	    Na(LoginPage.class).realizarLogin("Admin", "admin123");;
	}

	@Quando("for cadastra um novo usuario")
	public void forCadastraUmNovoUsuario() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	    Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("preencher com os dados vaidos")
	public void breencherComOsDadosVaidos() {
	    Na(CadastroUsuarioPage.class).informarUserRole("Admin","Enabled", "S", "PedroDaRocha", "Ped@1234" );
	}

	@Entao("o sistema aprensenta o usuario cadastrado")
	public void oSistemaAprensentaOUsuarioCadastrado() {
	    Na(CadastroUsuarioPage.class).confirmarCadastro();
	}
	@Quando("estiver na aba Admin")
	public void estiverNaAbaAdmin() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("aperta em deletar o usuario")
	public void apertaEmDeletarOUsuario() {
	    Na(CadastroUsuarioPage.class).deletarCadastro();
	}

	@Entao("o sistema apresenta usuario deletado com sucesso")
	public void oSistemaApresentaUsuarioDeletadoComSucesso() {
	    Na(CadastroUsuarioPage.class).confirmarCadastroDeletado();
	}
	
}
