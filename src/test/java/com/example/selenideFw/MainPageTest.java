package com.example.selenideFw;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.selenideFw.config.EnvironmentConfig;
import com.example.selenideFw.pages.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MainPageTest extends AbstractTestNGSpringContextTests {
    private final MainPage mainPage = new MainPage();
    private final LoginPage loginPage=new LoginPage();
    private final PropertyListing propertyListingPage=new PropertyListing();
    private final PropertyHomePage propertyHomePage=new PropertyHomePage();
    private final ManagementCompanyListingPage managementCompanyListingPage=new ManagementCompanyListingPage();
    private final ContractOverviewPage contractOverviewPage=new ContractOverviewPage();
    private final AddContractPage addContractPage=new AddContractPage();

    @BeforeClass
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;

    }

    @Test
    public void firstTest(){
        open("http://mn4qmarenvw003.ideasdev.int:5023/login");
        loginPage.doLogin("mars@ideas.com","ID6asMar5");
        managementCompanyListingPage.clickonMangementComapany("Marriot hotels");
        propertyListingPage.clickOnProperty("marriot Mumbai");
        propertyHomePage.navigateToContractOverview();
        contractOverviewPage.openContractFor("Fortum Corporation","2021");
        addContractPage.selectContractManager(" Property Admin");
        System.out.println();
    }


}
