package Selenium.Clase1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class EjerciciosSelenium {
    @Test
    public void TestWindows() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }
    @Test
    public void bbcMundoTest(){
        String URL_BBC_MUNDO = "https://www.bbc.com/mundo";
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_BBC_MUNDO);

        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("---> Elementos H1: <---");
        for (WebElement elementoH1: listaH1s) {
            System.out.println(elementoH1.getText());
        }

        System.out.println("****************");

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de H2s del sitio son: "+ listaH2s.size());


        System.out.println("---> Elementos H2: <---");
        for (WebElement elementoH2: listaH2s) {
            System.out.println(elementoH2.getText());
        }
        System.out.println("****************");

        // <a>
        List<WebElement> listalinks = driver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links del sitio: " + listalinks.size());

        for (WebElement link : listalinks) {

            // No quiero que me muestre los links vacio entonces:
            if (link.getText().isEmpty() == false) {
                System.out.println("Link --->" + link.getText());
            }
        }
        driver.close();
    }


}



