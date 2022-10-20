package pages;
import my_utily.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "inputEmail")
    public WebElement inputUsername;
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement sigInButton;
    @FindBy(id = "inputEmail-error")
    public WebElement fieldRequiredErrorMsg;
    @FindBy(xpath = "//div=[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailErrorMsg;
    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']/div")
    public WebElement wrongEmailAndPasswordErrorMsg;

}

