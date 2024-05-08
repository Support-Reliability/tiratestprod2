package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("a <user_type> wants to register")
    public void aWantsToRegister(String user_type) {
        System.out.println("Executing step: a <user_type> wants to register");
    }

    @When("the user submits registration with <username> and <password>")
    public void theUserSubmitsRegistrationWithAnd(String username, String password) {
        System.out.println("Executing step: the user submits registration with <username> and <password>");
    }

    @Then("the registration should be <result>")
    public void theRegistrationShouldBe(String result) {
        System.out.println("Executing step: the registration should be <result>");
    }

    @And("the user logs in with <username> and <password>")
    public void theUserLogsInWithAnd(String username, String password) {
        System.out.println("Executing step: the user logs in with <username> and <password>");
    }

    @Then("the login should be <login_result>")
    public void theLoginShouldBe(String login_result) {
        System.out.println("Executing step: the login should be <login_result>");
    }

    @Given("a registered user <username> logged in")
    public void aRegisteredUserLoggedIn(String username) {
        System.out.println("Executing step: a registered user <username> logged in");
    }

    @When("the user searches for <product_name>")
    public void theUserSearchesFor(String product_name) {
        System.out.println("Executing step: the user searches for <product_name>");
    }

    @Then("the search results should include items related to <product_name>")
    public void theSearchResultsShouldIncludeItemsRelatedTo(String product_name) {
        System.out.println("Executing step: the search results should include items related to <product_name>");
    }

    @When("the user selects a product to add to cart")
    public void theUserSelectsAProductToAddToCart() {
        System.out.println("Executing step: the user selects a product to add to cart");
    }

    @And("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        System.out.println("Executing step: the user proceeds to checkout");
    }

    @Then("the purchase should be <purchase_result>")
    public void thePurchaseShouldBe(String purchase_result) {
        System.out.println("Executing step: the purchase should be <purchase_result>");
    }

    @Given("a user <username> has placed an order")
    public void aUserHasPlacedAnOrder(String username) {
        System.out.println("Executing step: a user <username> has placed an order");
    }

    @When("the user decides to cancel the order")
    public void theUserDecidesToCancelTheOrder() {
        System.out.println("Executing step: the user decides to cancel the order");
    }

    @Then("the cancellation should be successful")
    public void theCancellationShouldBeSuccessful() {
        System.out.println("Executing step: the cancellation should be successful");
    }

}
