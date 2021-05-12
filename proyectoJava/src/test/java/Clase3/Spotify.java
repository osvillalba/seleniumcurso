package Clase3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spotify {

        private WebDriver getSpotifyDriver() {
            System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.spotify.com");
            return driver;

        }

        @Test
        public void xpathByPlaceHolderTest() throws InterruptedException {
            WebDriver driver = getSpotifyDriver();
            driver.findElement(By.xpath("//a[@href='https://www.spotify.com/ar/signup/']")).click();
        }

}
