package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.Common;
import lt.liutauras.pages.pegasas.AccountPage;
import lt.liutauras.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        AccountPage.open("https://www.pegasas.lt/customer/login/");
        AccountPage.loginToAccount("dzhekas@gmail.com", "T!kTestavimu1");
        AccountPage.clickToOpenAccountDropDown();

    }

    @DataProvider(name = "DataProviderForEditAccountInfo")
    public Object[][] provideDataForEditAccountInfo() {
        return new Object[][]{
                {"James", "Bond", "+300700707","T!kTestavimu1"},
//                {"Klara", "Liuksemburg","+37100010001","T!kTestavimu1"},
//                {"Luis", "Armstrongas","+37066699999","T!kTestavimu1"},
        };
    }

    @Test(dataProvider = "DataProviderForEditAccountInfo")
    public void testEditAccountInformation(
            String userFirstName, String userLastName, String userPhoneNo, String userPassword) {

        String actualUpdateStatus = "";
        AccountPage.clickAccountInfoFromList();
        AccountPage.clicAccountEditButton();

        AccountPage.enterUserFirstName(userFirstName);
        AccountPage.enterUserLastName(userLastName);
        AccountPage.enterUserEmail(userPhoneNo);
        AccountPage.enterUserPassword(userPassword);
        AccountPage.clickSaveButton();



        Common.sleep(5000);
    }


}