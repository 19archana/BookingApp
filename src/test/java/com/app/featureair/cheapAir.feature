Feature: Validate the flight

  Scenario: Search for flight
    #Given Launch url
    When click oneway
    And Enter Source place "Banglore"
    And Enter Dest place "Pune"
    And select dept date "17 April 2025"
    And Select Traveller
    And Click Search
