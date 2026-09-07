package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.TestData;

public class PunchInTest extends BaseTest {

    @Test(
            dataProvider = "loginData",
            dataProviderClass = TestData.class
    )
    public void verifyPunchInToast(
            String username,
            String password
    ) {

        // Login
        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                username,
                password
        );


        // Dashboard
        DashboardPage dashboardPage =
                new DashboardPage(driver);


        // Punch In
        dashboardPage.clickPunchIn();


        // Verify toast displayed
        Assert.assertTrue(
                dashboardPage.isToastDisplayed(),
                "Toast message was not displayed after Punch In"
        );


        // Capture toast text
        String toastText =
                dashboardPage.getToastMessage();

        System.out.println(
                "Toast Message: " + toastText
        );


        // Basic validation
        Assert.assertFalse(
                toastText.trim().isEmpty(),
                "Toast message is empty"
        );
    }
}