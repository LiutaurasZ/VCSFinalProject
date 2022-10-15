package lt.liutauras.tests;

import lt.liutauras.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }

}
