package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.HomePage;
import lt.liutauras.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.pegasas.lt/");

    }

    @DataProvider(name = "DataProviderForSearchBar")
    public Object[][] provideDataForSearcBar() {
        return new Object[][]{
                {"Kingas"},
                {"Prienai"},
                {"Star Wars"},

        };
    }
    @Test
    public void testSearchBar(){






    }
}