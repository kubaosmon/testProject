@testUI
Feature: UI test

  @test1
  Scenario Outline: TestAmazonUI

    Given user goes to "https://www.amazon.com/"
    When user searches "<item>" in search box
    Then user sorts results by "Price: High to Low"
    And user selects top result
    Then user verifies image is displayed
    Then user go to "Sell on Amazon"
    Examples:
      | item         |
      | iphone       |
      | office table |
      | pillow       |
