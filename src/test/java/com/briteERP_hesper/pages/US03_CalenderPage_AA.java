package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_CalenderPage_AA {

    public US03_CalenderPage_AA(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement calenderTab;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayTab;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekTab;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthTab;


}
