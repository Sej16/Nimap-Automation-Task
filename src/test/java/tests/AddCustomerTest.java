package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import utils.TestData;

public class AddCustomerTest extends BaseTest {

    @Test(
            dataProvider = "customerData",
            dataProviderClass = TestData.class
    )
    public void verifyAddCustomer(
            String company,
            String contact,
            String mobile,
            String email
    ) {

        // ==========================================
        // STEP 1: LOGIN
        // ==========================================

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                "username",
                "password"
        );


        // ==========================================
        // STEP 2: OPEN CUSTOMER PAGE
        // ==========================================

        CustomerPage customerPage =
                new CustomerPage(driver);

        customerPage.openCustomerPage();


        // ==========================================
        // STEP 3: CLICK ADD CUSTOMER
        // ==========================================

        customerPage.clickAddCustomer();


        // ==========================================
        // STEP 4: ENTER PARAMETERIZED DATA
        // ==========================================

        customerPage.addCustomer(
                company,
                contact,
                mobile,
                email
        );


        // ==========================================
        // STEP 5: VALIDATE
        // ==========================================

        String message =
                customerPage.getSuccessMessage();

        System.out.println(
                "Customer creation message: " + message
        );

        Assert.assertFalse(
                message.trim().isEmpty(),
                "Customer success message was not displayed"
        );
    }
}