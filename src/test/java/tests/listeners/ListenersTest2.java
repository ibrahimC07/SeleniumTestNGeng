package tests.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ListenersTest2 {
    HomePage homePage;
    LoginPage loginPage;
@Test(retryAnalyzer = utilities.ListenersRetry.class)
    public void customerLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys("atiye@gmail.com");
        loginPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        loginPage.loginButton.click();

        //Assert.assertTrue(homePage.userID.isDisplayed());
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        try {
            Assert.assertTrue(homePage.userID.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
        }

        Driver.closeDriver();


    }
}
