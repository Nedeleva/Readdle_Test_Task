package constants;

public class Locators {

    public interface MainPage {
        String SEARCH_FIELD = "//input[@class ='search-form__input ng-untouched ng-pristine ng-valid']",
                PRODUCT_FROM_SEARCH_FIELD = "//span[@class ='suggest-goods__info']",
                ADD_TO_SHOPPING_CART = "//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']",
                CLOSE_BUTTON = "//button[@class='modal__close']",
                HEADER = "//a[@class='header__logo']",
                SHOPPING_CART_BUTTON = "//button[@class='header__button ng-star-inserted header__button--active']",
                PRODUCT_SHOPPING_CART_XPATH = "//div[@class='cart-product__main']//a[contains(text(),'(MD506Z/A)')]";
    }
}
