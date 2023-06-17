package utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static WebDriver driver;
	
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
	
	
	public static void selecionar(WebElement selecion,String item) {
		Select select = new Select(selecion);
		select.selectByVisibleText(item);
	}
	
	public static String valorAleatorio() {
		
		int i,nrAleatorioVogal,nrAleatorioConsoante;
		String vogal [] = {"a","e","i","o","u",},vc = "" ,nome = "",consoante [] ={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","w","x","y","z"}; 
		
		Random random = new Random();
				for(i = 0 ; i <= 4; i++){
					nrAleatorioVogal = 0 + random.nextInt(4);
					nrAleatorioConsoante = 0 + random.nextInt(19);
					vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
					nome = nome + vc;
				}
					return nome;
	}
	public static void EspereAte(WebElement selecion,int tempo) {
		WebDriverWait wait = new WebDriverWait(driver,tempo);
		wait.until(ExpectedConditions.visibilityOf(selecion));
	}
	
	
}
