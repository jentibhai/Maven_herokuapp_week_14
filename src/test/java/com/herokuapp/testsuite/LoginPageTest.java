package com.herokuapp.testsuite;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.LoginPage;
import com.herokuapp.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();

    LoginPage loginPage =new LoginPage();

    @Test

    public void UserSholdLoginSuccessfullyWithValidCredentials(){
        /* Enter “tomsmith” username
        * Enter “SuperSecretPassword!” password
        * Click on ‘LOGIN’ button
        * Verify the text “Secure Area”*/

         loginPage.enterUserName("tomsmith");
         loginPage.enterPassword("SuperSecretPassword!");
         loginPage.clickOnLoginButton();
         String expectedText ="Secure Area";
         String actualText =loginPage.getErrorMessage();
        Assert.assertEquals(actualText,expectedText,"Secure Area");

    }

    @Test

    public void verifyTheUsernameErrorMessage(){
        /** Enter “tomsmith1” username
         * Enter “SuperSecretPassword!” password
         * Click on ‘LOGIN’ button
         * Verify the error message “Your username
         is invalid!”*/

         loginPage.enterUserName("tomsmith1");
         loginPage.enterPassword("SuperSecretPassword!");
         loginPage.clickOnLoginButton();
        String expectedText ="Your username is invalid!\n" +
                "×";
        String actualText =loginPage.getErrorMessage1();
        Assert.assertEquals(actualText,expectedText,"Your username is invalid! ");

    }

    @Test

    public void verifyThePasswordErrorMessage(){

        /** Enter “tomsmith” username
         * Enter “SuperSecretPassword” password
         * Click on ‘LOGIN’ button
         * Verify the error message “Your password
         is invalid!”*/

        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("kk");
        loginPage.clickOnLoginButton();
        String expectedText ="Your password is invalid!\n" +
                "×";
        String actualText =loginPage.getErrorMessage2();
        Assert.assertEquals(actualText,expectedText,"Your password is invalid!");

    }
}
