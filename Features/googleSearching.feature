
Feature: searching products

  Scenario Outline: Searching products on google

    Given I am on the google homepage

    When i enter the "<product_name>" in the search bar
    And I click on the search button

    Then i can see the search result successfully.

    Examples:

    | product_name |
    |     toy       |
    |   flower      |
    |  Ai chips      |