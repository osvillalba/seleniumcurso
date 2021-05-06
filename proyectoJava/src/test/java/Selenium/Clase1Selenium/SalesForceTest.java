package Selenium.Clase1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SalesForceTest {


    private WebDriver getSalesforceDriver()
    {System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://login.salesforce.com ");
        return driver;
    }

    @Test
    public void salesforceRegistrationTest() throws InterruptedException {
        WebDriver driver = getSalesforceDriver();


        Assert.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/");
        Assert.assertEquals(driver.getTitle(),"Iniciar sesión | Salesforce");

        System.out.println("Titulo --> " + driver.getTitle());
        System.out.println("URL --> " + driver.getCurrentUrl());

        driver.findElement(By.linkText("Utilizar dominio personalizado")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/");
        Assert.assertEquals(driver.getTitle(),"Utilizar dominio personalizado | Salesforce");


        //WebElement H2UtilizarDominioPersonalizadoElement = driver.findElement(By.tagName("h2"));
        //System.out.println(H2UtilizarDominioPersonalizadoElement.getText());
        //Assert.assertEquals(H2UtilizarDominioPersonalizadoElement.getText(),"Utilizar dominio personalizado");

        boolean useCustomDomianFound = false;
        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        for (WebElement h2: listaH2s){
            if (h2.getText().equals("Utilizar dominio personalizado")){
                useCustomDomianFound = true;
            }

        }

        Assert.assertTrue(useCustomDomianFound);

        driver.findElement(By.id("mydomain")).sendKeys("as");
        driver.findElement(By.name("Continue")).click();
        System.out.println("URL " + driver.getCurrentUrl());
        System.out.println("Title " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"American Securities - Iniciar sesión");

        driver.findElement(By.name("username")).sendKeys("testing@testing.com");
        driver.findElement(By.name("password")).sendKeys("holamundo");

        Thread.sleep(10000);
        driver.close();

    }


}
