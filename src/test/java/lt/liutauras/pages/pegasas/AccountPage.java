package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;

public class AccountPage {
    public static void open(String url) {
        Common.openUrl(url);
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

    public static void clicAccountEditButton() {
        Common.clickElement(Locators.Pegasas.Account.accountEditButton);
    }

    public static void enterUserFirstName(String userFirstName) {
        Common.clearInputField(Locators.Pegasas.Account.userFirstNameInput);
        Common.sendKeysToElement(
                userFirstName,
                Locators.Pegasas.Account.userFirstNameInput
        );
    }

    public static void enterUserLastName(String userLastName) {
        Common.clearInputField(Locators.Pegasas.Account.userLastNameInput);
        Common.sendKeysToElement(
                userLastName,
                Locators.Pegasas.Account.userLastNameInput
        );
    }

    public static void enterUserEmail(String userPhoneNo) {
        Common.clearInputField(Locators.Pegasas.Account.userEmailInput);
        Common.sendKeysToElement(
                userPhoneNo,
                Locators.Pegasas.Account.userEmailInput
        );
    }

    public static void enterUserPassword(String userPassword) {
        Common.clearInputField(Locators.Pegasas.Account.userPasswordInput);
        Common.sendKeysToElement(
                userPassword,
                Locators.Pegasas.Account.userPasswordInput
        );
    }

    public static void clickSaveButton() {
        Common.clickElement(Locators.Pegasas.Account.ButtonSave);
    }
}
