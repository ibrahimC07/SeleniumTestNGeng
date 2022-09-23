package practice05.pages05;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductPage {
    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Products")
    public WebElement products;
    @FindBy(xpath = "//*[.='All Products']")
    public WebElement allProductsText;
    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchInput;
    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchButton;
    @FindBy(xpath = "//h2[text()='Searched Products']")
    public WebElement searchedProductsText;
    @FindBy(partialLinkText = "View Product")
    public  WebElement viewProductButton;
    @FindBy(xpath = "(//b)[1]")
    public WebElement availability;
    @FindBy(xpath ="(//b)[2]")
    public  WebElement condition;
    @FindBy(xpath ="(//b)[3]")
    public  WebElement brand;






}
