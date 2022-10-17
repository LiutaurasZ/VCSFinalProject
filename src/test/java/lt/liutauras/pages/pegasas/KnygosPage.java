package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;

public class KnygosPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void closePrivacyConfirmation() {
        Common.waitForElementToBeClickable(Locators.Pegasas.formPrivacyConfirmation);
        try {
            Common.clickElement(Locators.Pegasas.Knygos.buttonAllowOptions);
        } catch (ElementClickInterceptedException ignored) {
        }

    }

    public static void clickBook() {
        Common.clickElement(Locators.Pegasas.Knygos.bookElement);
    }

    public static void addBookToCart() {
        Common.clickElement(Locators.Pegasas.Knygos.buttonAddToCart);
    }

    public static void inputBooksAmount(String booksAmount) {
        Common.clearInputField(Locators.Pegasas.Knygos.bookAmountInput);
        Common.sendKeysToElement(
                booksAmount,
                Locators.Pegasas.Knygos.bookAmountInput
        );
    }

    public static String readCartCounter() {
        return Common.getElementText(Locators.Pegasas.Knygos.cartCounter);
    }


    public static void inputPriceFrom(String value) {
        String attributeName = "aria-valuenow";
        By locator = Locators.Pegasas.Knygos.priceFromInput;

        Common.clearInputField(locator);
        Common.sendKeysToElement(value, locator);
        Common.sendSpecialKeysToElement(Keys.ENTER,locator);
        Common.waitForElementAttributeToBe(Locators.Pegasas.Knygos.priceSliderFrom, attributeName, value);
    }

    public static void inputPriceTo(String value) {
        String attributeName = "aria-valuenow";
        By locator = Locators.Pegasas.Knygos.priceToInput;

        Common.clearInputField(locator);
        Common.sendKeysToElement(value, locator);
        Common.sendSpecialKeysToElement(Keys.ENTER, locator);
        Common.waitForElementAttributeToBe(Locators.Pegasas.Knygos.priceSliderTo, attributeName, value);
    }


    public static void clickSortOrderFromDropdown(String value) {
        Common.selectOptionByValue(
                Locators.Pegasas.Knygos.dropDownToSort,
                value
        );
    }

    public static String readPriceOfFirstBookOnList() {
       // Common.waitForElementToBeClickable(Locators.Pegasas.Knygos.firstItemOnList);
        Common.waitForElementIsAccesible(Locators.Pegasas.Knygos.firstItemOnList);
        return Common.getElementText(Locators.Pegasas.Knygos.firstItemOnList);

    }

}
