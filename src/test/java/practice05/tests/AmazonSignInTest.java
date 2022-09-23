package practice05.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdressLoginPage;
import practice05.pages05.AmazonSignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

//        Go to the Amazon website
//        Click on sign in button
//        Send e mail by using faker
//        Click on continue
//        Assert "There was a problem"  message
//        Click on "Need help?"
//        Click on "Forgot your Password?"
//        Verify the text "Password assistance"
//        Navigate back
//        Click on "Create your account" button
//        Verify the text "Create account"
public class AmazonSignInTest {
    AmazonSignInPage amazonSignInPage;

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        amazonSignInPage=new AmazonSignInPage();
        amazonSignInPage.signInTab.click();
        amazonSignInPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        amazonSignInPage.continueButton.click();
        ReusableMethods.verifyElementDisplayed(amazonSignInPage.warningMessage);
        amazonSignInPage.needhelp.click();
        amazonSignInPage.forgotPassword.click();
        Assert.assertTrue(amazonSignInPage.passwordAssistance.isDisplayed());
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        amazonSignInPage.createAccount.click();
        Assert.assertTrue(amazonSignInPage.createAccountText.isDisplayed());
        Driver.closeDriver();

    }

}
