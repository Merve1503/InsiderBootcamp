package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    // WebDriver nesnesini başlatan metod
    public static WebDriver initializeDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            // Chromedriver dosyasının yolu
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver-win64\\chromedriver.exe");
            // Chrome WebDriver nesnesini başlat
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Geckodriver dosyasının yolu
            System.setProperty("webdriver.gecko.driver", "C:\\Path\\To\\geckodriver.exe");
            // Firefox WebDriver nesnesini başlat
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Geçersiz tarayıcı türü: " + browser);
        }
        return driver;
    }

    // WebDriver nesnesini döndüren metod
    public static WebDriver getDriver() {
        return driver;
    }

    // WebDriver nesnesini kapatmak için kullanılan metod
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

