package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.HomePage;
import com.nopcommerceweek13.pages.LoginPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage= new HomePage();
    LoginPage loginPage=new LoginPage();
    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        loginPage = new LoginPage();
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage, expectedMessage, "Login page verified");

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("jiyapatel@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
//        String actual = loginPage.getErrorMessage();
//        String expected = "Login was unsuccessful.Please correct the errors and try again.No customer account found";
//          Assert.assertEquals(actual,expected,"error message with invalid credentia
    }
    @Test
    public void verifyThatUserShouldLoginSuccessFullyWithValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("jiyapatel@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actualMessage2=homepage.getLogoutLinkText();
        String expectedMessage2 = "Log out";
        Assert.assertEquals(actualMessage2,expectedMessage2,"Logout link verified");

    }
    @Test
    public void verifyThatUserShouldLogoutSuccessfully() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("jiyapatel@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();

    }



    }
