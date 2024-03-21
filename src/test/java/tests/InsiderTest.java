package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import pages.InsiderPage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InsiderTest {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static InsiderPage insiderPage;

    @BeforeAll
    public static void setup() {
        try {
            // WebDriver'ı başlatın
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();

            // WebDriverWait oluşturun (120 saniyeye kadar beklemek için)
            wait = new WebDriverWait(driver, Duration.ofSeconds(120));

            // InsiderPage nesnesini oluşturun
            insiderPage = new InsiderPage(driver);

            // Tarayıcı penceresini maksimum boyuta getir
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(1)
    public void testInsiderPage() {
        try {
            driver.get("https://www.useinsider.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(2)
    public void testCompanyTab() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(insiderPage.getCompanyTabLocator()));
            insiderPage.clickCompanyTab();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(3)
    public void testCareersClick() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(insiderPage.getCareersOptionLocator()));
            insiderPage.clickCareersOption();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(4)
    public void testInsiderFindJobClick() {
        try {
            insiderPage.clickInsiderFindJob();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(5)
    public void testLocationDropdownboxClick() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(insiderPage.getLocationDropdownboxLocator()));
            insiderPage.clickLocationDropdownbox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(6)
    public void testLocationIstanbulClick() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(insiderPage.getLocationIstanbulLocator()));
            insiderPage.clickLocationIstanbul();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(7)
    public void testDepartmentDropdownboxClick() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(insiderPage.getDepartmentDropdownboxLocator()));
            insiderPage.clickDepartmentDropdownbox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(8)
    public void testDepartmentQAClick() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(insiderPage.getDepartmentQALocator()));
            insiderPage.clickDepartmentQA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(9)
    public void testViewRoleClick() {
        try {
            insiderPage.clickViewRole();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
