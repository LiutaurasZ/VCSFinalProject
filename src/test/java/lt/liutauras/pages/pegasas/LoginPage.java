package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class LoginPage {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void closePrivacyConfirmation() {
        Common.waitForElementToBeClickable(Locators.Pegasas.formPrivacyConfirmation);
        try {
            Common.clickElement(Locators.Pegasas.Login.buttonAllowAll);
        } catch (ElementClickInterceptedException ignored){}
    }

    public static void closeNaujiemsPrenumeratoriamsForm() {
        try {
            Common.waitForElementWithVisibilityChange(Locators.Pegasas.Login.formNaujiemsPrenumeratoriams);
            Common.clickElement(Locators.Pegasas.Login.buttonClose);
        } catch (TimeoutException ignored){}

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
        try {
            return Common.getElementText(
                    Locators.Pegasas.Login.accountStatus
            );
        } catch (NoSuchElementException e) {
            return "No such element";
        }

    }
}
