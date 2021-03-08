import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class herokuappTestPOM {
    
    @Test
    public void sampleTestMethod() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get ("http://the-internet.herokuapp.com/");
}
