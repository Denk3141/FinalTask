Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Checking deleting an item from saved list
    Given User opens '<MainPage>' page
    And User click on Clothing button
    And User click on skirts
    And User clicks on the heart next to the first item
    And User click on Saved Lists in header
    And User clicks the delete from saved button
    Then User see a massage on screen '<message>'
    Examples:
      | MainPage                    | message               |
      | https://www.asos.com/women/ |You have no Saved Items|


    Scenario Outline: Checking home page button
      Given User opens '<MainPage>' page
      And User click on Clothing button
      And User click on skirts
      And User click on home page asos
      Then User checks that current url contains '<URL>'
      Examples:
        | MainPage                   | URL                   |
        | https://www.asos.com/women/| https://www.asos.com/ |

    Scenario Outline: Checking URL after search
      Given User opens '<MainPage>' page
      And User send '<search>' in search
      And User click on search button
      Then User check that current url contains '<URL>'
      Examples:
        | MainPage                    | search | URL  |
        | https://www.asos.com/women/ | Puma   | puma |

    Scenario Outline: Checking incorrect login email
      Given User opens '<MainPage>' page
      And User click on Saved Lists in header
      And User click on LogIn
      And User send '<mail>' in email address
      And User click on Sign In
      Then User sees a pop-up message '<fail>'
      Examples:
        | MainPage                    | mail | fail        |
        | https://www.asos.com/women/ | **** | Email fail! |

  Scenario Outline: Checking entrance without entering mail
    Given User opens '<MainPage>' page
    And User click on Saved Lists in header
    And User click on LogIn
    And User send '<pas>' on password
    And User click on Sign In
    Then User sees a pop-up message '<fail>'
    Examples:
      | MainPage                    | pas          | fail                         |
      | https://www.asos.com/women/ | 1235         | You need to type your email |

    Scenario Outline: Checking the search for goods by special characters
      Given User opens '<MainPage>' page
      And User send '<search>' in search
      And User click on search button
      Then User see a message after search '<message>'
      Examples:
        | MainPage              | search | message               |
        | https://www.asos.com/ | ****** | NOTHING MATCHES YOUR SEARCH |

     Scenario Outline: Checking currency change in header
       Given User opens '<MainPage>' page
       And User click on Header Currency Button
       And User click Select Currency
       And click Select RUB
       And click Update Preferences
       And User click on Clothing button
       And User click on skirts
       Then User check that currency contains '<cur>'
       Examples:
         | MainPage                    | cur    |
         | https://www.asos.com/women/ | руб.   |

     Scenario Outline: Checking Size Guide is visible
       Given User opens '<MainPage>' page
       And User click on Clothing button
       And User click on skirts
       And User click on the first item
       And User click on Size Guide button
       Then User check that the size window is visible
       Examples:
         | MainPage                    |
         | https://www.asos.com/women/ |

  Scenario Outline: Checking Shipping Restrictions is visible
    Given User opens '<MainPage>' page
    And User click on Clothing button
    And User click on skirts
    And User click on the first item
    And User click on Shipping Restrictions button
    Then User check that the Shipping Restrictions window is visible
    Examples:
      | MainPage                    |
      | https://www.asos.com/women/ |

  Scenario Outline: Checking who we are page
    Given User opens '<MainPage>' page
    And User click on About Us Button
    And User click on The ASOS Button
    Then User checks that current url(who we are) contains '<URL>'
    Examples:
      | MainPage                    | URL                                    |
      | https://www.asos.com/women/ | https://www.asos.com/about/who-we-are/ |

















