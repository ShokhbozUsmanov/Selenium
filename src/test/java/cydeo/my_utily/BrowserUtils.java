package cydeo.my_utily;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {
    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException ignored){}
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
