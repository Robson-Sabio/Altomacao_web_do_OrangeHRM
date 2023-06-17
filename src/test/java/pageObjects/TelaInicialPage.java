package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {

	//BasePage
	public void acionarAbaAdmin() {
		AbaAdimin.click();
	}
	
	//ELEMENTOS
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement BotaoAdd;
	
	
	public void acionarBotaoAdd() {
		BotaoAdd.click();
	}
}
