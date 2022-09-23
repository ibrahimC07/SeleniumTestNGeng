package tests.listeners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utilities.Listeners.class)
//Connecting this Test class and Listeners using @Listeners annotation
//@Listeners(PATH OF THE LISTENERS CLASS)
public class ListenersTest {
    @Test
    public void test1() {
        System.out.println("Test Case 1-PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Test Case 2-FAIL");
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        System.out.println("Test case3-SKIP");
        throw new SkipException("SKIPPING TEST CASE");
    }

    @Test
    public void test4() {
        System.out.println("No Such Element Exception");
        throw new NoSuchElementException("THROWING NO SUCH ELEMENT EXCEPTION");
    }
}
