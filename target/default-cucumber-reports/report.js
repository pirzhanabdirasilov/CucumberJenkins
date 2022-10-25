$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/IMovingTest1.feature");
formatter.feature({
  "line": 3,
  "name": "Confirmation Page functionality",
  "description": "",
  "id": "confirmation-page-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 446600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the \"https://qa.imoving.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://qa.imoving.com/",
      "offset": 16
    }
  ],
  "location": "Test1Imoving.user_is_on_the(String)"
});
formatter.result({
  "duration": 18601824800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify Moving Journey Button works",
  "description": "",
  "id": "confirmation-page-functionality;verify-moving-journey-button-works",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on confirmation page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User should navigate to moving journey button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on moving journey button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "pick up address should appear underneath",
  "keyword": "Then "
});
formatter.match({
  "location": "Test1Imoving.user_is_on_confirmation_page()"
});
formatter.result({
  "duration": 107311899,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cFind Movers[1]\u003e but was:\u003cFind Movers[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat MethodFactory.AssetHelper.assertText(AssetHelper.java:16)\r\n\tat PageWeb.Test1IMoving.assertFindMovers(Test1IMoving.java:13)\r\n\tat steps_defs.IMovingTest1.Test1Imoving.user_is_on_confirmation_page(Test1Imoving.java:17)\r\n\tat ✽.Given user is on confirmation page(features/IMovingTest1.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Test1Imoving.user_should_navigate_to_moving_journey_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test1Imoving.user_clicks_on_moving_journey_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test1Imoving.pick_up_address_should_appear_underneath()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1248864600,
  "status": "passed"
});
formatter.before({
  "duration": 119801,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the \"https://qa.imoving.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://qa.imoving.com/",
      "offset": 16
    }
  ],
  "location": "Test1Imoving.user_is_on_the(String)"
});
