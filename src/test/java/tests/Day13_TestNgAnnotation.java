package tests;

import org.testng.annotations.*;

public class Day13_TestNgAnnotation {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("After Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }
    @Test(priority=2)
    public void test1(){
        System.out.println("test1");
    }
    @Test@Ignore
    public void test2(){
        System.out.println("test2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("test3");
    }
    @Test(priority=1)
    public void test4(){
        System.out.println("test4");
    }
    @Test(priority=3)
    public void test5(){
        System.out.println("test5");
    }
    @Test
    public void test6() {
        System.out.println("test6");
    }
    @Test(priority = -3)
    public void test7(){
        System.out.println("Test 7");
    }
@AfterMethod
public void tearDown(){
    System.out.println("After Method");
}
}
/*
 * @Test : creates test case/method
 * @BeforeMethod: Same as @Before in JUNIT. Runs before each method. Runs after each @TEST annotation
 * @AfterMethod : Same as @After in JUNIT. Runs after each method. Runs after each @Test annotation
 * @Ignore : To skip a test case
 * @Test(enabled = false) : to disable a test case. Similar to Ignore
 * @Test(priority = 1) : priority is used for running tests in specific order.
 * By default, testNG runs in alphabetical order
 * */

//    Below test cases do not have priority, then they will run in alphabetical order
//    When a test case do not have priority, then priority = 0 by default
//    Tests that has same priority run in alphabetical order