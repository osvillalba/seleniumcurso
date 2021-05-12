package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class spotifyTest {
    private WebDriver getSpotifyDriver()
    {
        System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.spotify.com/ar/signup/");
        return driver;
    }

    @Test
    public void xpathByPlaceHolderTest() throws InterruptedException {
        WebDriver driver = getSpotifyDriver();
       // driver.findElement(By.xpath("//a[@href='https://www.spotify.com/ar/signup/']")).click();
       //driver.findElement(By.xpath("//*[@href='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
       //driver.findElement(By.xpath("*//input[@name='email']")).sendKeys("gisela.test@gmail.com");
        //driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys("gisela.test@gmail.com");
        //driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("gisela.test@gmail.com");
        //driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys("holamundo");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='https://www.spotify.com/ar/signup/']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("gisela.test@gmail.com");



        //Thread.sleep(10000);
        //driver.close();

    }
}
