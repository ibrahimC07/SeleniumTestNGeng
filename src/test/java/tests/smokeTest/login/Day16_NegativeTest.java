package tests.smokeTest.login;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Day16_NegativeTest {
    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    @Test(groups = "login-group")
    public void test() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        homePage.homeLoginButton.click();
        faker=new Faker();
        loginPage.username.sendKeys(faker.internet().emailAddress());
        loginPage.password.sendKeys(faker.internet().password());
        loginPage.loginButton.click();
        ReusableMethods.waitForVisibility(loginPage.invalidCredentialsError,5);
        ReusableMethods.verifyElementDisplayed(loginPage.invalidCredentialsError);
        ReusableMethods.getScreenshot("Error message");
        Driver.closeDriver();

    }
    @Test(groups = "login-group")
    public void invalidEmail() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        homePage.homeLoginButton.click();
        faker=new Faker();
        loginPage.username.sendKeys(faker.name().username());
        ReusableMethods.verifyElementDisplayed(loginPage.invalidEmail);
        Assert.assertEquals(loginPage.invalidEmail.getText(),"email must be a valid email");
        ReusableMethods.getScreenshot("Invalidemail");
        ReusableMethods.verifyElementNotDisplayed(loginPage.invalidEmail);

        /*

        loginPage.invalidCredentialsError element pops up and it takes time to be visible(less than a sec)
        and implicit wait can not handle the wait
        so we should use explicit wait. below we are wait for the element to be visible up to 5 second
        Then doing the assertion

        ReusableMethods.waitForVisibility(loginPage.invalidCredentialsError,5);
        ReusableMethods.verifyElementDisplayed(loginPage.invalidCredentialsError);
        Assert.assertTrue(loginPage.invalidCredentialsError.getText().equals("invalid credentials"));
        ReusableMethods.getScreenshot("Error Message");
        Driver.closeDriver();
         */
    }
}
