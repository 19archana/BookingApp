Feature: Validate LoginPage

  Scenario: Validate username and password
   # Given launch url
    When Enter username "Archana1992"
    And Enter password "archana1992"
    And click LoginButton
    # Then Navvigate to Nextpage
