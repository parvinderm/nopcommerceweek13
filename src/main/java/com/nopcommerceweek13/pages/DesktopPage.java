package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement DesktopsText;
    @FindBy(xpath = "//div[@class='product-sorting']/span")
    WebElement SortbyText;
    @FindBy(xpath = "//div[@class='product-page-size']/span[1]")
    WebElement DisplayText;
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement SelectProductListLocators;

    public String getDesktopsText(){
        return getTextFromElement(DesktopsText);
    }
    public String getSortByText(){
        return getTextFromElement(SortbyText);
    }
    public String getDisplayText(){
        return getTextFromElement(DisplayText);

    }
    public String getSelectListProductListLocators(){
        return getTextFromElement(SelectProductListLocators);
    }
}
