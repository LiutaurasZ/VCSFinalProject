package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.KnygosPage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KnygosTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        KnygosPage.open("https://www.pegasas.lt/knygos/");
    }

    @Test
    private void testAddBookToCart() {
        String expectedBooksAmount = "2";
        String actualBookAmount;

        KnygosPage.clickBook();
        KnygosPage.performDoubleClickOnInputBooksAmount();
        KnygosPage.inputBooksAmount(expectedBooksAmount);
        KnygosPage.addBookToCart();
        actualBookAmount = KnygosPage.readCartCounter();

        Assert.assertEquals(actualBookAmount, expectedBooksAmount);

    }


}
