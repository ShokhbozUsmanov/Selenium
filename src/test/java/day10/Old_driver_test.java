package day10;
import my_utily.Driver;
import my_utily.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Old_driver_test {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // set up chrome and create WebDriver instance
        driver = Driver.getDriver();
    }

    @Test (priority = 1)
    public void googleTitle(){
        driver.get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test (priority = 2)
    public void yahooTitle(){
        driver.get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test (priority = 3)
    public void etsyTitle(){
        driver.get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) driver).getSessionId());
    }
}


