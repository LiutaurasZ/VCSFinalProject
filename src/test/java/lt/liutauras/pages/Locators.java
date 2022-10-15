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

            public static By loginEmailInput = By.xpath("//input[@data-cy='sign-in-form-email']");
            public static By loginPasswordInput = By.xpath("//input[@data-cy='sign-in-form-password']");
            public static By buttonSubmit = By.xpath("//button[@data-cy='button-sign-in-form-submit']");
            public static By accountStatus = By.xpath("//button[@id='dropdown-basic']");
        }


    }
}