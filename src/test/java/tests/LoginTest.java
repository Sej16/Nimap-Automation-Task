package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestData;

public class LoginTest extends BaseTest {

    @Test(
            dataProvider = "loginData",
            dataProviderClass = TestData.class
    )
    public void verifyLogin(
            String username,
            String password
    ) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                username,
                password
        );

        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Current URL: " + currentUrl
        );

        Assert.assertNotEquals(
                currentUrl,
                "https://test.fieldforceconnect.com/"
        );
    }
}