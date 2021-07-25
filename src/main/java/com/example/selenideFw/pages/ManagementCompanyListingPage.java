package com.example.selenideFw.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class ManagementCompanyListingPage {
    private SelenideElement searchField=$(".search input");

    public void clickonMangementComapany(String managementCompany){
        searchField.sendKeys(managementCompany);
        $x("//td[a[contains(text(),'"+managementCompany+"')]]/a").click();
    }
}
