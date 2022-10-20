package cydeo.day6;

import my_utily.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void dropdownTask4(){

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByVisibleText("Illinois");
        selectState.selectByValue("VA");
        selectState.selectByIndex(5);

        String actualFinalOption =selectState.getFirstSelectedOption().getText();
        String expectedFinalOption = "California";
        Assert.assertEquals(actualFinalOption,expectedFinalOption,"Final selected option verification FAILED");
        int index = -1;
        for(WebElement eachState : selectState.getOptions()){
            index++;
            if(eachState.getText().equals("California")){
                System.out.println(index+" is California index");
            }
        }

    }
    @Test
    public void dropdownTask5() throws InterruptedException {

        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        for (WebElement eachLanguage : selectLanguage.getOptions()) {
            eachLanguage.click();
            System.out.println("eachLanguage = " + eachLanguage.getText());
        }
        Thread.sleep(1000);
        selectLanguage.deselectAll();

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}