package cydeo.day7;

import cydeo.my_utily.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindow {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/windows");
    }
    @Test
    public void multiple_windows_test(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement click = driver.findElement(By.xpath("//a[.='Click Here']"));
        click.click();


        WebElement cydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        cydeo.click();
        Set<String> allWindows = driver.getWindowHandles();
        for(String each : allWindows){
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = "+driver.getTitle());
            if(driver.getTitle().equals("Cydeo")){
                break;
            }
        }
        actualTitle = driver.getTitle();
        expectedTitle = "Cydeo";
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
