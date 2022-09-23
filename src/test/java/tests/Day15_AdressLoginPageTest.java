package tests;

import org.testng.annotations.Test;
import pages.AdressLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day15_AdressLoginPageTest {
    AdressLoginPage adressLoginPage=new AdressLoginPage();
@Test
    public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("address_url"));
    adressLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
    adressLoginPage.password.sendKeys(ConfigReader.getProperty("address_pass"));
    adressLoginPage.signInButton.click();
}
}
