package cydeo.day12;

import my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YouTubeCatch {
    WebDriver driver;
    @BeforeMethod
    public void SetUpMethods(){
        driver = Driver.getDriver();
    }
    @Test
    public void YouTube(){

        driver.get("https://www.youtube.com/");
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Eminem");
        WebElement lupa = driver.findElement(By.id("search-icon-legacy"));
        lupa.click();
        WebElement spirit = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        spirit.click();




    }


}
