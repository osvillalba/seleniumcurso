package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathTest {
    private WebDriver getNetflixDriver()
    {System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://www.netflix.com ");
        return driver;
    }

    @Test
    public void facebookPartiaLinksTest() throws InterruptedException {
        WebDriver driver = getNetflixDriver();

        //driver.findElement(By.xpath("//input[@autocomplete='email']")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/a")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(" gisela.villalba@gmail.com ");
        //input[@autocomplete='email']
    }

}
