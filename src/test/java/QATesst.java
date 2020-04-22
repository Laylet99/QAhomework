
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class QATesst {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(QATesst.class);

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        logger.info("Драйвер начал работать");
    }
    @Test
    public void openPage() {
        driver.get("https://otus.ru/");
        logger.info("Открыта страница отус");
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
