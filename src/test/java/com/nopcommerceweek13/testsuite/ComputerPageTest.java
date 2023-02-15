package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.*;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    ComputerPage computerPage=new ComputerPage();
    DesktopPage desktopPage=new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    @BeforeMethod
    public void inIt(){
        computerPage=new ComputerPage();
        desktopPage=new DesktopPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();

    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        computerPage.clickOnComputers();
        String actualMessage= computerPage.getComputersText();
        String expectedMessage = "Computers";
        Assert.assertEquals(actualMessage,expectedMessage,"Computers Text is verified");

    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerPage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        String actualMessage1= desktopPage.getDesktopsText();
        String expectedMessage1 = "Desktops";
        Assert.assertEquals(actualMessage1,expectedMessage1,"Desktops  is verified");
    }
    @Test(dataProvider = "BuildYourOwnComputer",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        computerPage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectFirstOptionFromProcessor(processor);
        buildYourOwnComputerPage.setSelectThirdOptionFromRam(ram);
        buildYourOwnComputerPage.clickOnRadioButtonHdd(hdd);
        buildYourOwnComputerPage.clickOnRadioButtonFromOs(os);
        buildYourOwnComputerPage.clickOnSoftwareCheckBoxes(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        String actualMessage2 = buildYourOwnComputerPage.verifyTheProductHasBeenAddedToYourShoppingCart();
        String expectedMessage2= "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage2, expectedMessage2, "The product has been added to your shopping cart is Verified");
   }

    }
