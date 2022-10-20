package cydeo.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import cydeo.my_utily.WebDriverFactory;

public class Alert_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void alertTask1() {

        WebElement js = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        js.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        String actualResult = result.getText();
        String expectedResult = "You successfully clicked an alert";

        Assert.assertEquals(actualResult,expectedResult,"Result is not match");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}