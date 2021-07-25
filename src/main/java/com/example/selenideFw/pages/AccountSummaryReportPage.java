package com.example.selenideFw.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AccountSummaryReportPage {

    private static final String TITLE_ATTRIBUTE = "title";

    private static final String ACCOUNT_SUMMARY_SCORECARD="//div[contains(@class,'score-card-new')]//h3[contains(text(),'Account Summary')]";
    public SelenideElement accountSummaryScoreCard=$x(ACCOUNT_SUMMARY_SCORECARD);

    private static final String ACCOUNT_SUMMARY_CRITERIA_ICON = "(//i[contains(@class,'chi-arrowright icon-medium icon-r0')])[1]";
    public SelenideElement reportCriteriaIcon=$x(ACCOUNT_SUMMARY_CRITERIA_ICON);

    private static final String REPORT_CRITERIA_HEADER = "//h2[text()='Report Criteria']";
    public SelenideElement reportCriteriaHeader=$x(REPORT_CRITERIA_HEADER);

    private static final String DATE_RANGE_CALENDAR_ICON = "//span[contains(@class,'btn-calendar')]//i";
    public SelenideElement dateRangeCalenderIcon=$x(DATE_RANGE_CALENDAR_ICON);

    private static final String CALENDAR_DATE_RANGE_HEADER = "//h2[contains(text(),'Date Range')]";
    public SelenideElement calenderDateRangeHeader=$x(CALENDAR_DATE_RANGE_HEADER);

    private static final String VOLUME_METRICS_SELECT_BUTTON = "//div[contains(@class,'mars-select volume-metrics-select')]//span//div[contains(@class,'btn-group')]//button/span";
    public SelenideElement volumeMetricsSelectButton=$x(VOLUME_METRICS_SELECT_BUTTON);

    private static final String VOLUME_METRICS_LIST = "//div[contains(@class,'mars-select volume-metrics-select')]//span//div[contains(@class,'btn-group')]//li//label[@class='checkbox']";
    public ElementsCollection volumeMetricsList=$$x(VOLUME_METRICS_SELECT_BUTTON);

    private static final String VOLUME_METRICS_LIST_SELECT = "//div[contains(@class,'mars-select volume-metrics-select')]//span//div[contains(@class,'btn-group')]//li//label[@title='string']";
    public ElementsCollection volumeMetricsLIstSelect=$$x(VOLUME_METRICS_LIST_SELECT);

    private static final String ROOM_REV_METRICS_SELECT_BUTTON = "//div[contains(@class,'mars-select revenue-metrics-select')]//span//div[contains(@class,'btn-group')]//button/span";
    public SelenideElement roomRevMetricsSelectButton=$x(ROOM_REV_METRICS_SELECT_BUTTON);

    private static final String ROOM_REV_METRICS_LIST = "((//div[contains(@class,'mars-select revenue-metrics-select')])[1])//span//div[contains(@class,'btn-group')]//li//label[@class='checkbox']";
    public ElementsCollection roomRevMetricsList=$$x(ROOM_REV_METRICS_LIST);

    private static final String ACCOUNT_TYPE_SELECT_BUTTON = "//div[contains(@class,'account-type-select')]//span//div[contains(@class,'btn-group')]//button/span";
    public SelenideElement accountTypeSelectButton=$x(ACCOUNT_TYPE_SELECT_BUTTON);

    private static final String ACCOUNT_TYPE_LIST = "//div[contains(@class,'account-type-select')]//span//div[contains(@class,'btn-group')]//li//label[@class='radio']";
    public ElementsCollection accountTypeList=$$x(ACCOUNT_TYPE_LIST);


    private static final String ACCOUNT_TYPE_SELECT=".account-type";
    public SelenideElement accountTypeSelect=$(ACCOUNT_TYPE_SELECT);

    private static final String ACCOUNT_TYPE_SELECTED = "//div[contains(@class,'account-type-select')]//span//div[contains(@class,'btn-group')]//li[@class='active']//label[@class='radio']";
    public SelenideElement accountTypeSelected=$x(ACCOUNT_TYPE_SELECTED);

    private static final String ACCOUNT_HIERARCHY_SELECT_BUTTON = "//div[contains(@class,'profile-view-select')]//span//div[contains(@class,'btn-group')]//button/span";
    private SelenideElement accountHierarchySelectButton=$x(ACCOUNT_HIERARCHY_SELECT_BUTTON);

    private static final String ACCOUNT_HIERARCHY_LIST = "//div[contains(@class,'profile-view-select')]//span//div[contains(@class,'btn-group')]//li//label[@class='radio']";
    private ElementsCollection accountHierarchyList=$$x(ACCOUNT_HIERARCHY_LIST);

    private static final String ACCOUNT_HIERARCHY_DROPDOWN_SELECT="//select[contains(@class,'hierarchy')]";
    private SelenideElement accountHierarchySelectDropDown=$x(ACCOUNT_HIERARCHY_DROPDOWN_SELECT);

    private static final String ACCOUNT_HIERARCHY_SELECTED = "//div[contains(@class,'profile-view-select')]//span//div[contains(@class,'btn-group')]//li[@class='active']//label[@class='radio']";
    private static final String ACCOUNT_NAME_SEARCH_BUTTON_DROP_DOWN=".account-select .multiselect-selected-text";
    private static final String SEARCH_FIELD="//input[@placeholder='Search..']";
    private static final String SEARCH_RESULT=".account-select .multiselect-container label";
    private static final String DOW_DROP_DOWN_BUTTON=".days-of-week-select .multiselect-selected-text";
    private static final String DOW_DROPDOWN_SELECT = "//select[contains(@class,'week-configuration')]//optgroup[@label='string']//option";
    private static final String DOW_SELECT_LIST="//select[contains(@class,'daysOfWeek')]";
    private static final String DOW_LIST_DEFAULT_TEXT = "//div[contains(@class,'days-of-week-select')]//div[contains(@class,'btn-group')]//button[contains(@class,'btn-default')]//span";
    private static final String MKT_SEG_LIST_DEFAULT_TEXT = "//div[contains(@class,'segment-select')]//div[contains(@class,'btn-group')]//button[contains(@class,'btn-default')]//span";
    private static final String MKT_SEG_DROP_DOWN_BUTTON=".segment-select .multiselect-selected-text";
    private static final String MKT_SEG_DROPDOWN_SELECT = "//select[contains(@class,'pmsSegmentSelect')]//optgroup[@label='string']//option";
    private static final String MKT_SEG_SELECT_DROPDOWN=".RmRev-Metrics-List";
    private static final String LEAD_TIME_INPUT=".form-group .inputrange input";
    private static final String MKT_SEG_SELECT=".pmsSegmentSelect.configuration-list";
    private static final String REPORT_CRITERIA_GO_BUTTON =".chi-go";
    private static final String TOTAL_REV_METRICS_SELECT_BUTTON = "//span[select[contains(@class,'fnbTotalRev-Metrics-List')]]/div/button"; // matching multiple dropdowns
    private static final String TOTAL_REV_METRICS_LIST = "//span[select[contains(@class,'fnbTotalRev-Metrics-List')]]/div/ul/li/a/label"; // matching more elements
    private static final String TOTAL_REV_METRICS_SELECT_DROPDOWN=".fnbTotalRev-Metrics-List";
    private static final String PRODUCTION_INPUT_FROM="//div[div[label[text()='Production']]]/div/input[1]";
    private static final String PRODUCTION_INPUT_TO="//div[div[label[text()='Production']]]/div/input[2]";
    private static final String PRODUCTION_DROPDOWN_BUTTON=".volume-select button";
    private static final String PRODUCTION_SELECT=".volume-select select";
    private static final String SEARCH_BUTTON=".account-select .multiselect-selected-text";
    private static final String SEARCH_ALL_PROFILE_OPTION=".account-select .checkbox.bold";
    private static final String OCC_FROM_SLIDER=".rangesliderwrap .irs-from";
    private static final String OCC_TO_SLIDER=".rangesliderwrap .irs-to";
    private static final String ALL_BREADCRUMB_TEXT=".criteria-bread-crumb li";
    private static final String BREADCRUMB_SLICE_TEXT ="//li[span[contains(text(),'string')]]/div";
    private static final String IMPACT_EVENT_YEAR_BTN=".year-select button";
    private static final String SELECT_IMPACT_EVENT_YEAR_DROPDOWN = "//select[@class='multiselect-list form-control impact-event-years-list']";
    private static final String IMPACT_EVENT_BTN="//span[text()='Select Impact Event']";
    private static final String SELECT_IMPACT_EVENT_DROPDOWN ="//select[@class='multiselect-list form-control impactEvent impact-event']";
    private static final String CALENDER_LABEL="#commonCustomDatePicker p";
    private static final String GRID_COLUMN_HEADERS = "(//div[contains(@class,'account-summary-table')]//tr)[1]//th";
    private static final String WAIT_SPINNER="wait";
    private static final String SELECT_IMPACTEVENT_NAME="//li[a[label[b[contains(text(),'string')]]]]/following-sibling::li[1]";


}
