Feature: Login Verification

  @Test
  Scenario: Validate invalid login
    Given User is in the landing page
    When User enters invalid credentials
    Then Error message should display
