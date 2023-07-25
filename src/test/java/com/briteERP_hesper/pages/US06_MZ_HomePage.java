package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_MZ_HomePage {
    public US06_MZ_HomePage() {
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

    @FindBy(xpath = "//*[@name='name']/..")
    public WebElement customerInformation;

    @FindBy(xpath = "//*[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement product;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@name='sale_ok']")
    public WebElement FirstCheckBox;

    @FindBy(xpath = "//*[@name='purchase_ok']")
    public WebElement SecondCheckBox;

    @FindBy(xpath = "//*[@name='can_be_expensed']")
    public WebElement ThirdCheckBox;

}
