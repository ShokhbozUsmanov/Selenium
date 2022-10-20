package cydeo.day11;

import my_utily.BrowserUtils;
import my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GuruUploadTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
    }
    @Test
    public void guru_upload_test(){
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement upload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
        upload.sendKeys("C:\\Users\\User\\Downloads\\some-file.txt");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
        button.click();
        BrowserUtils.sleep(7);
        WebElement pass = driver.findElement(By.id("res"));
        String expected = "1 file\nhas been successfully uploaded.";
        String actual = pass.getText();
        Assert.assertEquals(actual,expected);
    }

}
