package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day14_configProperties {

        @Test
        public void titleTest(){
            Driver.getDriver().get(ConfigReader.getProperty("url_test_techproed"));
            String actualTitle = Driver.getDriver().getTitle();
            boolean isTrue = actualTitle.contains(ConfigReader.getProperty("page_title"));
            Assert.assertTrue(isTrue);

        }
    }


