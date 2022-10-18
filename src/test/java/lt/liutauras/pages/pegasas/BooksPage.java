package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;

public class BooksPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void closePrivacyConfirmation() {
        Common.waitForElementToBeClickable(Locators.Pegasas.formPrivacyConfirmation);
        try {
            Common.clickElement(Locators.Pegasas.Books.buttonAllowOptions);
        } catch (ElementClickInterceptedException ignored) {
        }

    }

    public static void clickBook() {
        Common.clickElement(Locators.Pegasas.Books.bookElement);
    }

    public static void addBookToCart() {
        Common.clickElement(Locators.Pegasas.Books.buttonAddToCart);
    }

    public static void inputBooksAmount(String booksAmount) {
        Common.clearInputField(Locators.Pegasas.Books.bookAmountInput);
        Common.sendKeysToElement(
                booksAmount,
                Locators.Pegasas.Books.bookAmountInput
        );
    }

    public static String readCartCounter() {
        return Common.getElementText(Locators.Pegasas.Books.cartCounter);
    }


    public static void inputPriceFrom(String value) {
        By locator = Locators.Pegasas.Books.priceFromInput;

        Common.sendKeysToElement(Keys.CONTROL + "a", locator);
        Common.sendKeysToElement(value, locator);
        Common.sendSpecialKeysToElement(Keys.ENTER, locator);
    }

    public static void inputPriceTo(String value) {
        By locator = Locators.Pegasas.Books.priceToInput;

        Common.sendKeysToElement(Keys.CONTROL + "a", locator);
        Common.sendKeysToElement(value, locator);
        Common.sendSpecialKeysToElement(Keys.ENTER, locator);
    }


    public static void clickSortOrderFromDropdown(String value) {
        Common.selectOptionByValue(
                Locators.Pegasas.Books.dropDownToSort,
                value
        );
    }

    public static String readPriceOfFirstBookOnList() {
        try {
            Common.waitForInvisibilityOfElement(Locators.Pegasas.Books.spinnerElement);
        } catch (Exception ignore){}

        try {
            return Common.getElementText(Locators.Pegasas.Books.firstItemOnList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "-1";
    }

}