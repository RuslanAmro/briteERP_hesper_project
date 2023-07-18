package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement InventoryTab;

    @FindBy(xpath = "//a[@data-menu='378']")
    public WebElement ProductsButton;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement CreateButton;
    @FindBy( xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement ProductNameField;


    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='o_thread_author ']")
    public WebElement customerInformation;

    @FindBy(xpath = "//*[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement product;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

}
