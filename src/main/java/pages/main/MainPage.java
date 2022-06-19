package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import static constants.Constants.*;
import static constants.Locators.MainPage.*;

public class MainPage extends BasePage {
    @FindBy(xpath = CITE_URL)
    private WebElement citeURL;
    @FindBy(xpath = SEARCH_FIELD)
    private WebElement searchField;
    @FindBy(xpath = PRODUCT_FROM_SEARCH_FIELD)
    private WebElement productFromSearchField;
    @FindBy(xpath = ADD_TO_SHOPPING_CART)
    private WebElement addToCartButton;
    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;
    @FindBy(xpath = HEADER)
    private WebElement header;
    @FindBy(xpath = SHOPPING_CART_BUTTON)
    private WebElement shoppingCartButton;
    @FindBy(xpath = PRODUCT_SHOPPING_CART_XPATH)
    private WebElement productXpath;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openCiteUrlPage() {
        openURL(CITE_URL);
        return this;
    }

    public MainPage findProductThroughSearchPanel(String text) {
        clickOn(searchField);
        fillField(searchField, text);
        return this;
    }

    public MainPage openProductPage() {
        clickOn(productFromSearchField);
        return this;
    }

    public MainPage addToShoppingCart() {
        clickOn(addToCartButton);
        return this;
    }

    public MainPage closePopup() {
        clickOn(closeButton);
        return this;
    }

    public MainPage openMainPage() {
        clickOn(header);
        return this;
    }

    public MainPage clickOnShoppingCart() {
        clickOn(shoppingCartButton);
        return this;
    }

    public void verifyThatProductIsAddedToShoppingCart() {
        WebElement product = driver.findElement(By.xpath(PRODUCT_SHOPPING_CART_XPATH));
        Assert.assertTrue(product.isDisplayed());
    }
}
