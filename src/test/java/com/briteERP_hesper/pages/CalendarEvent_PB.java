package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEvent_PB {
    public CalendarEvent_PB(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath= "//tr[@data-time='09:00:00']/td[@class='fc-widget-content']" )
    public WebElement TimeBox;

    @FindBy (xpath="//a[@data-menu='120']")
    public WebElement Calendar;

    @FindBy (xpath="//input[@class='o_input']")
    public WebElement SummaryBox;

    @FindBy (xpath="//button[@class='btn btn-sm btn-primary']")
public WebElement Create;


    @FindBy(xpath= "//tr[@data-time='08:00:00']/td[@class='fc-widget-content']" )
    public WebElement TimeBox2;


    @FindBy (xpath= "//a[@class='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6 fc-short']")
    public WebElement Event;

    @FindBy (xpath="//h4[@class='modal-title']")
    public WebElement EventTitle;
}
