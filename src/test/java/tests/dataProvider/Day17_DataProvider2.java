package tests.dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Day17_DataProvider2 {
    @DataProvider(name = "adminLoginCredentials")
    public Object[][] customerData() {
        Object[][] customerCredentials = {
                {"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},
                {"customer2@bluerentalcars.com","12347"},
                {"customer3@bluerentalcars.com","12348"}};
        return customerCredentials;
    }
    HomePage homePage;
    LoginPage loginPage;
    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        try {
            homePage.homeLoginButton.click();
        } catch (Exception e) {
        }
        try {
            homePage.userID.click();
        } catch (Exception e) {
            homePage.logOut.click();
            homePage.OK.click();
            homePage.homeLoginButton.click();
        }
    }
    @Test(dataProvider = "adminLoginCredentials")
    public void customerLoginTest(String userName, String password) throws IOException {
        login();
        ReusableMethods.waitFor(1);
//        I want to get username with data provider
        loginPage.username.sendKeys(userName);
        ReusableMethods.waitFor(1);
//        I want to get password with data provider
        loginPage.password.sendKeys(password);
        ReusableMethods.waitFor(1);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        ReusableMethods.getScreenshot("LoginTest");
    }
}