package lt.liutauras.pages.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.Locators;

public class KnygosPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickToOpenKnygosPage() {
        Common.clickElement(Locators.Pegasas.Knygos.knygosElement);
    }
}
