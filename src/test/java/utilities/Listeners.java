package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {
    //    ITestListener is an interface. We use it for customizing testng framework
//    onStart, onFinish, onTestStart, onTestSkipped, onTestSuccess, onTestFailure
    public void onStart(ITestContext arg){
        System.out.println("onStart-Execute once BEFORE all tests=>"+arg.getName());

    }
    public void onFinish(ITestContext arg){
        System.out.println("onFinish-Execute once AFTER all tests=>" +arg.getName());
    }
    public void onTestStart(ITestResult arg){
        System.out.println("onTestStart-Execute before EACH @Test =>"+arg.getName());
    }

    public void onTestSuccess(ITestResult arg){
        System.out.println("onTestSuccess-Execute AFTER EACH PASSED @Test=>"+arg.getName());
    }
    public void onTestSkipped(ITestResult arg){
        System.out.println("onTestSkipped-Execute After EACH SKIPPED @Test=>"+arg.getName());
    }
    public void onTestFailure(ITestResult arg){
        //        We can add any java code that we want to run ONLY AFTER A TEST CASE FAILS
       //  We can get screenshot automatically when a test case fails
        System.out.println("onTestFailure-Execute After EACH FAILURE @Test=>"+arg.getName());
        try {
            ReusableMethods.getScreenshot(arg.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Driver.closeDriver();
    }



}
