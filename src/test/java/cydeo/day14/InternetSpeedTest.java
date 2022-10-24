package cydeo.day14;

import my_utily.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.InternetSpeedPage;

public class InternetSpeedTest {
    @Test
    public void internet_speed_test(){
        Driver.getDriver().get("https://www.speedtest.net");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        InternetSpeedPage obj = new InternetSpeedPage();
        wait.until(ExpectedConditions.visibilityOf(obj.resultLink));
        obj.goButton.click();
        wait.until(ExpectedConditions.visibilityOf(obj.gaugeSpeedText));
        obj.gaugeSpeedText.isDisplayed();
        System.out.println("Download Speed = "+obj.downloadSpeed.getText());
        System.out.println("Upload Speed = "+obj.uploadSpeed.getText());
    }

}
