package com.briteERP_hesper.step_definitions;

import com.briteERP_hesper.pages.CalendarEvent_PB;
import com.briteERP_hesper.pages.LoginPage;
import com.briteERP_hesper.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class US01_StepDefsPB {


    CalendarEvent_PB calendarEvent = new CalendarEvent_PB();

    

    @When("user can click on Calendar")
    public void userCanClickOnCalendar() {
        calendarEvent.Calendar.click();
    }

    @Then("user can click on time box")
    public void userCanClickOnTimeBox() {
        calendarEvent.TimeBox.click();
    }

    @Then("user fills out the summary box")
    public void userFillsOutTheSummaryBox() {
       calendarEvent.SummaryBox.sendKeys("grooming meeting"+ Keys.ENTER);
    }

    @Then("user clicks on create")
    public void userClicksOnCreate() {
        calendarEvent.Create.click();
    }







    @And("user clicks on the event")
    public void userClicksOnTheEvent() {
        calendarEvent.Event.click();
    }

    @Then("user can see event details")
    public void userCanSeeEventDetails() {
        Assert.assertEquals(calendarEvent.EventTitle.isDisplayed(), true);
    }


    @Then("user can click on the time box")
    public void userCanClickOnTheTimeBox() {
        calendarEvent.TimeBox2.click();
    }
    }

