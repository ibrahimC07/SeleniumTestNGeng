package practice05.tests;
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Products' button
//5. Verify user is navigated to ALL PRODUCTS page successfully
//6. Enter product name in search input and click search button
//7. Verify 'SEARCHED PRODUCTS' is visible
//8. Verify all the products features related to search are visible

import org.testng.Assert;
import org.testng.annotations.Test;
import practice05.pages05.SearchProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SearchProductTest {
    SearchProductPage searchProductPage;
    @Test
public void test(){
    Driver.getDriver().get(ConfigReader.getProperty("search_product"));
   searchProductPage=new SearchProductPage();
Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://automationexercise.com/");
   searchProductPage.products.click();
        ReusableMethods.verifyElementDisplayed(searchProductPage.allProductsText);
        searchProductPage.searchInput.sendKeys(ConfigReader.getProperty("product_name"));
        searchProductPage.searchButton.click();
        Assert.assertTrue(searchProductPage.searchedProductsText.isDisplayed());
        searchProductPage.viewProductButton.click();
        Assert.assertTrue(searchProductPage.condition.isDisplayed());
        Assert.assertTrue(searchProductPage.availability.isDisplayed());
        Assert.assertTrue(searchProductPage.brand.isDisplayed());


}
}
