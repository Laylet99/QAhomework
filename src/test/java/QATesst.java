
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class QATesst {
public static final Logger logger = LogManager.getLogger(QATesst.class);
   private WebDriver driver;


    @BeforeClass
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void  setUp() { driver = new ChromeDriver();}


        @After
        public void setDown () {
            if (driver != null) {
                driver.quit();
            }
        }
        @Test
    public void imilic() {
        driver.get("https://market.yandex.ru");
        driver.manage().timeouts().implicitlyWait ( 4, TimeUnit.SECONDS );

        driver.findElement(By.xpath());
    }




}

