package com.example.selenideFw.accounts;

import com.codeborne.selenide.Configuration;
import com.example.selenideFw.Base.TestBase;
import com.example.selenideFw.datahelpers.AccountIntelDataHelper;
import com.example.selenideFw.entity.Environment;
import com.example.selenideFw.entity.User;
import com.example.selenideFw.pages.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProfileManagementTest extends TestBase {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private PropertyListing propertyListingPage;

    @Autowired
    private PropertyHomePage propertyHomePage;

    @Autowired
    private ManagementCompanyListingPage managementCompanyListingPage;

    @Autowired
    private AccountIntelDataHelper accountIntelDataHelper;

    private String managementCompanyName="Marriot hotels";
    private String propertyName="Marriot London";

    @Autowired
    private ProfileManagementPage profileManagementPage;

    @Autowired
    private Environment environment;

    @BeforeClass
    public void setupModuleData(){
        accountIntelDataHelper.setupBasicData();
        Configuration.startMaximized = true;
        open(environment.getUrl());
        loginPage.doLogin(environment.getMarsuser(),environment.getMarsuserpassword());
        managementCompanyListingPage.clickonMangementComapany(managementCompanyName);
        propertyListingPage.clickOnProperty(propertyName);
        propertyHomePage.navigateToAccountsProfileManagement();
    }

    @AfterClass
    public void tearDownModuleData(){
        closeWebDriver();
    }

    @BeforeMethod
    public void beforeTestData(Method method){
        accountIntelDataHelper.setupCompanyProfileData();
        refresh();
    }

    @Test(priority=1,enabled=true,
            testName = "PROFILE_MANAGEMENT_TEST:TC_001 - Test Grid Sort By High To Low Orders",
            description = "Test Grid Sort By Hight To Low Orders"
    )
    public void testGridSortByHighToLowOrder() {
        SoftAssert softAssert=new SoftAssert();
        List<String> expectedOrder = Arrays.asList("Airbus Group", "Microsoft Corporation", "CHAP BB test", "PricewaterhouseCoopers", "Eli Lilly & Company", "Inditex", "Fortum Corporation", "Boston Consulting Group", "National Oilwell Varco");
        profileManagementPage.openProfileDisplayPopup();
        profileManagementPage.selectSortProfile("RN Production High to Low");
        profileManagementPage.clickGoButton();
        List<String> actualList = profileManagementPage.allMasterProfiles();
        softAssert.assertEquals(actualList, expectedOrder);
        softAssert.assertAll();
    }


@Test(priority=2,enabled=true,
        testName = "PROFILE_MANAGEMENT_TEST:TC_002 - Validate the grid data is sorted low to high",
        description = "Validate the grid data is sorted low to high"
)
    public void testGridByLowToHighOrder() {
        SoftAssert softAssert=new SoftAssert();
        List<String> expectedOrder = Arrays.asList("National Oilwell Varco", "Boston Consulting Group", "Fortum Corporation", "CHAP BB test", "PricewaterhouseCoopers", "Eli Lilly & Company", "Inditex", "Microsoft Corporation", "Airbus Group");
        profileManagementPage.openProfileDisplayPopup();
        profileManagementPage.selectSortProfile("RN Production Low to High");
        profileManagementPage.clickGoButton();
        List<String> actualList = profileManagementPage.allMasterProfiles();
        softAssert.assertEquals(actualList, expectedOrder);
        softAssert.assertAll();
    }


    @Test(priority=3,enabled=true,
            testName = "PROFILE_MANAGEMENT_TEST:TC_003 - Validate grid maintains the sorting order when criteria is run with Profile Type",
            description = "Validate grid maintains the sorting order when criteria is run with Profile Type"
    )
    public void testGridSortingOrderWithProfileType() {
        SoftAssert softAssert=new SoftAssert();
        profileManagementPage.checkSubProfileCheckBox();
        profileManagementPage.openProfileDisplayPopup();
        profileManagementPage.selectSortProfile("RN Production Low to High");
        profileManagementPage.profileTypeSelectOnly("Pending Profiles");
        profileManagementPage.clickGoButton();
        List<String> expectedOrder = Arrays.asList("Boston Consulting Group", "Fortum Corporation", "CHAP BB test", "PricewaterhouseCoopers", "Airbus Group");
        List<String> actualList = profileManagementPage.allMasterProfiles();
        softAssert.assertEquals(actualList, expectedOrder);
        profileManagementPage.openProfileDisplayPopup();
        profileManagementPage.selectSortProfile("RN Production High to Low");
        profileManagementPage.clickGoButton();
        expectedOrder = Arrays.asList("Airbus Group", "CHAP BB test", "PricewaterhouseCoopers", "Fortum Corporation", "Boston Consulting Group");
        actualList = profileManagementPage.allMasterProfiles();
        softAssert.assertEquals(actualList, expectedOrder);
        softAssert.assertAll();
    }


}
