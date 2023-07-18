package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.HomePage;
import com.briteERP_hesper.pages.LoginPage;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class US06_add_product_to_inventory {

  HomePage HomePage = new HomePage();

    @When("user click on inventory tab")
    public void user_click_on_inventory_tab() {
        HomePage.InventoryTab.click();
    }
    @When("user click on products")
    public void user_click_on_products() {
        HomePage.ProductsButton.click();
    }
    @When("user click on create button")
    public void user_click_on_create_button() {
        HomePage.CreateButton.click();
    }
    @When("user input product name as {string}")
    public void user_input_product_name_as(String ProductName) {
        HomePage.ProductNameField.sendKeys(ProductName);



    }
    @When("click on save button")
    public void click_on_save_button() {
        HomePage.saveButton.click();

    }

    @Then("verify the information of the customer which the {string} entered should be displayed")
    public void verifyTheInformationOfTheCustomerWhichTheEnteredShouldBeDisplayed(String arg0) {
        String actualUserNameText = HomePage.customerInformation.getText();

        Assert.assertEquals(actualUserNameText, arg0);
    }

    @Then("click on any product")
    public void click_on_any_product() {
        HomePage.product.click();
    }
    @Then("clicking the edit button")
    public void clicking_the_edit_button() {
        HomePage.editButton.click();
    }
    @Then("verify all the boxes entered information can be editable again.")
    public void verify_all_the_boxes_entered_information_can_be_editable_again() {

    }

}
