package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.US03_CalenderPage_AA;
import com.briteERP_hesper.utilities.BrowserUtils;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;
import java.util.Calendar;

public class US03_StepDefs {

    US03_CalenderPage_AA us03CalenderPageAa = new US03_CalenderPage_AA();

    @Given("user should see the dashboard")
    public void user_should_see_the_dashboard () {
        BrowserUtils.verifyTitle("Odoo");
    }

    @When("user should be able to click on Calendar")
    public void user_should_be_able_to_click_on_calendar () {
        us03CalenderPageAa.calenderTab.click();
        us03CalenderPageAa.weekTab.isDisplayed();

    }

    @Then("the user is on the calendar page")
    public void the_user_is_on_the_calendar_page () {
        System.out.println("us03CalenderPageAa.calenderTab.isDisplayed() = " + us03CalenderPageAa.calenderTab.isDisplayed());

    }

    @Then("user should be able to select the daily view option")
    public void user_should_be_able_to_select_the_daily_view_option () {
        us03CalenderPageAa.dayTab.click();
    }

    @Then("the calender should display events for the current day")
    public void the_calender_should_display_events_for_the_current_day () {
        us03CalenderPageAa.dayTab.isDisplayed();

    }


    @Then("user should be able to select the Monthly view option")
    public void user_should_be_able_to_select_the_monthly_view_option () {
        us03CalenderPageAa.monthTab.click();

    }

    @Then("the calender should display events for the current Month")
    public void the_calender_should_display_events_for_the_current_month () {
        us03CalenderPageAa.monthTab.isDisplayed();
    }


    @Then("user should be able to select the Weekly view option")
    public void user_should_be_able_to_select_the_weekly_view_option () {
        us03CalenderPageAa.weekTab.click();
    }

    @Then("the calender should display events for the current week")
    public void the_calender_should_display_events_for_the_current_week () {
        us03CalenderPageAa.weekTab.isDisplayed();

    }

}
