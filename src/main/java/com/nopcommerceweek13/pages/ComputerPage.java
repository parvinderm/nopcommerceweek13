package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
  @FindBy(xpath ="//div[@class='page-title']")
    WebElement ComputersText;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li//a[@href='/computers']")
    WebElement computersLink;

   @FindBy(xpath = "//div[@class='page-body']/div[1]/div[1]/div[1]/div[1]/h2/a")
    WebElement DesktopsLink;
   @FindBy(xpath = "//a[contains(text(),' Notebooks ')]")
    WebElement NoteBooksLink;
   @FindBy(xpath = "//a[contains(text(),' Software ')]")
    WebElement SoftwareLink;

    public String getComputersText(){
        return getTextFromElement(ComputersText);
    }
    public void clickOnDesktopsLink(){
        clickOnElement(DesktopsLink);
        log.info("click on DesktopsLink : " +DesktopsLink.toString());
    }
    public void clickOnNoteBooksTab(){
        clickOnElement(NoteBooksLink);
        log.info("click on NoteBooks Link : "+NoteBooksLink.toString());
    }
    public void clickOnSoftwareLink(){
        clickOnElement(SoftwareLink);
        log.info("click on Software Link : "+SoftwareLink.toString());

    }
    public void clickOnComputers(){
        log.info("click on computers tab"+computersLink.toString());
        clickOnElement(computersLink);
    }



}
