package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesModelPage_MA {

    public SalesModelPage_MA() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement SalesModelBtn;

    @FindBy(xpath = "//table//th[1]")
    public WebElement QuotationNumberHeader;
}
