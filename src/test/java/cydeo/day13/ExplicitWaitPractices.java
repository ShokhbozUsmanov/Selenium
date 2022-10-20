package cydeo.day13;

import my_utily.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicallyLoadedPage_7;

public class ExplicitWaitPractices {
    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
    }

    @Test
    public void DynamicallyLoadedPage_7_Test() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicallyLoadedPage_7 obj = new DynamicallyLoadedPage_7();
        Assert.assertTrue(obj.doneMessage.isDisplayed());
        Assert.assertTrue(obj.spongeBobImage.isDisplayed());
    }
}
