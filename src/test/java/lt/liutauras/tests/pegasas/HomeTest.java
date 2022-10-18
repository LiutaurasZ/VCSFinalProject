package lt.liutauras.tests.pegasas;

import lt.liutauras.pages.pegasas.HomePage;
import lt.liutauras.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.pegasas.lt/");
        HomePage.closePrivacyConfirmation();

    }

    @DataProvider(name = "DataProviderForSearchBox")
    public Object[][] provideDataForSearcBox() {
        return new Object[][]{
               {"King"},
               {"Asimov"},
               {"Star Wars"},

        };
    }
    @Test(dataProvider = "DataProviderForSearchBox")
    public void testSearchBox(String expectedSearchString){

        boolean actualSearchStringFound;
        int searchResultNumber;

        HomePage.inputSearchString(expectedSearchString);
        HomePage.clickSearchButton();
        searchResultNumber = Integer.parseInt(
                HomePage.readSearchResultsNumber()
                        .replace("(","")
                        .replace(")","")
        );


        if (searchResultNumber == 0) {
            Assert.assertTrue(true);
        } else{

            HomePage.clickBook();
            actualSearchStringFound = HomePage.lookForSearchedStringInDescription(expectedSearchString);

            Assert.assertTrue(actualSearchStringFound);
        }
    }
}