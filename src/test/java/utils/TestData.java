package utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {
                        "username",
                        "password"
                }

        };
    }


    @DataProvider(name = "customerData")
    public Object[][] customerData() {

        return new Object[][]{

                {
                        "QA Test Company 1",
                        "Rahul Sharma",
                        "9876543210",
                        "rahul.qa1@gmail.com"
                },

                {
                        "QA Test Company 2",
                        "Amit Patil",
                        "9876543211",
                        "amit.qa2@gmail.com"
                }

        };
    }
}