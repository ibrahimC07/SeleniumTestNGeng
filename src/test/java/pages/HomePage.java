package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginButton;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement userID;

    @FindBy(linkText = "Logout")
    public WebElement logOut;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement OK;

    @FindBy(name = "car")
    public WebElement selectCar;


}
