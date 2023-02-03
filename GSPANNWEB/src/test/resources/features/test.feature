#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      #

   
   Scenario Outline: user should able to add the prduct in cart list
      Given user is on Landing page
	    When user clicks on mobile category <name> tab
	    Then user is on the product listing page
	    Then clicks on product<productname> link
	    Then user on product details page
		  Then user click on add to cart
		  And verify product added to cart
		  
		  Examples: 
		    | name   | productname   |            
        | mobile | samsung |
        
      
   Scenario Outline: verify the product deatils 
        Given user is on Landing page
	    When user clicks on mobile category <name> tab
	    Then user is on the product listing page
	    Then clicks on product<productname> link
	    Then user on product details page
		  When user click on see more product details link
		  Then user navigates to product technical details page
		  And user able to see all the description about the product
		  
		  Examples: 
		   | name   | productname   |            
        | mobile | samsung |
        
    
    Scenario Outline: User verify the deliver location  
       Given user is on Landing page
       When user click on deliver to icon
       Then user on choose your location window
       Then user enter valid pincode<pincode>
		   And user click on apply button
		   Then verify deliver to have the correct location<locationname>
		    
		   Examples: 
		    | pincode    | locationname |            
        | samsung | link  |  
		  