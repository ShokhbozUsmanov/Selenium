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

public class iFrame_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/iframe");
    }
    @Test
    public void iFrameTask() {

//        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement textArea = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(textArea.isDisplayed());

        driver.switchTo().defaultContent()
        ;
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }

    @AfterMethod
    public void tearDownMethod(){driver.quit();}



}