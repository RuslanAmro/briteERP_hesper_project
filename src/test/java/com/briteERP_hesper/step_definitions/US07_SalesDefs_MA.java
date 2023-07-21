package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.SalesModelPage_MA;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US07_SalesDefs_MA {
    SalesModelPage_MA salesModelPageMa= new SalesModelPage_MA();


    @Given("user should be able to click on sales module")
    public void user_should_be_able_to_click_on_sales_module() {
        salesModelPageMa.SalesModelBtn.click();

    }
    @Then("Verify User should be able to see the following table headers expectedColumnsHeaders")
    public void verify_user_should_be_able_to_see_the_following_table_headers(List <String> expectedColumnsHeaders) {
        List<WebElement> List = Driver.getDriver().findElements(By.xpath("//th[@class='o_column_sortable']"));
        for (int i = 0; i < List.size(); i++) {
            String actualResult = List.get(i).getText();
            Assert.assertEquals(actualResult, expectedColumnsHeaders.get(i));
            System.out.println("actualResult = " + actualResult);


        }
        //salesModelPageMa.QuotationNumberHeader.isDisplayed();

      //  BrowserUtils.verifyElementDisplayed(salesModelPageMa.QuotationHeader);



    }


}
