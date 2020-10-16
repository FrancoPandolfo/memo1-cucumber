Feature: Calculator

  Scenario: add 2 and 2 should return 4
    Given I have a calculator
    When I add 2 and 2
    Then I get 4
    
	Scenario: substract 4 and 2 should return 2
		Given I have a calculator
		When I substract 4 and 2
		Then I get 2
		
	Scenario: muliply 3 and 2 should return 6
		Given I have a calculator
		When I multiply 3 and 2
		Then I get 6