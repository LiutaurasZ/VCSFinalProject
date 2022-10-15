package lt.liutauras.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Pegasas {

        public static class Login {
            public static By buttonAllowAll = By.xpath(
                    "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
            public static By formPrivacyConfirmation = By.xpath("//div[@id='CybotCookiebotDialog']");

            public static By buttonClose = By.xpath(
                    "//button[@id='omnisend-form-633c09919a4d16cd5e1876af-close-action']");
            public static By formNaujiemsPrenumeratoriams = By.xpath(
                    "//form[@id='omnisend-form-633c09919a4d16cd5e1876af-submit-form']");
        }


    }
}