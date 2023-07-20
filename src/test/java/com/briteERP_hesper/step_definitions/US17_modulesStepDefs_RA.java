package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.US17_allModulesPage_RA;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US17_modulesStepDefs_RA {

    US17_allModulesPage_RA allModulesPageRa = new US17_allModulesPage_RA();

    @Given("user on the landing page")
    public void user_on_the_landing_page() {
        BrowserUtils.waitFor(3);

        String expectedMainPageTitle = "#Inbox - Odoo";
        String actualMainPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedMainPageTitle, actualMainPageTitle);

    }

    @Then("user should be able to see {int} modules")
    public void userShouldBeAbleToSeeModules(int expectedModules) {

        BrowserUtils.waitFor(3);

        System.out.println("BrowserUtils.getElementsText(allModulesPageRa.allModules).size() = " + BrowserUtils.getElementsText(allModulesPageRa.allModules).size());

        Assert.assertEquals(expectedModules, allModulesPageRa.allModules.size());

    }
}
