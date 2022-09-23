package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdressLoginPage {
    public AdressLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id= "session_email")
    public WebElement username;

    @FindBy(id="session_password")
    public WebElement password;

    @FindBy(name="commit")
    public WebElement signInButton;
}
