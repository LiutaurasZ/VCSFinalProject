package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.LoginPage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://www.pegasas.lt/customer/login/");
        LoginPage.closePrivacyConfirmation();
        LoginPage.closeNaujiemsPrenumeratoriamsForm();
    }

    @Test
    private void testLogin(){

        String loginEmail = "obivanas@gmail.com";
        String loginPassword = "T!kTestavimu1";
        String expectedAccountStatus = "Mano paskyra";
        String actualAccountStatus;

        LoginPage.enterLoginEmail(loginEmail);
        LoginPage.enterLoginPassword(loginPassword);
        LoginPage.clickButtonSubmit();
        actualAccountStatus = LoginPage.readAccountStatus();

        Assert.assertEquals(expectedAccountStatus,actualAccountStatus);
    }

}
