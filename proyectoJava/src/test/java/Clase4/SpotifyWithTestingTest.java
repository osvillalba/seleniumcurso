package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

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
    @Parameters({"tagName"})
    public void parametersFromTestingXML(@Optional("a") String tagNameParameter) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Se van imprimir todos los " + tagNameParameter);
        List<WebElement> tagElementList = driver.findElements(By.tagName(tagNameParameter));
    for (WebElement elemento :  tagElementList){
        System.out.println("--> " + elemento.getText());
    }

    }
    @Test
    @Parameters({"username"})
    public void cssSelectorByPlaceHolderTest(@Optional("qa@qa.com") String testEmail) throws InterruptedException {


        //driver.findElement(By.xpath("*//input[@name='email']")).sendKeys("testing@qa.com");
        //driver.findElement(By.cssSelector("a[href='https://www.spotify.com/ar/signup/']")).click();
        //driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("gisela.test@gmail.com");
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/ar/signup/']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Introduce tu correo electrónico.']")).sendKeys("test@abd.com ");

    }

    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}
