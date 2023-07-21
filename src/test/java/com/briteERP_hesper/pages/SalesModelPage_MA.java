package com.briteERP_hesper.pages;

import com.briteERP_hesper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesModelPage_MA {

    public SalesModelPage_MA() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement SalesModelBtn;

//    @FindBy(xpath = "//table//th[i]")
//    public List<WebElement> headers;


    @FindBy(xpath = "//table//th[2]")
    public WebElement QuotationNumberHeader;

    @FindBy(xpath = "//table//th[3]")
    public WebElement QuotationHeader;

    @FindBy(xpath = "//table//th[4]")
    public WebElement DateCustomerHeader;

    @FindBy(xpath = "//table//th[5]")
    public WebElement SalespersonHeader;

    @FindBy(xpath = "//table//th[6]")
    public WebElement TotalHeader;

    @FindBy(xpath = "//table//th[7]")
    public WebElement StatusHeader;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//table//tbody//tr[1]")
    public WebElement searchResult;






}
