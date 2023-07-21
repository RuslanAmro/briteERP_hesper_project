package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US16_HomePage {

    public US16_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//*[@style='display: block;']")
    public List<WebElement> buttons;





}
