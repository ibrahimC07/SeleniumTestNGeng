package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//        Soft Assert is used to do multiple assertion in the same class
//        hard assert is  more common
//        Soft Assert is used to do multiple assertion in the same class
//        hard assert is  more common
//        When did you use soft assert?
//        I used especially when I do scratch test cases
//        to see all of the steps on my test case
public class Day14_Assertion {
    @Test
    public void softAssertTest(){
        SoftAssert softAssert=new SoftAssert();
        System.out.println("Line 8");
        softAssert.assertEquals(4,5);
        System.out.println("Line 12");
        softAssert.assertTrue(false);
        System.out.println("Line 15");
        softAssert.assertEquals("a","a");
        softAssert.assertAll();
    }
}

//verification-soft assertion
//Assertion-hard assertion

