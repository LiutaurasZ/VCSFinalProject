package lt.liutauras.pages;

import lt.liutauras.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common {


    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator){
        getElement(locator).click();
    }






}
