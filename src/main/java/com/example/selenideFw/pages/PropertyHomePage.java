package com.example.selenideFw.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.*;

@Component
public class PropertyHomePage {
    private SelenideElement planningButton=$x("//a[text()='Planning']");
    private SelenideElement intelButton=$x("//a[text()='Intel']");
    private SelenideElement accountSubmenu=$x("//li[a[text()='Accounts']]/ul/li/a[text()='Companies']");
    private SelenideElement accountsInMenu=$x("//a[text()='Accounts']");
    private SelenideElement revAnalyticsOptionInPlanning=$x("//a[text()='Revenue']");
    private SelenideElement roomsInRevAnalyticsOfPlanning=$x("//li[a[text()='Revenue']]/ul/li/a[text()='Rooms']");
    private SelenideElement productionSubMenu=$x("//li[a[text()='Accounts']]/ul/li/a[text()='Production']");
    private SelenideElement profileManagementScorecard=$x("//h3[text()='Profile Management']");
    private SelenideElement contractOverviewScorecard=$x("//h3[text()='Contract Overview']");

    public void navigateToContractOverview(){
        actions().moveToElement(intelButton).moveToElement(accountsInMenu).moveToElement(accountSubmenu).click().perform();
        contractOverviewScorecard.shouldBe(Condition.visible);
        contractOverviewScorecard.click();
    }

    public void navigateToAccountsProfileManagement(){
        actions().moveToElement(intelButton).moveToElement(accountsInMenu).moveToElement(accountSubmenu).click().perform();
        profileManagementScorecard.click();
    }



}
