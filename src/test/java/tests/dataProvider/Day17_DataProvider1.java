package tests.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
What is data provider?
-Data provider is a testNG annotation
-It is used to get list of test data
-With data provider, we can get data from different files such as json or excel.
-In out framework, I use data provider to get data from our excel sheet
++++++++++++++++++++++++++
How do you pass a data from a method to a Test Method?
-In the data provider method, I use @DataProvider annotation
-In the test methods, I use dataProvider parameter and pass method name
+++++++++++++++++++++++++++
//    use name parameter to give custom name
//    parallel parameter is used to do parallel testing
 */
public class Day17_DataProvider1 {
@DataProvider(name="adminLoginCredentials")
    public Object [][] customerData(){
        Object [][] customerCredentials={
                {"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},
              {"customer2@bluerentalcars.com","12347"},
               {"customer3@bluerentalcars.com","12348"}};
        return customerCredentials;
        }


    @Test(dataProvider = "adminLoginCredentials")
    public void dataProviderTest(String userName,String password){
        System.out.println("Username"+userName+"||| password"+password);

    }
}


