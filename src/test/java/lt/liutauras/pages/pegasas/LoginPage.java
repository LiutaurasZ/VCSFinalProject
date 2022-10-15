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
}
