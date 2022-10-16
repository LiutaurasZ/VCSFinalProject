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

        public static class Knygos {
            public static By bookElement = By.xpath("//div[@id='lupa-search-result-product-card'][1]");
            public static By buttonAddToCart = By.xpath(
                    "//div[@class='ProductActions-productActions-1U0']/button[@type='button']");
            public static By bookAmountInput = By.xpath("//input[@aria-label='produkto kiekis']");

            public static By cartCounter = By.xpath(
                    "//*[@class='d-none d-xl-block']//span[@class='MiniCart-cartCount-2UO']"
            );
        }

    }
}