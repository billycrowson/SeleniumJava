import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestNGTest1 {
    
    @Test
    public void sampleTestMethod() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get ("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//h1"));

        driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
