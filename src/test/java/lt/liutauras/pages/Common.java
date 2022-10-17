package lt.liutauras.pages;

import lt.liutauras.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public static void waitForElementWithVisibilityChange(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void doubleClickByActions(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.doubleClick();
        action.perform();
    }


    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static void clearInputField(By locator) {
        getElement(locator).clear();
    }

    public static void sendSpecialKeysToElement(Keys value, By locator) {
        getElement(locator).sendKeys(value);
    }

    public static void waitForElementAttributeToBe(By locator, String attribute, String value)  {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeToBe(locator, attribute, value));
    }
          //   mesti lauk
    public static void waitForElementIsAccesible(By locator) {
      //  WebElement webElement = getElement(locator);
        FluentWait wait = new FluentWait(Driver.getDriver());
        wait.withTimeout(Duration.ofSeconds(7));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}
