Feature: Tira Beauty Ecommerce Application API Testing
@Regression @Smoke @healthcheck @Regression @healthcheck @Smoke 

  Scenario: User Registration and Login Process
    Given a <user_type> wants to register
    When the user submits registration with <username> and <password>
    Then the registration should be <result>
    And the user logs in with <username> and <password>
    Then the login should be <login_result>

  Scenario: Product Search and Purchase
    Given a registered user <username> logged in
    When the user searches for <product_name>
    Then the search results should include items related to <product_name>
    When the user selects a product to add to cart
    And the user proceeds to checkout
    Then the purchase should be <purchase_result>

  Scenario: User Cancel Order
    Given a user <username> has placed an order
    When the user decides to cancel the order
    Then the cancellation should be successful
