$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddNewCreateAcc.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 100400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "land to Home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "go to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TalentLMS.go_to_login_page()"
});
formatter.result({
  "duration": 7732425200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Data",
  "description": "",
  "id": "login-functionality;data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Enter \"Team1\" in userName or Email input field",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Enter \"Team1234\" in password input field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click \"add user button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should see \"Add user\" title",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "verify following fields names",
  "rows": [
    {
      "cells": [
        "First name",
        "Last name",
        "Email address",
        "Username",
        "Password",
        "Bio",
        "User type",
        "Time zone",
        "Language"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "enter following data to create new user",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "emailAddress",
        "username",
        "password"
      ],
      "line": 31
    },
    {
      "cells": [
        "Elon",
        "Musk",
        "muskteslaEl@gmail.com",
        "Elonmask",
        "VeryH@rd@$$312!"
      ],
      "line": 32
    },
    {
      "cells": [
        "Leo",
        "Messi",
        "messgmailMe@gmail.com",
        "Messileo",
        "VeryH@rd@$$312!"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Team1",
      "offset": 7
    }
  ],
  "location": "TalentLMS.enter_in_userName_or_Email_input_field(String)"
});
formatter.result({
  "duration": 31983800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Team1234",
      "offset": 7
    }
  ],
  "location": "TalentLMS.enter_in_password_input_field(String)"
});
formatter.result({
  "duration": 29610600,
  "status": "passed"
});
formatter.match({
  "location": "TalentLMS.user_click_on_login_button()"
});
formatter.result({
  "duration": 5544191400,
  "status": "passed"
});
formatter.match({
  "location": "TalentLMS.click_add_user_button()"
});
formatter.result({
  "duration": 1290492800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add user",
      "offset": 17
    }
  ],
  "location": "TalentLMS.user_should_see_title(String)"
});
formatter.result({
  "duration": 46167300,
  "status": "passed"
});
formatter.match({
  "location": "DataCreate.verify_following_fields_names(DataTable)"
});
formatter.result({
  "duration": 5650019300,
  "status": "passed"
});
formatter.match({
  "location": "DataCreate.enter_following_data_to_create_new_user(DataTable)"
});
formatter.result({
  "duration": 31683598200,
  "status": "passed"
});
formatter.after({
  "duration": 5857749500,
  "status": "passed"
});
});