package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.BooksPage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BooksTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        BooksPage.open("https://www.pegasas.lt/knygos/");
        BooksPage.closePrivacyConfirmation();
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

        BooksPage.clickBook();
        BooksPage.inputBooksAmount(expectedBooksAmount);
        BooksPage.addBookToCart();
        actualBookAmount = BooksPage.readCartCounter();

        Assert.assertEquals(actualBookAmount, expectedBooksAmount);

    }


    @DataProvider(name = "DataProviderForPriceFilterTest")
    public Object[][] provideDataForPriceFilter() {
        return new Object[][]{
                {"15", "60"},
                {"21", "50"},
                {"4", "10"},
        };
    }

    @Test(dataProvider = "DataProviderForPriceFilterTest")
    private void testPriceFilter(String expectedPriceFrom, String expectedPriceTo) {

        String priceOrderFromMinToMax = "priceAscSignedOut";
        String priceOrderFromMaxToMin = "priceDescSignedOut";
        String actualPriceFrom;
        String actualPriceTo;

        BooksPage.inputPriceFrom(expectedPriceFrom);
        BooksPage.inputPriceTo(expectedPriceTo);

        BooksPage.clickSortOrderFromDropdown(priceOrderFromMinToMax);
        actualPriceFrom = BooksPage.readPriceOfFirstBookOnList()
                .replace(" €", "")
                .replace(",", ".");

        BooksPage.clickSortOrderFromDropdown(priceOrderFromMaxToMin);
        actualPriceTo = BooksPage.readPriceOfFirstBookOnList()
                .replace(" €", "")
                .replace(",", ".");

        Assert.assertTrue(Double.parseDouble(actualPriceFrom) >= Double.parseDouble(expectedPriceFrom),
                String.format("Actual [%s]; Expected >= [%s] ",
                        actualPriceFrom,
                        expectedPriceFrom)
        );
        Assert.assertTrue(Double.parseDouble(actualPriceTo) <= Double.parseDouble(expectedPriceTo),
                String.format("Actual [%s]; Expected <= [%s] ",
                        actualPriceTo,
                        expectedPriceTo)
        );

    }


}
