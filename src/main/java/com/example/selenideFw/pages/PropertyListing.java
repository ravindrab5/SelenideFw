package com.example.selenideFw.pages;

import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Component
public class PropertyListing {

    public void clickOnProperty(String property){
        String xpath="//a[text()='"+property+"']";
        $x(xpath).click();
    }
}
