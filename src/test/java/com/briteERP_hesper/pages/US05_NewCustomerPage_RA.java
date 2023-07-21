package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_NewCustomerPage_RA {

    public US05_NewCustomerPage_RA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesTab;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement customersTab;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameInputBox;

    @FindBy(css = "button[accesskey*='s']")
    public WebElement saveBtn;

    @FindBy(xpath = "//h1[.='Brus']")
    public WebElement name;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[5]")
    public WebElement customer;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;


}
