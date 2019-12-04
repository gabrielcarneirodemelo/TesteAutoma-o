package br.com.inmetrics.AvaliacaoAutomacao.selenium;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AberturaDePagina {

	@Test
	public void testeClicarNoBotao() throws InterruptedException {
		
		//Abre o navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gabriel Melo\\eclipse-workspace\\AvaliacaoAutomacao\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		
		//Acessa o site
		navegador.get("https://www.inmetrics.com.br/");
		
		//Seleciona a opção carreiras
		navegador.findElement(By.id("linkcarreiras")).click();
		
		//Aguarda 3 segundos para encerrar a animação de transição
		Thread.sleep(3000);
		
		//seleciona a opção confira nossas vagas
		navegador.findElement(By.linkText("confira nossas vagas")).click();
		
		//Aguarda mais 3 segundos para encerrar
		Thread.sleep(3000);
		
		//encera a navegação
		navegador.quit();
		
	}	
	
	
	

}
