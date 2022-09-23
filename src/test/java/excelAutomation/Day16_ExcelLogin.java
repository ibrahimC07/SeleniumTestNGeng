package excelAutomation;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class Day16_ExcelLogin {
    /*
customer@bluerentalcars.com  12345
customer1@bluerentalcars.com 12346
customer2@bluerentalcars.com 12347
customer3@bluerentalcars.com 12348
     */
    /*
SUDO CODE
1st login:customer@bluerentalcars.com   12345
try{//using try catch cause 2nd time login button will not be there
click homepage login
}catch(Exception e){
}
---------------------------------
2nd, 3rd, 4th login
try{
click on user id
click on log out
click on OK
click homepage login
}catch(Exception e){
}
-----------------------------------
//for all steps
for{
send username -> get excel data
send password -> get excel data
click login button
do assertion
take screenshot
}
-------
 */
    ExcelUtil excelUtil;
    LoginPage loginPage;
    HomePage homePage;
    List<Map<String,String>>testData;
    @Test
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

    @Test
public void customerLogin(){
    String path=".src/test/java/resources/mysmoketestdata (1).xlsx";
    String customerSheet="customer_info";
    excelUtil=new ExcelUtil(path,customerSheet);
    testData=excelUtil.getDataList();
    for(Map<String,String>eachData:testData){
              login();
              loginPage.username.sendKeys(eachData.get("username"));
              loginPage.password.sendKeys(eachData.get("password").substring(0,5));
              loginPage.loginButton.click();



    }
}
}
