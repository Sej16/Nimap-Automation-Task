package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerPage {

    private WebDriver driver;
    private WebDriverWait wait;


    // ==========================================
    // TEMPORARY LOCATORS
    // Replace after inspecting actual HTML
    // ==========================================

    private By customerMenu =
            By.xpath("//*[contains(text(),'Customer')]");

    private By addCustomerButton =
            By.xpath("//*[contains(text(),'Add Customer')]");

    private By companyName =
            By.xpath("//input[contains(@placeholder,'Company')]");

    private By contactPerson =
            By.xpath("//input[contains(@placeholder,'Contact')]");

    private By mobileNumber =
            By.xpath("//input[contains(@placeholder,'Mobile')]");

    private By email =
            By.xpath("//input[contains(@placeholder,'Email')]");

    private By submitButton =
            By.xpath("//button[contains(.,'Submit')]");

    // Temporary success locator
    private By successMessage =
            By.xpath("//*[contains(@class,'toast')]");


    public CustomerPage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }


    public void openCustomerPage() {

        WebElement menu =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                customerMenu
                        )
                );

        menu.click();
    }


    public void clickAddCustomer() {

        WebElement addButton =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                addCustomerButton
                        )
                );

        addButton.click();
    }


    public void enterCompanyName(String company) {

        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                companyName
                        )
                );

        element.clear();
        element.sendKeys(company);
    }


    public void enterContactPerson(String contact) {

        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                contactPerson
                        )
                );

        element.clear();
        element.sendKeys(contact);
    }


    public void enterMobileNumber(String mobile) {

        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                mobileNumber
                        )
                );

        element.clear();
        element.sendKeys(mobile);
    }


    public void enterEmail(String emailAddress) {

        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                email
                        )
                );

        element.clear();
        element.sendKeys(emailAddress);
    }


    public void clickSubmit() {

        WebElement submit =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                submitButton
                        )
                );

        submit.click();
    }


    public String getSuccessMessage() {

        WebElement message =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                successMessage
                        )
                );

        return message.getText();
    }


    public void addCustomer(
            String company,
            String contact,
            String mobile,
            String emailAddress
    ) {

        enterCompanyName(company);

        enterContactPerson(contact);

        enterMobileNumber(mobile);

        enterEmail(emailAddress);

        clickSubmit();
    }
}