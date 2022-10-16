package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;

public class KnygosPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickBook() {
        Common.clickElement(Locators.Pegasas.Knygos.bookElement);
    }

    public static void addBookToCart() {
        Common.clickElement(Locators.Pegasas.Knygos.buttonAddToCart);
    }

    public static void performDoubleClickOnInputBooksAmount() {
        Common.doubleClickByActions(
                Locators.Pegasas.Knygos.bookAmountInput
        );
    }

    public static void inputBooksAmount(String booksAmount) {
        Common.sendKeysToElement(
                booksAmount,
                Locators.Pegasas.Knygos.bookAmountInput
        );
    }

    public static String readCartCounter() {
        return Common.getElementText(Locators.Pegasas.Knygos.cartCounter);
    }
}
