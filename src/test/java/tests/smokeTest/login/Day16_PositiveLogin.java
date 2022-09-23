package tests.smokeTest.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day16_PositiveLogin {
    HomePage homePage;
    LoginPage loginPage;
    @Test(groups = "login-group")
public void customerLogin(){
    Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    homePage=new HomePage();
    loginPage=new LoginPage();
    homePage.homeLoginButton.click();
    loginPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
    loginPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
    loginPage.loginButton.click();

        //Assert.assertTrue(homePage.userID.isDisplayed());
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        try{
        Assert.assertTrue(homePage.userID.isDisplayed());}
        catch(Exception e){
            Assert.fail();
        }

        Driver.closeDriver();



}
}
