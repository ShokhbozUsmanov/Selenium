package cydeo.day9;

import cydeo.base.TestBase;
import cydeo.my_utily.BrowserUtils;
import cydeo.my_utily.CRM_Utillies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CrmLogin extends TestBase {

    @Test
    public void crm_login_test(){
        driver.get("http://login1.nextbasecrm.com/");
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("hr@cydeo.com");
        WebElement pass = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        pass.sendKeys("UserUser");

        WebElement logButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logButton.click();

        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_2(){
        CRM_Utillies.login_crm(driver);
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_3(){
        driver.get("http://login1.nextbasecrm.com/");
    }

}
