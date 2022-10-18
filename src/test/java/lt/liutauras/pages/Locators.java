package lt.liutauras.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Pegasas {
                                        // iskeliau i virsu, nes toki pati naudoja visi testai
        public static By formPrivacyConfirmation = By.xpath("//div[@id='CybotCookiebotDialog']");

        public static class Login {
            public static By buttonAllowAll = By.xpath(
                    "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");

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
            public static By buttonAllowOptions = By.xpath(
                    "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection']");
            public static By bookElement = By.xpath("//div[@id='lupa-search-result-product-card'][1]");
            public static By buttonAddToCart = By.xpath(
                    "//div[@class='ProductActions-productActions-1U0']/button[@type='button']");
            public static By bookAmountInput = By.xpath("//input[@aria-label='produkto kiekis']");
            public static By cartCounter = By.xpath(
                    "//*[@class='d-none d-xl-block']//span[@class='MiniCart-cartCount-2UO']"
            );

            public static By priceFromInput = By.xpath("//div[@class='lupa-stats-from']/input");
            public static By priceToInput = By.xpath("//div[@class='lupa-stats-to']/input");
            public static By dropDownToSort = By.xpath(
                    "//div[@id='lupa-search-results-products']" +
                            "//select[@data-cy='lupa-sort-select-dropdown']");
            public static By firstItemOnList = By.xpath(
                    "//div[@data-cy='lupa-search-results-product-regular-price'][1]");
            public static By spinnerElement = By.xpath("//div[@class='lupa-spinner-wrapper lupa-loader']");
        }

        public static class Account {
            public static By loginEmailInput = By.xpath("//input[@data-cy='sign-in-form-email']");
            public static By loginPasswordInput = By.xpath("//input[@data-cy='sign-in-form-password']");
            public static By buttonSubmit = By.xpath("//button[@data-cy='button-sign-in-form-submit']");

            public static By DropDownList = By.xpath("//button[@id ='dropdown-basic']");
            public static By accountInfoListOption = By.xpath("//a[@href='/customer/account']");
            public static By accountEditButton = By.xpath("//button[text()='Redaguoti']");
            public static By userFirstNameInput = By.xpath("//input[@name='firstname']");
            public static By userLastNameInput = By.xpath("//input[@name='lastname']");
            public static By userPhoneInput = By.xpath("//input[@name='phone_number']");
            public static By userPasswordInput = By.xpath("//input[@name='password']");
            public static By buttonSave = By.xpath("//button[@data-cy='form-confirm-button']");
            public static By popupElement = By.xpath("//span[@data-cy='Toast-message']");
        }

        public static class Home {
            public static By searchBoxInput = By.xpath("//div[@class='d-none d-xl-block']" +
                    "//input[@class='lupa-search-box-input-field']");
            public static By buttonSearch = By.xpath("//button[@id='search-desktop-trigger']");
            public static By searchResultElement = By.xpath("//h1[@class='lupa-result-page-title']/span[2]");
            public static By bookElement = By.xpath("//div[@class='lupa-products']" +
                    "/div[@id='lupa-search-result-product-card'][1]");
            public static By aboutItemElement = By.xpath("//div[@class='Description-description-2oF']");
            public static By itemNameElement = By.xpath("//h1[@class='ProductFullDetail-title-_Mg']");

        }

    }
}