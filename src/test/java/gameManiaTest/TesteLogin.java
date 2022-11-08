package gameManiaTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {

	private WebDriver driver;
	
	@Before  
	public void abrirBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost:4200/login");
	
	
	
	
	}
	@Test
	public void Testarlogin(){
	
		
		WebElement campoEmail = driver.findElement(By.id("cadastra-email"));
		WebElement campoSenha = driver.findElement(By.id("passw"));
		WebElement botao = driver.findElement(By.id("envia"));
		
		
		try {
			
			campoEmail.sendKeys("marcio@email.com");
			campoSenha.sendKeys("12345");
			botao.click();
			
			Thread.sleep(3000);
			
			campoEmail.clear();
			campoSenha.clear();
			Thread.sleep(3000);
			
			campoEmail.sendKeys("marcia@email.com");
			campoSenha.sendKeys("12345");
			botao.click();
			
			Thread.sleep(3000);
			
			campoEmail.clear();
			campoSenha.clear();

		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
	@After
	public void EncerrarTeste() {
		driver.quit();
}
}
