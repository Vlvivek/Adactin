Feature: Automate Adactin Website

  Scenario Outline: fill the login field
    Given adactin login page launched
    Then user fill the "<username>" and "<password>"
    And click loginButton

    Examples: 
      | username   | password |
      | vivekanath | 82QD56   |

  Scenario Outline: search hotels from specific location
    When user entering the "<location>","<hotel>" and "<roomType>"
    Then user will enter the "<noOfRooms>","<CID>" and "<COD>"
    And user put the "<adults>" and "<childrens>"

    Examples: 
      | location | hotel        | roomType     | noOfRooms | CID        | COD        | adults    | childrens |
      | Paris    | Hotel Hervey | Super Deluxe | 2 - Two   | 20/09/2023 | 24/09/2023 | 3 - Three | 1 - One   |

  Scenario: confirm the hotel
    Then click radioButton then continueButton

  Scenario Outline: book the Hotel
    When user enter the "<firstName>","<lastName>" and "<address>"
    Then user entering the "<creditCardNo>","<creditCardType>"
    And user enter the card value "<expriyMonth>","<expriyYear>" and "<cvv>"
    Then click bookButton
    And take ScreenShot

    Examples: 
      | firstName | lastName | address                       | creditCardNo     | creditCardType   | expriyMonth | expriyYear | cvv |
      | vivek     | v        | abc street,5thcross,trichy-19 | 1234567891012130 | American Express | March       |       2029 | 456 |
