Feature: Search by keyword

  Scenario Outline: Searching for a item which is present on Amazon
    Given Serena is researching things on the Amazon
    When she looks up "<Item>"
    Then she should see information about "<Item>"

    Examples: 
      | Item     |
      | mobiles  |
      | computer |

  Scenario: Searching for a item which is not present on Amazon
    Given Serena is researching things on the Amazon
    When she looks up "abdnsldfjdslfkjsdfldskjfs"
    Then she should see no result found page
