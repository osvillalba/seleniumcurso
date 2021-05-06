package Selenium.Clase1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumClase1 {

    @Test
    public void facebookLinksTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("¿Has olvidado la contraseña?")).click();

        Thread.sleep(5000);
        driver.close();
    }
    private WebDriver getFacebookDriver()
        {System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://www.facebook.com ");
        return driver;
    }

    @Test
    public void facebookPartiaLinksTest() throws InterruptedException {
        WebDriver driver = getFacebookDriver();
       /* System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");*/

        System.out.println("Titulo --> " + driver.getTitle());
        System.out.println("URL --> " + driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");

        driver.findElement(By.partialLinkText("¿Has olvidado")).click();

        System.out.println("Se ha clickeado Oldaste tu contraseña....");

        System.out.println("Titulo --> " + driver.getTitle());
        System.out.println("URL --> " + driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(), "¿Has olvidado la contraseña? | No puedo entrar | Facebook");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");


        Thread.sleep(5000);
        driver.close();


    }
    @Test
    public void facebookRegistrationTest() throws InterruptedException {
        WebDriver driver = getFacebookDriver();

        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        // si el driver no puedo encontrar el elemento.. entonces hay dos posibilidades
        // 1. se esta localizando mal el elemento.. es decir, no existe ese name en este caso..
        // 2. los elementos no estan cargandos en el sitio cuando el driver va a buscarlos ..
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Jhon");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("test@qa.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@qa.com");
        driver.findElement(By.id("password_step_input")).sendKeys("holamundo");


        WebElement daysElement = driver.findElement(By.name("birthday_day"));
        WebElement monthElement = driver.findElement(By.name("birthday_month"));
        WebElement yearElement = driver.findElement(By.name("birthday_year"));


       Select daySelect = new Select(daysElement);
       Select monthSelect = new Select(monthElement);
       Select yearSelect = new Select(yearElement);


       daySelect.selectByIndex(20);
       monthSelect.selectByVisibleText("ago");
       yearSelect.selectByValue("1992");


        List<WebElement> listaSexos = driver.findElements(By.name("sex"));
        Assert.assertEquals(listaSexos.size(), 3);

        WebElement sexoMascElement = listaSexos.get(1);
        sexoMascElement.click();

       /* WebElement sexoFemeElement = listaSexos.get(2);
        sexoFemeElement.click(); */

     /*   WebElement sexoPersElement = listaSexos.get(3);
        sexoPersElement.click();*/

       Thread.sleep(10000);
       driver.close();

    }

/*https://www.guru99.com/checkbox-and-radio-button-webdriver.html*/

}
