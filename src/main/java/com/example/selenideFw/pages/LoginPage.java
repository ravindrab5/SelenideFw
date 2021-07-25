package com.example.selenideFw.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class LoginPage {


    @FindBy(id = "username")
    private SelenideElement userName;
            //=$(byId("username"));

    @FindBy(id = "password")
    private SelenideElement password;
                    //=$(byId("password"));

    @FindBy(xpath ="//input[@name='submit']" )
    private SelenideElement loginButton;
            //=$x("//input[@name='submit']");

    public void doLogin(String username,String password){
        userName.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }


}
