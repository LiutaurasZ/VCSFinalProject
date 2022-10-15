package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.KnygosPage;
import lt.liutauras.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KnygosTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        KnygosPage.open("https://www.pegasas.lt/");
        KnygosPage.clickToOpenKnygosPage();
    }

    @Test
    private void testAddBookToCart() {



    }


}
