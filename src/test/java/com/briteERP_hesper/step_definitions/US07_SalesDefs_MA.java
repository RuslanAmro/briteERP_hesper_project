package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.SalesModelPage_MA;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US07_SalesDefs_MA {
    SalesModelPage_MA salesModelPageMa = new SalesModelPage_MA();


//    @Given("user should be able to click on sales module")
//    public void user_should_be_able_to_click_on_sales_module() {
//        salesModelPageMa.SalesModelBtn.click();
//
//    }

    @Given("Given user should be able to click on Sales Module")
    public void givenUserShouldBeAbleToClickOnSalesModule() {
        BrowserUtils.waitFor(3);
        salesModelPageMa.SalesModelBtn.click();

    }

    @Then("Verify User should be able to see {string}")
    public void verifyUserShouldBeAbleToSee(String expectedColumnsHeaders) {
        expectedColumnsHeaders="Quotation Number";
        String actualHeaders = salesModelPageMa.QuotationNumberHeader.getText();
        Assert.assertEquals(expectedColumnsHeaders, actualHeaders);
    }

    @And(": user enter {string} in search box and hit enter")
    public void userEnterInSearchBoxAndHitEnter(String product) {

        salesModelPageMa.searchBox.sendKeys("SO812"+ Keys.ENTER);

    }

    @Then(": user should see expectedOrderNumber result")
    public void userShouldSeeExpectedOrderNumberResult() {
        String actualSearchResult = salesModelPageMa.searchResult.getText();

        Assert.assertEquals(actualSearchResult,"SO812");
    }
}

