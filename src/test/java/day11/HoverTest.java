package day11;

import my_utily.BrowserUtils;
import my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class HoverTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
    }
    @Test
    public void HoverTest(){
        driver.get("https://practice.cydeo.com/hovers");
        WebElement image1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement image2 = driver.findElement(By.xpath("(//img)[2]"));
        WebElement image3 = driver.findElement(By.xpath("(//img)[3]"));
        Actions user = new Actions(driver);
        user.moveToElement(image1).perform();
        user.moveToElement(image2).perform();
        user.moveToElement(image3).perform();

        System.out.println("image1.isDisplayed() = " + image1.isDisplayed());
        System.out.println("image2.isDisplayed() = " + image2.isDisplayed());
        System.out.println("image3.isDisplayed() = " + image3.isDisplayed());


    }
}
