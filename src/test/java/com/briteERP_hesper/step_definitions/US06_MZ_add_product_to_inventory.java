package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.US06_MZ_HomePage;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US06_MZ_add_product_to_inventory {

  US06_MZ_HomePage US06_MZ_HomePage = new US06_MZ_HomePage();

    @When("user click on inventory tab")
    public void user_click_on_inventory_tab() {
        US06_MZ_HomePage.InventoryTab.click();
    }
    @When("user click on products")
    public void user_click_on_products() {
        US06_MZ_HomePage.ProductsButton.click();
    }
    @When("user click on create button")
    public void user_click_on_create_button() {
        US06_MZ_HomePage.CreateButton.click();
    }
    @When("user input product name as {string}")
    public void user_input_product_name_as(String ProductName) {
        US06_MZ_HomePage.ProductNameField.sendKeys(ProductName);
      //  Assert.assertEquals();



    }
    @When("click on save button")
    public void click_on_save_button() {
        US06_MZ_HomePage.saveButton.click();

    }



    @Then("click on any product")
    public void click_on_any_product() {
        US06_MZ_HomePage.product.click();
    }
    @Then("clicking the edit button")
    public void clicking_the_edit_button() {
     US06_MZ_HomePage.editButton.click();
    }
    @Then("verify all the boxes entered information can be editable again.")
    public void verify_all_the_boxes_entered_information_can_be_editable_again() {
       // Assert.assertTrue(US06_MZ_HomePage.customerInformation.isEnabled()&& US06_MZ_HomePage.customerInformation.isDisplayed());
            Assert.assertTrue(US06_MZ_HomePage.FirstCheckBox.isDisplayed());
        Assert.assertTrue(US06_MZ_HomePage.SecondCheckBox.isDisplayed());
        Assert.assertTrue(US06_MZ_HomePage.ThirdCheckBox.isDisplayed());

    }

    @Then("verify the {string} of the customer which the user entered should be displayed")
    public void verifyTheOfTheCustomerWhichTheUserEnteredShouldBeDisplayed(String arg0) {
        WebElement name = Driver.getDriver().findElement(By.xpath("(//*[text()='"+arg0+"'] )[2]"));
        Assert.assertEquals(    name.isDisplayed(), true);
    //    name.
    }
}
 //wait.until(ExpectedConditions.elementToBeClickable(newCustomerPageRa.salesTab));
    //    newCustomerPageRa.salesTab.click();

