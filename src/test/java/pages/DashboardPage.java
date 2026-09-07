package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Replace with actual locator after inspection
    private By punchInButton =
            By.xpath("//*[contains(text(),'Punch In')]");

    // Replace with actual toast locator after inspection
    private By toastMessage =
            By.xpath("//*[contains(@class,'toast')]");

    public DashboardPage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }

    public void clickPunchIn() {

        WebElement button =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                punchInButton
                        )
                );

        button.click();
    }

    public String getToastMessage() {

        WebElement toast =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                toastMessage
                        )
                );

        return toast.getText();
    }

    public boolean isToastDisplayed() {

        try {

            WebElement toast =
                    wait.until(
                            ExpectedConditions.visibilityOfElementLocated(
                                    toastMessage
                            )
                    );

            return toast.isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}