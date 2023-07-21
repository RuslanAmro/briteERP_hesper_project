package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.HJ_LoginPage;
import com.briteERP_hesper.pages.LoginPage;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHJStepDefinitions {

           LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get("https://app.briteerp.com/web/login");
    }

    @When("the user enters valid sales and expense manager credentials {string} and {string}")
    public void the_user_enters_valid_sales_and_expense_manager_credentials(String EmailAddress ,String  password) {
        loginPage.userName.sendKeys(EmailAddress);
        loginPage.password.sendKeys(password);

    }
    @And("the user clicks on the Login button")
    public void theUserClicksOnTheLoginButton() {
        loginPage.submitBtn.click();
    }

    @And("the user hitting the Enter key on the keyboard to login")
    public void theUserHittingTheEnterKeyOnTheKeyboardToLogin() {
        loginPage.submitBtn.sendKeys(Keys.ENTER);

    }
HJ_LoginPage loginPageHJ = new HJ_LoginPage();


    @Then("the user's accountName should be displayed on the dashboard")
    public void theUserSAccountNameShouldBeDisplayedOnTheDashboard() {
        loginPageHJ.accountName.isDisplayed();
    }


    @When("the user enters invalid credentials {string} and {string}")
    public void the_user_enters_invalid_credentials_and(String invalidUser, String invalidPassword) {
        loginPage.userName.sendKeys("invalid@info.com");
        loginPage.password.sendKeys("invalid");
    }


    @Then("the user should see an error message saying {string}")
    public void the_user_should_see_an_error_message_saying(String expectedMsg) {

       String actualMsg = loginPageHJ.wrongMsg.getText();
        expectedMsg = "Wrong login/password";
        Assert.assertEquals(actualMsg,expectedMsg);

    }

    @When("the user clicks on the Login button without entering the required credentials")
    public void theUserClicksOnTheLoginButtonWithoutEnteringTheRequiredCredentials() {
        loginPage.submitBtn.click();

    }

    @Then("the user should see a message saying {string}")
    public void the_user_should_see_a_message_saying(String expectedEmptyMsg) {

    }
}
