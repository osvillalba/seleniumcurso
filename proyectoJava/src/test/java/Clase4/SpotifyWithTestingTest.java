package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpotifyWithTestingTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.spotify.com");
        //driver.get(" https://www.spotify.com/ar/signup/");
    }

    @Test
    public void registrationTest() throws InterruptedException {

        driver.get(" https://www.spotify.com/ar/signup/");

        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys(" test@test.com ");
        driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys(" test@test.com ");
        driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys(" holamundo ");
        driver.findElement(By.xpath("//*[@placeholder='Introduce un nombre de perfil.']")).sendKeys(" Test ");


    }
    @Test
    public void registrationTest2() throws InterruptedException {

        driver.get(" https://www.spotify.com/ar/signup/");

        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys(" test2@test.com ");
        driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys(" test2@test.com ");
        driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys(" holamundo ");
        driver.findElement(By.xpath("//*[@placeholder='Introduce un nombre de perfil.']")).sendKeys(" Test2 ");


    }
 /*   @Test
    public void cssSelectorByPlaceHolderTest() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='https://www.spotify.com/ar/signup/']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("gisela.test@gmail.com");

    }*/
    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}
