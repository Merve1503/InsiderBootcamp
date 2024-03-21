package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

public class ConfigReader {

    private static Properties properties;
    private static final String CONFIG_FILE_PATH = "config.properties";

    static {
        try {
            // config.properties dosyasını yükle
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream(CONFIG_FILE_PATH);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Yapılandırma dosyası yüklenirken bir hata oluştu: " + e.getMessage());
        }
    }

    // Belirli bir anahtar (key) için değeri al
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    // WebDriverWait oluştur
    public static WebDriverWait createWebDriverWait(WebDriver driver, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    // WebDriver'dan çıkış yap
    public static void quitWebDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
