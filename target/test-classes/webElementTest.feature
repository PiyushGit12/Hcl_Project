Feature: Test the webApplication
  Scenario: Select Elements from WebPage
    Given open browser to test the Application
    When passing extract string to TextField
    And passing extract string to PswdField
    And click all checkboxes
    And deselect one checkbox
    And select one radio
    And Select two values from multiple select
    But select one row from table
    And click on Submit button
    Then Successfully completed all Tests


