package com.example.selenideFw.contracts;

import com.codeborne.selenide.Configuration;
import com.example.selenideFw.Base.TestBase;
import com.example.selenideFw.datahelpers.ContractsDataHelper;
import com.example.selenideFw.entity.Environment;
import com.example.selenideFw.pages.*;
import com.example.selenideFw.util.CalendarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.*;

public class AddContractTest extends TestBase {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private PropertyListing propertyListingPage;

    @Autowired
    private PropertyHomePage propertyHomePage;

    @Autowired
    private ManagementCompanyListingPage managementCompanyListingPage;

    @Autowired
    private ContractOverviewPage contractOverviewPage;

    @Autowired
    private AddContractPage addContractPage;

    @Autowired
    private Environment environment;

    @Autowired
    private ContractsDataHelper contractsDataHelper;

    @Autowired
    private CalendarUtil calendarUtil;

    private static final String CONTRACT_MANAGER_NOT_APPLICABLE="Not Applicable";
    private static final String CONTRACT_ACCOUNT="Eli Lilly & Company";
    private static final String CONTRACT_ACCOUNT_2="Microsoft Corporation";
    private static final String CHILD_MARKET_SEGMENT="TRAVEL AGENT DISCOUNT";
    private static final String PARENT_MARKET_SEGMENT="LOEWS BEST RATE";
    private static final String RATE_STRATEGY_CEILING="Last Room Availability";
    private static final String YEAR_2021="2021";
    private static final String YEAR_2022="2022";
    private static final String YEAR_2023="2023";
    private static final String PROPERTY_USER_ROLE_RESOURCE="INTEL_ACCOUNTS_COMPANIES";
    private static final String READ="READ";
    private static final String READ_WRITE="READ_WRITE";


    @BeforeClass
    public void setupModuleData(){
        contractsDataHelper.setupBasicData();
        contractsDataHelper.setupCompanyProfileData();
        contractsDataHelper.createReferenceDataPointData();
        contractsDataHelper.setupInventoryConfigData();

        loginPage=open(environment.getUrl(),LoginPage.class);
        loginPage.doLogin(environment.getMarsuser(),environment.getMarsuserpassword());
        managementCompanyListingPage.clickonMangementComapany("Bani Hotel Selenium5");
        propertyListingPage.clickOnProperty("Bani Property5");
        propertyHomePage.navigateToContractOverview();
    }

    @AfterClass
    public void tearDownModuleData(){
        closeWebDriver();
    }

    @BeforeMethod
    public void setUp() {
        contractsDataHelper.deleteContractsData();
        refresh();

      //  Configuration.browser="firefox";
    }

    @Test
    public void validateContractCreateWithRatePlanNotesAndDateRange() throws FileNotFoundException {
        SoftAssert softAssert=new SoftAssert();
        File file=$(".chi-download").download();
        System.out.println(file.getAbsolutePath());
        System.out.println();



        /*contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2021);
        addContractPage.openContractDateRangeCalender();
        LocalDate startDateOfDateRange1= LocalDate.of(2022,1,1);
        LocalDate endDateOfDateRange1=LocalDate.of(2022,12,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.enterRatePlanIn(0,"REVPTEAM1");
        addContractPage.enterNotes("Contract valid till year end");
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        addContractPage.clickCloseButton();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2022);
        String expectedDropDownSelectedString="Jan 1, 2022 - Dec 31, 2022";
        softAssert.assertEquals(addContractPage.getContractDateRangeLabel(),expectedDropDownSelectedString);
        addContractPage.clickCloseButton();
        softAssert.assertAll();*/
    }

    @Test
    public void validateCreateDateRangeIncontractFormAndCheckTheDateRange(){
        SoftAssert softAssert=new SoftAssert();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2021);
        addContractPage.openContractDateRangeCalender();
        LocalDate startDateOfDateRange1= LocalDate.of(LocalDateTime.now().plusYears(2).getYear(), 1,1);
        LocalDate endDateOfDateRange1=LocalDate.of(LocalDateTime.now().plusYears(2).getYear(),12,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.enterRatePlanIn(0,"REVPTEAM1");
        addContractPage.enterNotes("Contract valid till year end");
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        addContractPage.clickAddContractInForm();
        int yearAfterAddDateRange=LocalDateTime.now().plusYears(3).getYear();
        String calenderDate="Jan 1, "+yearAfterAddDateRange+" - Dec 31, "+yearAfterAddDateRange;
        String actualDateRange=addContractPage.getCalenderLabelInEditMode();
        softAssert.assertEquals(calenderDate,actualDateRange);
        addContractPage.clickCloseButton();

        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2021);
        addContractPage.openContractDateRangeCalender();
        LocalDate startDateOfDateRange2= LocalDate.of(LocalDateTime.now().plusYears(-1).getYear(), 1,1);
        LocalDate endDateOfDateRange2=LocalDate.of(LocalDateTime.now().plusYears(-1).getYear(),5,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange2,endDateOfDateRange2);
        addContractPage.enterRatePlanIn(0,"REVPTEAM1");
        addContractPage.enterNotes("Contract valid till year end");
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();

        addContractPage.clickAddContractInForm();
        yearAfterAddDateRange=LocalDateTime.now().plusYears(0).getYear();
        calenderDate="Jan 1, "+yearAfterAddDateRange+" - Dec 31, "+yearAfterAddDateRange;
        actualDateRange=addContractPage.getCalenderLabelInEditMode();
        softAssert.assertEquals(calenderDate,actualDateRange);
        addContractPage.clickCloseButton();

        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT_2,YEAR_2021);
        addContractPage.openContractDateRangeCalender();
        LocalDate startDateOfDateRange3= LocalDate.of(LocalDateTime.now().plusYears(0).getYear(), 1,1);
        LocalDate endDateOfDateRange3=LocalDate.of(LocalDateTime.now().plusYears(1).getYear(),5,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange3,endDateOfDateRange3);
        addContractPage.enterRatePlanIn(0,"REVPTEAM1");
        addContractPage.enterNotes("Contract valid till year end");
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();

        addContractPage.clickAddContractInForm();
        yearAfterAddDateRange=LocalDateTime.now().plusYears(1).getYear();
        calenderDate="Jun 1, "+yearAfterAddDateRange+" - Dec 31, "+yearAfterAddDateRange;
        actualDateRange=addContractPage.getCalenderLabelInEditMode();
        softAssert.assertEquals(calenderDate,actualDateRange);
        addContractPage.clickCloseButton();
        softAssert.assertAll();
    }


    @Test
    public void validateErrorMessageForCurrentSessionOverlappingNextOne() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2021);
        LocalDate startDateOfDateRange1= LocalDate.of(2021,1,1);
        LocalDate endDateOfDateRange1=LocalDate.of(2022,5,31);
        addContractPage.openContractDateRangeCalender();
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        addContractPage.clickCloseButton();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2022);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
      //  softAssert.assertTrue(addContractPage.isContractSavedErrorNotificationDisplayed());
        String expectedErrorMsg="The selected date range is overlapping an existing contract date range.";
        String actualErrorMsg=addContractPage.getErrorMessageText();
        softAssert.assertEquals(expectedErrorMsg,actualErrorMsg);
        addContractPage.clickCloseButton();
        softAssert.assertAll();
    }

    @Test
    public void validateErrorMessageForNextSessionOverlappingCurrentOne() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2022);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        addContractPage.clickCloseButton();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2021);
        addContractPage.openContractDateRangeCalender();
        LocalDate startDateOfDateRange1= LocalDate.of(2021,1,1);
        LocalDate endDateOfDateRange1=LocalDate.of(2022,5,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        //softAssert.assertTrue(addContractPage.isContractSavedErrorNotificationDisplayed());
        String expectedErrorMsg="The selected date range is overlapping an existing contract date range.";
        String actualErrorMsg=addContractPage.getErrorMessageText();
        addContractPage.clickCloseButton();
        softAssert.assertEquals(actualErrorMsg,expectedErrorMsg);
        softAssert.assertAll();
    }

    @Test
    public void validateErrorMessageForTwoContractsConfiguredInSameYear() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2022);
        LocalDate startDateOfDateRange1= LocalDate.of(2021,1,1);
        LocalDate endDateOfDateRange1=LocalDate.of(2021,5,31);
        addContractPage.openContractDateRangeCalender();
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        addContractPage.clickCloseButton();
        contractOverviewPage.openContractFor(CONTRACT_ACCOUNT,YEAR_2023);
        addContractPage.openContractDateRangeCalender();
        startDateOfDateRange1= LocalDate.of(2021,6,1);
        endDateOfDateRange1=LocalDate.of(2021,12,31);
        calendarUtil.selectStartDateAndEndDate(startDateOfDateRange1,endDateOfDateRange1);
        addContractPage.selectContractManager(CONTRACT_MANAGER_NOT_APPLICABLE);
        addContractPage.selectRatePlanStrategyCeiling(RATE_STRATEGY_CEILING);
        addContractPage.selectAddMarketSegment(PARENT_MARKET_SEGMENT);
        addContractPage.clickSaveButton();
        String expectedErrorMsg="Contract already exists for the selected year of start date.";
        String actualErrorMsg=addContractPage.getErrorMessageText();
        softAssert.assertEquals(actualErrorMsg,expectedErrorMsg);
        addContractPage.clickCloseButton();
        softAssert.assertAll();
    }


}
