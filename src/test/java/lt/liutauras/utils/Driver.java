package lt.liutauras.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(setUpOptions()));
        driver.get().manage().deleteAllCookies();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void close() {
        driver.get().quit();
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--force-device-scale-factor=0.75");
        return options;
    }

}
