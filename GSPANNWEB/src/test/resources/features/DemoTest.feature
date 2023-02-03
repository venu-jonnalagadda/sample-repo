Feature: feature to draft test amazon site

  @tag4
  Scenario Outline: user should able to add the prduct in cart list
    Given launch the browser
    And verify the user is on Landing page
    When user clicks on nav item "<name>" tab
    Then user is on the product listing page
    Then clicks on product "<productname>" link
    Then user on click the product
    Then user click on add to cart
    And verify product added to cart

    Examples: 
      | name    | productname |
      | Mobiles | Samsung     |
  @tag4
  Scenario Outline: verify the product deatils
    Given launch the browser
    And verify the user is on Landing page
    When user clicks on nav item "<name>" tab
    Then user is on the product listing page
    Then clicks on product "<productname>" link
    Then user on click the product
    When user click on see more product details link
    And user able to see all the description about the product

    Examples: 
      | name   | productname |
      | Mobiles | Samsung     |

  #@tag4
  #Scenario Outline: User verify the deliver location
    #Given user is on Landing page
    #When user click on deliver to icon
    #Then user on choose your location window
    #Then user enter valid pincode<pincode>
    #And user click on apply button
    #Then verify deliver to have the correct location<locationname>
#
    #Examples: 
      #| pincode | locationname |
      #| samsung | link         |
