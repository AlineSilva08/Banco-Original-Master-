package Metodos;



import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;



	   public void clicar(By elemento) {



	       driver.findElement(elemento).click();



	   }



	   public void preencher(By elemento, String texto) {



	       driver.findElement(elemento).sendKeys(texto);



	   }



	   public void pausa(int tempo) throws InterruptedException {
	        Thread.sleep(tempo);
	    }



	   public void fecharNavegador() {
	        driver.quit();



	   }



	   public void abrirNavegador(String url) {
	        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(url);
	        driver.manage().window().maximize();



	   }

public void validartexto (String texto,By element) {

 String texto1 = driver.findElement(element).getText();
 assertEquals(texto1, texto);
	   
	}
}


	
