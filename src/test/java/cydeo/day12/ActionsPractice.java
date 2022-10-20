package cydeo.day12;

import my_utily.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsPractice {
    WebDriver driver;
   @BeforeMethod
    public void SetUpMethods(){
       driver = Driver.getDriver();
   }

   @Test
    public void task_and_test(){
       driver.get("https://practice.cydeo.com");

        Actions action = new Actions(driver);

       JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

       WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
       action.moveToElement(cydeo).perform();
       WebElement home = driver.findElement(By.xpath("//a[.='Home']"));
       action.moveToElement(home).perform();
       action.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

driver.quit();


   }
}
