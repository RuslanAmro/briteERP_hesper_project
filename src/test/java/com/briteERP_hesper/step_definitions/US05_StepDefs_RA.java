package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.US05_NewCustomerPage_RA;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US05_StepDefs_RA {

    US05_NewCustomerPage_RA newCustomerPageRa = new US05_NewCustomerPage_RA();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user should be able to click on sales module")
    public void user_should_be_able_to_click_on_sales_module() {
        wait.until(ExpectedConditions.elementToBeClickable(newCustomerPageRa.salesTab));
        newCustomerPageRa.salesTab.click();
    }

    @When("user able to click the customers button")
    public void user_able_to_click_the_customers_button() {
        wait.until(ExpectedConditions.elementToBeClickable(newCustomerPageRa.customersTab));
        newCustomerPageRa.customersTab.click();
    }

    @Then("user should be able to click create button")
    public void user_should_be_able_to_click_create_button() {
        BrowserUtils.waitFor(2);
        wait.until(ExpectedConditions.elementToBeClickable(newCustomerPageRa.createBtn));
        newCustomerPageRa.createBtn.click();
        BrowserUtils.waitFor(2);

    }

    @When("user create a new customer by filling name input only")
    public void user_create_a_new_customer_by_filling_name_input_only() {
        BrowserUtils.waitFor(3);
        newCustomerPageRa.nameInputBox.sendKeys("Brus");
    }

    @When("user click the save button")
    public void user_click_the_save_button() {
        BrowserUtils.waitFor(2);
        newCustomerPageRa.saveBtn.click();
    }

    @Then("the name user entered should be displayed")
    public void the_name_user_entered_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String expectedName = "Brus";
        String actualName = newCustomerPageRa.name.getText();

        Assert.assertEquals(expectedName, actualName);

    }

    @Given("user is on the customer page")
    public void user_is_on_the_customer_page() {
        BrowserUtils.waitFor(2);
        newCustomerPageRa.customersTab.click();
    }

    @When("user should be able to click any customer")
    public void user_should_be_able_to_click_any_customer() {

        newCustomerPageRa.customer.click();
    }

    @Then("user able to click edit button")
    public void user_able_to_click_edit_button() {

        BrowserUtils.waitFor(3);

        newCustomerPageRa.editBtn.click();

        newCustomerPageRa.nameInputBox.sendKeys("Talia");

        newCustomerPageRa.saveBtn.click();
    }


    @Given("user create a new customer")
    public void user_create_a_new_customer() {
        BrowserUtils.waitFor(2);
        newCustomerPageRa.createBtn.click();
    }

    @When("user not going to input any name and should click the save button and see warning message")
    public void user_not_going_to_input_any_name_and_should_click_the_save_button_and_see_warning_message() {

        newCustomerPageRa.saveBtn.click();

    }
}
