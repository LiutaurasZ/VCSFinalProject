package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;

public class LoginPage {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void closePrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(Locators.Pegasas.Login.formPrivacyConfirmation);
        Common.clickElement(Locators.Pegasas.Login.buttonAllowAll);
    }

    public static void closeNaujiemsPrenumeratoriamsForm() {
        Common.waitForElementWithVisibilityChange(Locators.Pegasas.Login.formNaujiemsPrenumeratoriams);
        Common.clickElement(Locators.Pegasas.Login.buttonClose);
    }




    public static void enterLoginEmail(String loginEmail) {
            Common.sendKeysToElement(
                    loginEmail,
                    Locators.Pegasas.Login.loginEmailInput
            );
    }

    public static void enterLoginPassword(String loginPassword) {
        Common.sendKeysToElement(
                loginPassword,
                Locators.Pegasas.Login.loginPasswordInput
        );
    }

    public static void clickButtonSubmit() {
        Common.clickElement(
                Locators.Pegasas.Login.buttonSubmit
        );
    }

    public static String readAccountStatus() {
        return Common.getElementText(
                Locators.Pegasas.Login.accountStatus
        );
    }
}
