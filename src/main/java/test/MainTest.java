package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.main.MainPage;
import properties.Drivers;

import static constants.Constants.*;

public class MainTest {

    @Test
    public void test() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        MainPage mainPage = new MainPage(driver);
        mainPage
                .openCiteUrlPage()
                .findProductThroughSearchPanel(PRODUCT_CODE)
                .openProductPage()
                .addToShoppingCart()
                .closePopup()
                .openMainPage()
                .clickOnShoppingCart()
                .verifyThatProductIsAddedToShoppingCart();
    }
}

