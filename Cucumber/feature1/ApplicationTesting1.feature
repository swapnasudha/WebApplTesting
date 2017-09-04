Feature:Test smoke scenario

Scenario: Test login with valid credentials
Given open a firefox and start application
When I enter valid useername and password
Then user should be able to login successfully