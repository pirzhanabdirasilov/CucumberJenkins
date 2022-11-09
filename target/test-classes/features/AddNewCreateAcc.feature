Feature: Login functionality

  Background: land to Home page
    Given go to login page

  @smoke
  Scenario: Login with valid credentials
    Given Enter "Team1" in userName or Email input field
    And Enter "Team1234" in password input field
    When user click on login button
    Then user should successfully logged in
    When Click "add user button
    Then user should see "Add user" title
    And in field First name white first name
    And in field Last name write last name
    And in field Email address write
    Then  user add courses
    And user add User


  @Regression
  Scenario: Data
    Given Enter "Team1" in userName or Email input field
    And Enter "Team1234" in password input field
    When user click on login button
    When Click "add user button
    Then user should see "Add user" title
    And verify following fields names
      | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
    And enter following data to create new user
      | firstName | lastName | emailAddress          | username | password        |
      | Elon      | Musk     | muskteslaEl@gmail.com | Elonmask | VeryH@rd@$$312! |
      | Leo       | Messi    | messgmailMe@gmail.com | Messileo | VeryH@rd@$$312! |