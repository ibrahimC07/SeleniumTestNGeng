package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day14_FirstConfigProperties {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("techproed_url"));
        Driver.closeDriver();

    }
}
