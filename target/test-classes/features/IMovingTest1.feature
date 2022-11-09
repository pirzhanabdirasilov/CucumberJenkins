
  @Smoke
  Feature: Confirmation Page functionality

  Background:
    Given User is on the "https://qa.imoving.com/"
    Then user on qa.moving


  Scenario: Verify Show on Map button in Moving Journey section works
    Given user is on confirmation page
    Given User should navigate to moving journey button
    And User clicks on moving journey button
    Then User clicks show on map button
    Then Map should appear underneath

  Scenario: Verify Addresses Restrictions button works
    Given user is on confirmation page
    Given User should navigate to addresses restrictions button
    And User clicks on addresses restrictions button
    Then Information chart should appear underneath

  Scenario: Verify Inventory-Items button works
    Given user is on confirmation page
    Given User should navigate to inventory items button
    And User clicks on inventory items button
    Then User should see 7 items or Less text in chart underneath

#  Scenario: Verify Inventory-Boxes button works
#    Given user is on confirmation page
#    Given User should navigate to inventory-boxes button
#    And User  clicks on inventory-boxes button
#    Then Box type chart should appear underneath
#
#  Scenario: Verify Fees button works promptly
#    Given user is on confirmation page
#    Given User should navigate to Fees button
#    And User clicks Fees button
#    Then Fee Name chart should appear
#
#  Scenario: Verify that I have read checkbox is clickable
#    Given user is on confirmation page
#    Given User should navigate to I have read checkbox
#    And User clicks I have read checkbox
#
#  Scenario: Verify that Continue to payment button works
#    Given user is on confirmation page
#    Given User should navigate to I have read checkbox
#    And User clicks I have read checkbox
#    Given User should navigate to Continue to payment button
#    And User clicks on Continue to payment button
#    Then Browser should redirect to up sale page
#
#  Scenario: Verify that terms and conditions link clickable
#    Given user is on confirmation page
#    Given user should navigate to terms and conditions link
#    And user should click this link
#    Then terms and conditions window should appear

