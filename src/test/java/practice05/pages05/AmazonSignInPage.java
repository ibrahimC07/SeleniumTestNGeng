package practice05.pages05;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSignInPage {
  public  AmazonSignInPage() {
      PageFactory.initElements(Driver.getDriver(), this);
  }
      @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
              public WebElement signInTab;

  @FindBy(id="ap_email")
    public WebElement emailBox;

  @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

  @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

  @FindBy(xpath = "//span[@class='a-list-item']")
    public WebElement warningMessage;

  @FindBy(partialLinkText = "Need help?")
    public WebElement needhelp;
  @FindBy(partialLinkText ="Forgot Password")
    public WebElement forgotPassword;
  @FindBy(xpath = "//h1")
  public WebElement passwordAssistance;
  @FindBy(id="createAccountSubmit")
    public WebElement createAccount;
  @FindBy(xpath = "//h1[@class='a-spacing-small']")
    public WebElement createAccountText;

  }

