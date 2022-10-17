package day11;

import com.github.javafaker.Faker;
import my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        // set up chrome and create WebDriver instance
        driver = Driver.getDriver();
    }

    @Test
    public void registrationForm() {

        driver.get("https://practice.cydeo.com/registration_form");
        WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
        Faker ff = new Faker();
        first.sendKeys(ff.name().firstName());
        WebElement sec = driver.findElement(By.xpath("//input[@name='lastname']"));
        sec.sendKeys(ff.name().lastName());
        WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
        user.sendKeys(ff.numerify("upperNumber123"));
        WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
        mail.sendKeys(ff.internet().emailAddress());
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys(ff.chuckNorris().fact());
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(ff.numerify("###-###-####"));
        WebElement male = driver.findElement(By.xpath("//input[@value='male']"));
        male.click();
        WebElement bir = driver.findElement(By.xpath("//input[@name='birthday']"));
        bir.sendKeys(ff.numerify("10/24/1990"));
        Select dept = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        dept.selectByValue("DE");
        Select job = new Select (driver.findElement(By.xpath("//select[@name='job_title']")));
        job.selectByIndex(4);
        WebElement java = driver.findElement(By.id("inlineCheckbox2"));
        java.click();
        WebElement sign = driver.findElement(By.xpath("//button"));
        sign.click();










    }
    }
