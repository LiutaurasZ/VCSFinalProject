package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.LoginPage;
import lt.liutauras.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://www.pegasas.lt/");
        LoginPage.closePrivacyConfirmation();
    }

    @Test
    private void testLogin(){


    }

}
