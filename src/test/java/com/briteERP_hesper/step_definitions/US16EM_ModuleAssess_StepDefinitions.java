package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.US16_HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.net.UnknownServiceException;

public class US16EM_ModuleAssess_StepDefinitions {
      US16_HomePage Homepage = new US16_HomePage();

    @Then("Verify the sales managers access to twelve modules.")
    public void verify_the_sales_managers_access_to_twelve_modules() {
        for (WebElement each : Homepage.buttons) {
            each.click();
            Assert.assertEquals(each.getAttribute("class"),"active");
            System.out.println("each.getAttribute(\"class\") = " + each.getAttribute("class"));
            System.out.println(each.getText());
        }
    }
}
