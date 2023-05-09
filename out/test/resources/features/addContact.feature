Feature: AddContact
  @addContact
  Scenario: add contact positive test
    Given  User launches Chrome Browser
    When User opens PhoneBook Home Page
    And User clicks on LOGIN link
    And User enters valid data
    And User click on Login button
    Then User verifies SignOut button is displayed
    And User click on add link
    And enters valid data
    And click on save button
    And User quites browser