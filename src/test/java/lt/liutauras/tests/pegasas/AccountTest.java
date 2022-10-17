package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.AccountPage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        AccountPage.open("https://www.pegasas.lt/customer/login/");
        AccountPage.closePrivacyConfirmation();
        AccountPage.loginToAccount("dzhekas@gmail.com", "T!kTestavimu1");
        AccountPage.clickToOpenAccountDropDown();

    }

    @DataProvider(name = "DataProviderForEditAccountInfo")
    public Object[][] provideDataForEditAccountInfo() {
        return new Object[][]{
                {"Dzames", "Blond", "+300700700","T!kTestavimu1"},
                {"Klara", "Liuksemburg","+37100010001","T!kTestavimu1"},

        };
    }

    @Test(dataProvider = "DataProviderForEditAccountInfo")
    public void testEditAccountInformation(
            String userFirstName, String userLastName,
            String userPhone, String userPassword) {

        String expectedUpdateStatus = "Duomenys sėkmingai atnaujinti";
        String actualUpdateStatus;

        AccountPage.clickAccountInfoFromList();
        AccountPage.clickAccountEditButton();

        AccountPage.enterUserFirstName(userFirstName);
        AccountPage.enterUserLastName(userLastName);
        AccountPage.enterUserPhone(userPhone);
        AccountPage.enterUserPassword(userPassword);
        AccountPage.clickSaveButton();
        actualUpdateStatus = AccountPage.readUpdateStatus();

        Assert.assertEquals(actualUpdateStatus, expectedUpdateStatus);

    }


}