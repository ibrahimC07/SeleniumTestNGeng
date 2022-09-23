package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class Day14_FirstDriverClass {
    @Test
    public void firstDriverClass(){
//        driver   -------->>>>>>>>>>   Driver.getDriver()
        Driver.getDriver().get("https://www.techproeducation.com");


//        Closing the driver
        Driver.closeDriver();

    }
}
