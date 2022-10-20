package cydeo.day6;
import my_utily.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Window_Practice {
        WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/windows");
    }
    @Test
    public void windowTask(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Before opening new window "+actualTitle);
        WebElement click = driver.findElement(By.xpath("//a[.='Click Here']"));
        click.click();

        actualTitle = driver.getTitle();
        System.out.println("After opening new window "+actualTitle);

        for (String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        actualTitle = driver.getTitle();
        String expectedTitleAfterClick = "New Window";
        Assert.assertEquals(actualTitle,expectedTitleAfterClick);


    }


    @AfterMethod
    public void tearDownMethod(){driver.quit();}







}
