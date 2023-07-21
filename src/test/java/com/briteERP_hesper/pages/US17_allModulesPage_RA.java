package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US17_allModulesPage_RA {

    public US17_allModulesPage_RA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li")
    public List<WebElement> allModules;

}
