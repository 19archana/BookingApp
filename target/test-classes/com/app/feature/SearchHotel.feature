Feature: Validate search hotel

  Background: Search Hotel
    # Given launch url
    When Enter username "Archana1992"
    And Enter password "arch@1992"
    And click LoginButton

  # Then Navvigate to Nextpage
  Scenario: Search Hotel
    When Enter locations "Melbourne"
    And Enter searchhotels "Hotel Sunshine"
    And Enter roomtype "Double"
    And Enter Number of rooms "2-Two"
    And Enter Check in date "16/04/2025"
    And Enter Check out date "17/04/2025"
    And Enter Adults per room "2-Two"
    And Enter Children per room "2-Two"
    And Click Search

  Scenario: Select hotel
    When Click Hotel
    And Click Continue
