package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;
import sun.security.util.Password;

public class LoginPage extends Utility {

    By UsernameField = By.id("username");

    By PasswordField =By.id("password");

    By loginButton =By.xpath("//button[@type='submit']");

    By errorMessage = By.xpath("//h2[normalize-space()='Secure Area']");

    By errorMessage1 =By.xpath("//div[contains(text(),'Your username is invalid!')]");

    By errorMessage2 =By.xpath("//div[contains(text(),'Your password is invalid!')]");


    public void enterUserName(String Username){sendTextToElement(UsernameField,Username);}

    public void enterPassword(String password){sendTextToElement(PasswordField,password);}

    public void clickOnLoginButton(){clickOnElement(loginButton);}

    public String getErrorMessage(){return getTextFromElement(errorMessage);}

    public String getErrorMessage1(){return getTextFromElement(errorMessage1);}

    public String getErrorMessage2(){return getTextFromElement(errorMessage2);}

}

