package cydeo.day12;

import cydeo.my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScriptExecutorPractice {
   WebDriver driver;
    @Test
    public void jsScroll(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       driver =  Driver.getDriver();
       driver.get("https://practice.cydeo.com/large");
       Actions action = new Actions(driver);

        WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        WebElement home = driver.findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[1].scrollIntoView(true)",cydeo,home);








    }
}
