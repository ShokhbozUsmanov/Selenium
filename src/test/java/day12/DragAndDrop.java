package day12;

import my_utily.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
    WebDriver driver;
    @BeforeMethod
    public void SetUpMethods(){
        driver = Driver.getDriver();
    }

    @Test
    public void DragAndDropTest(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement small = driver.findElement(By.id("draggable"));
        WebElement big = driver.findElement(By.id("droptarget"));
        Actions action = new Actions(driver);
       while(true){
        action.dragAndDrop(small,big).perform();
       }




    }

}
