Feature: feature to draft test TDameritrade site

  @smoke
  Scenario Outline: user validate the components in this Why TD Ameritrade?
    Given launch the browser
    And verify the user is on Landing page
    When user clicks on tdameritrade application nav item "<NavItemName>" tab
    Then clicks on component "<ComponentName>" link
    And verify component page opened "<ComponentName>"
    And verify the userName and passWord on every Component page "<ComponentName>"
    And close the browser

    Examples: 
      | NavItemName        | ComponentName           |
      | Why TD Ameritrade? | Contact Us              |
      | Why TD Ameritrade? | Commission-Free Trading |
      | Why TD Ameritrade? | Satisfaction Guarantee  |
      | Why TD Ameritrade? | Our People              |
      | Why TD Ameritrade? | Accolades               |
      | Why TD Ameritrade? | Compare TD Ameritrade   |
  #@smoke
  #Scenario Outline: user validate the components in this Tools & Platforms
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName       | ComponentName                 |
      #| Tools & Platforms | Trader Offering               |
      #| Tools & Platforms | Investing Platforms           |
      #| Tools & Platforms | thinkorswim Trading Platforms |
      #| Tools & Platforms | Mobile Trading Apps           |
      #| Tools & Platforms | Compare Platforms             |
      #| Tools & Platforms | 24/5 Trading                  |
      #| Tools & Platforms | Order Execution               |
#
  #@smoke
  #Scenario Outline: user validate the components in this Investment Products
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName         | ComponentName                     |
      #| Investment Products | Stocks                            |
      #| Investment Products | Options                           |
      #| Investment Products | ETFs                              |
      #| Investment Products | Mutual Funds                      |
      #| Investment Products | Futures                           |
      #| Investment Products | Forex                             |
      #| Investment Products | Margin Trading                    |
      #| Investment Products | Cryptocurrency Trading            |
      #| Investment Products | Cash Solutions                    |
      #| Investment Products | Bonds & Fixed Income              |
      #| Investment Products | Annuities                         |
      #| Investment Products | IPOs                              |
      #| Investment Products | Dividend Reinvestment             |
      #| Investment Products | Collateral Lending Program        |
      #| Investment Products | Fully Paid Lending Income Program |
#
  #@smoke
  #Scenario Outline: user validate the components in this Guidance
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName | ComponentName                  |
      #| Guidance    | Investment Management Services |
      #| Guidance    | Goal Planning                  |
      #| Guidance    | Investment Philosophy          |
#
  #@smoke
  #Scenario Outline: user validate the components in this Retirement
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName | ComponentName               |
      #| Retirement  | Retirement Offering         |
      #| Retirement  | IRA Trading Account         |
      #| Retirement  | Rollover IRA                |
      #| Retirement  | IRA Guide                   |
      #| Retirement  | Small Business              |
      #| Retirement  | Retirement Income Solutions |
      #| Retirement  | Retirement Resources        |
#
  #@smoke
  #Scenario Outline: user validate the components in this Education
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName | ComponentName                       |
      #| Education   | Education Offering                  |
      #| Education   | Market News                         |
      #| Education   | TD Ameritrade Network               |
      #| Education   | Personal Finance                    |
      #| Education   | How to Invest                       |
      #| Education   | How to Trade                        |
      #| Education   | Planning for Retirement             |
      #| Education   | Account Types & Investment Products |
      #| Education   | Inherited Accounts                  |
#
  #@smoke
  #Scenario Outline: user validate the components in this Research
    #Given launch the browser
    #And verify the user is on Landing page
    #When user clicks on tdameritrade application nav item "<NavItemName>" tab
    #Then clicks on component "<ComponentName>" link
    #And verify component page opened "<ComponentName>"
    #And close the browser
#
    #Examples: 
      #| NavItemName | ComponentName                 |
      #| Research    | Markets                       |
      #| Research    | Stocks                        |
      #| Research    | Options Research              |
      #| Research    | Mutual Funds                  |
      #| Research    | ETFs                          |
      #| Research    | Bonds & CDs                   |
      #| Research    | Screeners                     |
      #| Research    | Ideas                         |
      #| Research    | Investor Movement Index (IMX) |
