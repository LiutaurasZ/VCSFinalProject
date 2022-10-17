package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

public class AccountPage {
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

    public static void loginToAccount(String loginEmail, String loginPassword) {
        Common.sendKeysToElement(loginEmail, Locators.Pegasas.Account.loginEmailInput);
        Common.sendKeysToElement(loginPassword, Locators.Pegasas.Account.loginPasswordInput);
        Common.clickElement(Locators.Pegasas.Account.buttonSubmit);
    }

    public static void clickToOpenAccountDropDown() {
        Common.clickElement(Locators.Pegasas.Account.DropDownList);
    }

    public static void clickAccountInfoFromList() {
        Common.clickElement(Locators.Pegasas.Account.accountInfoListOption);
    }

    public static void clickAccountEditButton() {
        Common.clickElement(Locators.Pegasas.Account.accountEditButton);
    }

    public static void enterUserFirstName(String userFirstName) {
        Common.waitForElementToBeClickable(Locators.Pegasas.Account.userFirstNameInput);
        Common.doubleClickByActions(Locators.Pegasas.Account.userFirstNameInput);
        Common.sendKeysToElement(
                userFirstName,
                Locators.Pegasas.Account.userFirstNameInput
        );
    }

    public static void enterUserLastName(String userLastName) {
        Common.doubleClickByActions(Locators.Pegasas.Account.userLastNameInput);
             Common.sendKeysToElement(
                userLastName,
                Locators.Pegasas.Account.userLastNameInput
        );
    }

    public static void enterUserPhone(String userPhoneNo) {
        Common.sendKeysToElement(Keys.CONTROL+"a", Locators.Pegasas.Account.userPhoneInput);
        Common.sendKeysToElement(
                userPhoneNo,
                Locators.Pegasas.Account.userPhoneInput
        );
    }

    public static void enterUserPassword(String userPassword) {
        Common.doubleClickByActions(Locators.Pegasas.Account.userPasswordInput);
        Common.sendKeysToElement(
                userPassword,
                Locators.Pegasas.Account.userPasswordInput
        );
    }

    public static void clickSaveButton() {
        Common.clickElement(Locators.Pegasas.Account.buttonSave);
    }

    public static String readUpdateStatus() {
        try {
            return Common.getElementText(
                    Locators.Pegasas.Account.popupElement
            );
        } catch (NoSuchElementException e) {
            return "Update status element is not accessible";
        }
    }

}
