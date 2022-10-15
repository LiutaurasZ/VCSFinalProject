package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;

public class LoginPage {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void closePrivacyConfirmation() {
        //Common.waitForElementWithVisibilityChange(Locators.Tv3.Home.formPrivacyConfirmation);
        Common.clickElement(Locators.Pegasas.Login.buttonConfirm);
    }
}
