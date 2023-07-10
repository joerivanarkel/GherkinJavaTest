Feature: calculator
    In order to avoid silly mistakes
    As a math idiot
    I want to be told the sum of two numbers

Scenario Outline: Add two numbers
    Given The first number is <first>
    And The second number is <second>
    When The two numbers are added
    Then The result should be <result>

    Examples:
        | first | second | result |
        | 50    | 70     | 120    |
        | 10    | 20     | 30     |
        | 30    | 40     | 70     |
