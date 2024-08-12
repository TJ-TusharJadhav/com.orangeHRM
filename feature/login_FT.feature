Feature:  login
  I want to use this template for my feature file

  @tag1
  Scenario: valid login
    Given open site
    When Enter Email
    And Enter password
    And Click login button
    Then dashboard should be opened

  
