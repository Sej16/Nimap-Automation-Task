package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // ==========================================
    // LOCATORS
    // ==========================================

    // Email / Mobile Number
    private By username = By.name("username");

    // Password
    private By password = By.name("password");

    // Sign In
    private By loginButton =
            By.xpath("//button[contains(.,'Sign In')]");


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }


    // ==========================================
    // ENTER USERNAME
    // ==========================================

    public void enterUsername(String user) {

        WebElement usernameField =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(username)
                );

        usernameField.clear();

        usernameField.sendKeys(user);
    }


    // ==========================================
    // ENTER PASSWORD
    // ==========================================

    public void enterPassword(String pass) {

        WebElement passwordField =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(password)
                );

        passwordField.clear();

        passwordField.sendKeys(pass);
    }


    // ==========================================
    // CLICK SIGN IN
    // ==========================================

    public void clickLogin() {

        WebElement signInButton =
                wait.until(
                        ExpectedConditions.elementToBeClickable(loginButton)
                );

        signInButton.click();
    }


    // ==========================================
    // COMPLETE LOGIN
    // ==========================================

    public void login(String user, String pass) {

        enterUsername(user);

        enterPassword(pass);

        clickLogin();
    }
}