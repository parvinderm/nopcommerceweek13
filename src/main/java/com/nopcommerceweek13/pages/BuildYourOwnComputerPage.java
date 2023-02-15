package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Build your own computer")
    WebElement BuildYourOwnComputer;

    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement BuildYourOwnComputerText;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectFirstOptionFromProcessor;
    @FindBy(xpath ="//select[@id='product_attribute_2']" )
    WebElement selectThirdOptionFromRam;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement clickOnRadioButtonHdd;
    @FindBy(id = "product_attribute_4_8")
    WebElement clickOnRadioButtonFromOs;
    @FindBy(id = "product_attribute_5_10")
    WebElement clickOnSoftwareCheckBoxes;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickOnAddToCartButton;
    @FindBy(xpath = "//div//p[contains(text(),'The product has been added to your ')]")
    WebElement theProductHasBeenAddedToYourShoppingCart;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(BuildYourOwnComputer);
        log.info("click on Build Your Own Computer :" +BuildYourOwnComputer.toString());
    }
    public String getBuildYourOwnComputerText(){
        return getTextFromElement(BuildYourOwnComputerText);
    }
    public void selectFirstOptionFromProcessor(String Processor){
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor,Processor);
        log.info("select option from dropdown :"+ selectFirstOptionFromProcessor.toString());
    }
    public void setSelectThirdOptionFromRam(String Ram){
        log.info("select on third option"+selectThirdOptionFromRam.toString());
        selectByVisibleTextFromDropDown(selectThirdOptionFromRam,Ram);

    }
    public void clickOnRadioButtonHdd(String Hdd){
        clickOnElement(clickOnRadioButtonHdd);
        log.info("click on radio button from hdd"+clickOnRadioButtonHdd.toString());
    }
    public void clickOnRadioButtonFromOs(String OS) {
        clickOnElement(clickOnRadioButtonFromOs);
        log.info("click on os button" + clickOnRadioButtonFromOs.toString());
    }
    public void clickOnSoftwareCheckBoxes(String software){
        log.info("click on check boxes"+clickOnSoftwareCheckBoxes.toString());
        clickOnElement(clickOnSoftwareCheckBoxes);
    }
    public void clickOnAddToCartButton(){
        log.info("click on add to cart button"+clickOnAddToCartButton.toString());
        clickOnElement(clickOnAddToCartButton);
    }
    public String verifyTheProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(theProductHasBeenAddedToYourShoppingCart);

    }
    public void makeyourown(String processor, String ram, String hdd, String os, String software) {
        selectFirstOptionFromProcessor(processor);
        setSelectThirdOptionFromRam(ram);
        clickOnRadioButtonHdd(hdd);
        clickOnRadioButtonFromOs (os);
        clickOnSoftwareCheckBoxes(software);
    }





}
