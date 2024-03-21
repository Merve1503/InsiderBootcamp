package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InsiderPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[contains(.,'Company')]")
    private WebElement companyTab;

    @FindBy(xpath = "//a[.='Careers']")
    private WebElement careersOption;

    @FindBy(xpath = "//div[@class='button-group d-flex flex-row']/a[.='Find your dream job']")
    private WebElement insiderFindJob;

    @FindBy(xpath = "//form[@id='top-filter-form']//span[@class='select2-selection select2-selection--single']/span[.='×All']")
    private WebElement locationDropdownbox;

    @FindBy(xpath = "//li[.='Istanbul, Turkey']")
    private WebElement locationIstanbul;

    @FindBy(xpath = "//form[@id='top-filter-form']/div[2]//span[@class='select2-selection select2-selection--single']/span[.='×All']")
    private WebElement departmentDropdownbox;

    @FindBy(xpath = "//li[.='Quality Assurance']")
    private WebElement departmentQA;

    @FindBy(xpath = "//a[@href='https://jobs.lever.co/useinsider/6013cc18-8219-4587-a78c-9325c137b436']")
    private WebElement viewRole;

    public InsiderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCompanyTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(companyTab)).click();
    }

    public void clickCareersOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(careersOption)).click();
    }

    public void clickInsiderFindJob() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(insiderFindJob)).click();
    }

    public void clickLocationDropdownbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locationDropdownbox)).click();
    }

    public void clickLocationIstanbul() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement locationIstanbulElement = wait.until(ExpectedConditions.elementToBeClickable(locationIstanbul));
        locationIstanbulElement.click();
    }

    public void clickDepartmentDropdownbox() {
        departmentDropdownbox.click();
    }

    public void clickDepartmentQA() {
        departmentQA.click();
    }

    public void clickViewRole() {
        viewRole.click();
    }

    public By getCompanyTabLocator() {
        return By.xpath("//a[contains(.,'Company')]");
    }

    public By getCareersOptionLocator() {
        return By.xpath("//a[.='Careers']");
    }

    public By getLocationDropdownboxLocator() {
        return By.xpath("//form[@id='top-filter-form']//span[@class='select2-selection select2-selection--single']/span[.='×All']");
    }

    public By getLocationIstanbulLocator() {
        return By.xpath("//li[.='Istanbul, Turkey']");
    }

    public By getDepartmentDropdownboxLocator() {
        return By.xpath("//form[@id='top-filter-form']/div[2]//span[@class='select2-selection select2-selection--single']/span[.='×All']");
    }

    public By getDepartmentQALocator() {
        return By.xpath("//li[.='Quality Assurance']");
    }
}
