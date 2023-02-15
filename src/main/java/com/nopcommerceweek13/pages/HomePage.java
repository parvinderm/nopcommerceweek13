package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    //By loginLink = By.linkText("Log in");


    @FindBy(linkText = "Register")
    WebElement registerLink;
    // By registerLink = By.linkText("Register");

    @FindBy(xpath ="//div[@class='header-logo']")
    WebElement nopcommerceLogo;

    @FindBy(className = "ico-logout")
    WebElement logoutLink;
    @FindBy(xpath="//div[@class='header-menu']/ul[1]/li[3]/a")
    WebElement ApparelMenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]")
    WebElement ElectronicsMenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')]")
    WebElement ComputersMenu;

    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[6]/a")
    WebElement JewelryMenu;
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[7]/a")
    WebElement GiftCardsMenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    WebElement sevenMenu;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[4]/a")
    WebElement DigitalDownloadsMenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement BooksMenu;





    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("clicking on login link : "+ loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click on register link :"+registerLink.toString());
    }
    public void clickOnApparelMenu(){
        clickOnElement(ApparelMenu);
        log.info("click on ApparelMenu :"+ApparelMenu.toString());
    }
    public void clickOnComputersMenu(){

        clickOnElement(ComputersMenu);
        log.info("click on ComputerMenu :"+ComputersMenu.toString());
    }
    public void clickOnGiftCardsMenu(){
        clickOnElement(GiftCardsMenu);
        log.info("click on Gifts Card "+GiftCardsMenu.toString());

    }
    public void clickOnSevenMenu(){
        clickOnElement(sevenMenu);
        log.info("click on Seven Menu :"+sevenMenu.toString());

    }
    public  String  getLogoutLinkText(){
        return getTextFromElement(logoutLink);
    }
    public void clickOnJewelryMenu(){
        clickOnElement(JewelryMenu);
        log.info("click on Jewelry Menu :"+JewelryMenu.toString());
    }
    public void clickOnElectronicsMenu(){
        clickOnElement(ElectronicsMenu);
        log.info("click on Electronics Menu :"+ElectronicsMenu.toString());
    }
    public void clickOnNopCommerceLogo(){
        clickOnElement(nopcommerceLogo);
        log.info("click on nopCommerce lOGO : "+nopcommerceLogo.toString());
    }
    public void clickOnDigitalDownloads(){
        clickOnElement(DigitalDownloadsMenu);
        log.info("click on DigitalDownloads :"+DigitalDownloadsMenu.toString());
    }
    public void clickOnBooksMenu(){
        clickOnElement((BooksMenu));
        log.info("click on Books Menu :"+BooksMenu.toString());
    }
    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }





}
