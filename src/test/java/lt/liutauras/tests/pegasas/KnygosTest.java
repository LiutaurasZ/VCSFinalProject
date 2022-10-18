package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.KnygosPage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KnygosTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        KnygosPage.open("https://www.pegasas.lt/knygos/");
        KnygosPage.closePrivacyConfirmation();                          
    }

    @DataProvider(name = "DataProviderForAddBookToCart")
    public Object[][] provideDataForAddBookCarts() {
        return new Object[][]{
                {"3"},
                {"1"},
                {"4"},
        };
    }

    @Test(dataProvider = "DataProviderForAddBookToCart")
    private void testAddBookToCart(String expectedBooksAmount) {
        String actualBookAmount;

        KnygosPage.clickBook();
        KnygosPage.inputBooksAmount(expectedBooksAmount);
        KnygosPage.addBookToCart();
        actualBookAmount = KnygosPage.readCartCounter();

        Assert.assertEquals(actualBookAmount, expectedBooksAmount);

    }


    @DataProvider(name = "DataProviderForPriceFilterTest")
    public Object[][] provideDataForPriceFilter() {
        return new Object[][]{
                {"15", "60"},
                {"34", "50"},
                {"4", "10"},
        };
    }

    @Test(dataProvider = "DataProviderForPriceFilterTest")
    private void testPriceFilter(String priceFrom, String priceTo) {

        String priceOrderFromMinToMax = "priceAscSignedOut";
        String priceOrderFromMaxToMin = "priceDescSignedOut";
        String actualPriceFrom;
        String actualPriceTo;

        KnygosPage.inputPriceFrom(priceFrom);
        KnygosPage.inputPriceTo(priceTo);

        KnygosPage.clickSortOrderFromDropdown(priceOrderFromMinToMax);
        actualPriceFrom = KnygosPage.readPriceOfFirstBookOnList()
                .replace(" €", "")
                .replace(",", ".");

        KnygosPage.clickSortOrderFromDropdown(priceOrderFromMaxToMin);
        actualPriceTo = KnygosPage.readPriceOfFirstBookOnList()
                .replace(" €", "")
                .replace(",", ".");

        Assert.assertTrue(Double.parseDouble(actualPriceFrom) >= Double.parseDouble(priceFrom),
                String.format("Actual [%s]; Expected >= [%s] ",
                        actualPriceFrom,
                        priceFrom)
        );
        Assert.assertTrue(Double.parseDouble(actualPriceTo) <= Double.parseDouble(priceTo),
                String.format("Actual [%s]; Expected <= [%s] ",
                        actualPriceTo,
                        priceTo)
        );

    }


}
