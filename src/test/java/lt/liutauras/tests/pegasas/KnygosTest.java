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
        KnygosPage.performDoubleClickOnInputBooksAmount();
        KnygosPage.inputBooksAmount(expectedBooksAmount);
        KnygosPage.addBookToCart();
        actualBookAmount = KnygosPage.readCartCounter();

        Assert.assertEquals(actualBookAmount, expectedBooksAmount);

    }


    @Test
    private void testPriceFilter(){
        String actualPriceFrom = "25";
        String actualPriceTo = "55";
        String expectedPriceFrom ="";
        String expectedPriceTo ="";

        KnygosPage.performDoubleClickOninputPriceFrom();
        KnygosPage.inputPriceFrom(actualPriceFrom);
        KnygosPage.performDoubleClickOninputPriceTo();
        KnygosPage.inputPriceTo(actualPriceTo);
     //   KnygosPage.SortPriceFromMinToMax();
        // Get first min price book

       // KnygosPage.SortPriceFromMaxToMin();
        // get firs Max price book

      //  Assert.assertTrue(Integer.parseInt(actualPriceFrom) <= Integer.parseInt(expectedPriceFrom));

        //Assert.assertTrue(Integer.parseInt(actualPriceTo) >= Integer.parseInt(expectedPriceTo));


    }


}
