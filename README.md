Task 1 - Automation Testing 

Performed automation testing using Selenium WebDriver and TestNG to automate and validate application functionalities.
The automation source code and test execution evidence are included in this repository, with the screenshot showing 1 test passed successfully.



Task 2 - Manual Testing

Performed manual testing by creating and executing test cases, validating expected vs. actual results, and identifying defects. 
Test cases and execution results are documented in the Excel sheet provided as evidence.



Task 3: API Testing – Nimap Machine Test

This section contains the API Testing performed as part of the Nimap QA Machine Test.

API testing was performed using Postman to validate API requests, responses, authentication, status codes, response data, and negative scenarios.


🛠️ Tools & Technologies

* Postman – API testing
* REST API – API communication
* JSON** – Request and response data
* HTTP Methods – GET, POST
* Git & GitHub – Version control and submission



🧪 API Testing Performed

The following APIs were tested:

 1. Login API

Method: `POST`

Purpose:
To verify that a user can successfully authenticate using valid credentials.

Validations Performed:

* Request is sent with valid credentials.
* Response status code is verified.
* Response body is validated.
* Authentication response/token is verified where applicable.

Expected Result:

* API should return a successful response.
* Valid login credentials should authenticate the user.

---

2. Invalid Login API

Method: `POST`

Purpose:
To verify the API behavior when invalid login credentials are provided.

Test Scenario:

* Invalid username/password is provided.
* API response is checked.

Expected Result:

* API should reject invalid credentials.
* Appropriate error response/status code should be returned.
* User should not be authenticated.

---

3. Add Customer API

**Method:** `POST`

Purpose:
To verify that a new customer can be successfully created through the API.

Validations Performed:

* Request body validation.
* Required fields validation.
* Response status code validation.
* Response body validation.
* Created customer details validation.

Expected Result:

* Customer should be successfully created.
* API should return an appropriate success status code.
* Response should contain the created customer information.

---

4. Get Customer API

Method: `GET`

Purpose:
To verify that customer details can be retrieved successfully.

Validations Performed:

* GET request execution.
* Response status code validation.
* Response body validation.
* Customer data verification.

Expected Result:

* API should return customer details successfully.
* Response should contain the expected customer information.



🔐 Authentication

Authentication was tested using the credentials/token mechanism provided by the API.

The authentication response was used where required to access protected APIs.

Sensitive credentials and authentication tokens are **not stored in the repository**.



✅ Test Validations

The following validations were performed during API testing:

* HTTP status code verification
* Response body verification
* Request body validation
* Required field validation
* Authentication validation
* Positive test scenarios
* Negative test scenarios
* API response verification
* Error response validation



 📊 API Test Summary

| API               | Method | Scenario               | Expected Result                 |
| ----------------- | ------ | ---------------------- | ------------------------------- |
| Login API         | POST   | Valid credentials      | User successfully authenticated |
| Invalid Login API | POST   | Invalid credentials    | Authentication rejected         |
| Add Customer API  | POST   | Valid customer details | Customer created successfully   |
| Get Customer API  | GET    | Retrieve customer      | Customer details returned       |



📸 Screenshots

Screenshots of the API test execution are included in this repository:

* `Login API.png`
* `Invalid login API.png`
* `Add Customer API.png`
* `Get Customer API.png`

These screenshots provide evidence of the request execution and API responses.




