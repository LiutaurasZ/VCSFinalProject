package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;

public class HomePage {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void inputSearchString(String value) {
        Common.sendKeysToElement(Keys.CONTROL + "a", Locators.Pegasas.Home.searchBoxInput);
        Common.sendKeysToElement(
                value,
                Locators.Pegasas.Home.searchBoxInput
        );
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Pegasas.Home.buttonSearch);
    }

    public static String readSearchResultsNumber() {
        return Common.getElementText(Locators.Pegasas.Home.searchResultElement);
    }

    public static void clickBook() {
        Common.clickElement(Locators.Pegasas.Home.bookElement);
    }

    public static void closePrivacyConfirmation() {
        Common.waitForElementToBeClickable(Locators.Pegasas.formPrivacyConfirmation);
        try {
            Common.clickElement(Locators.Pegasas.Knygos.buttonAllowOptions);
        } catch (ElementClickInterceptedException ignored) {
        }
    }

    public static Boolean lookForSearchedStringInDescription(String searchString) {
        String foundNome = Common.getElementText(Locators.Pegasas.Home.itemNameElement).toLowerCase();
        String foundAbout = Common.getElementText(Locators.Pegasas.Home.aboutItemElement).toLowerCase();

        return foundNome.contains(searchString.toLowerCase()) ||
                foundAbout.contains(searchString.toLowerCase());
    }
}
