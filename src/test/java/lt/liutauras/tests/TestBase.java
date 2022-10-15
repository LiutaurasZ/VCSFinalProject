package lt.liutauras.tests;

import lt.liutauras.pages.Common;
import lt.liutauras.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(TestListener.class)
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
