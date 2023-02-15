package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.HomePage;
import com.nopcommerceweek13.pages.LoginPage;
import com.nopcommerceweek13.pages.RegisterPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage=new RegisterPage();
    HomePage homePage=new HomePage();

    @BeforeMethod
    public void inIt(){
        homePage= new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String actualMessage = registerPage.getRegisterText();
        String expectedMessage  = "Register";
        Assert.assertEquals(actualMessage, expectedMessage, "Register text verified");
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.enterFirstNameOnFirstNameField("");
        String actualMessage6 = registerPage.getFirstNameIsRequiredText();
        String  expectedMessage6 = "First name is required.";
        Assert.assertEquals(actualMessage6,expectedMessage6," First name is required is verified");
        String actualMessage2=registerPage.getLastNameIsRequiredText();
        String expectedMessage2 ="Last name is required.";
        Assert.assertEquals(actualMessage2,expectedMessage2," Last name is required is verified");
        //Verify error message
        String actualText3= registerPage.getEmailIsRequiredText();
        String expectedText3="Email is required.";
        Assert.assertEquals(actualText3,expectedText3,"Verified email is required text");
        //Verify Error message
        String actualText4 = registerPage.getPasswordIsRequiredText();
        String expectedText4 = "Password is required.";
        Assert.assertEquals(actualText3,expectedText3,"verified password is required");


    }
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadioButton();
        registerPage.enterFirstNameOnFirstNameField("sona");
        registerPage.enterLastNameOnLastNameField("patel");
        registerPage.clickOnDateOfBirthdayDropdown("3");
        registerPage.clickOnDateOfBirthMonthFromDropdown("March");
        registerPage.clickOnDateOfBirthYearFromDropdown("1992");
        registerPage.enterEmailIdOnEmailField("radhapatel@gmail.com");
        registerPage.enterPasswordOnPasswordField("123456");
        registerPage.enterPasswordOnConfirmPasswordField("123456");
        registerPage.clickOnRegisterButton();
        String actualMessage5=registerPage.getYourRegistrationCompletedText();
        String expectedMessage5 = "Your registration completed";
        Assert.assertEquals(actualMessage5,expectedMessage5,"Your registration completed is  verified");





    }


}
