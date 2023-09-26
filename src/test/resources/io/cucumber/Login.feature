Feature: Visit and check ML Shop in web

  Scenario: Visit ML Shop and Log in working credential
    Given I am on the ML Shop Website
    When I click user profile info
    And Enter my working credential
    And I click Log in button
    Then One Time Pin pop should be visible

  Scenario: Enter OTP in the One Time Password modal
    Given I am on the One Time Pin Pop up modal
    And I enter the One Time Password

