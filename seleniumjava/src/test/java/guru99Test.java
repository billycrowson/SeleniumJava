import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.*;


public class guru99Test {
    
    @Test
    public void sampleTestMethod() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get ("http://the-internet.herokuapp.com/");

        



    }

}