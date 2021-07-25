package com.example.selenideFw.util;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.stereotype.Component;

import javax.lang.model.util.Elements;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class CalendarUtil{

    private static final String DATE_PICKER_START_DATE_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[1]";
    private static final String DATE_PICKER_START_MONTH_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[2]";
    private static final String DATE_PICKER_START_YEAR_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[3]";
    private static final String DATE_PICKER_END_DATE_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[6]";
    private static final String DATE_PICKER_END_MONTH_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[7]";
    private static final String DATE_PICKER_END_YEAR_VIEW = "(//th[@class='datepicker-switch'][@colspan='5'])[8]";
    private static final String DATE_PICKER_VIEW_LEFT_CAL = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][1]//th[@class='datepicker-switch'][@colspan='5']";
    private static final String DATE_PICKER_VIEW_RIGHT_CAL = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][2]//th[@class='datepicker-switch'][@colspan='5']";
    private static final String START_YEAR_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][1]//td[@colspan='7'][1]//span[contains(@class,'year')]";
    private static final String END_YEAR_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][2]//td[@colspan='7'][1]//span[contains(@class,'year')]";
    private static final String START_MONTH_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][1]//td[@colspan='7'][1]//span[contains(@class,'month')]";
    private static final String END_MONTH_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][2]//td[@colspan='7'][1]//span[contains(@class,'month')]";
    private static final String START_DATE_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][1]//td[contains(@class,'range day') or @class='day' or @class='active selected range-start day']";
    private static final String END_DATE_LIST = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][2]//td[contains(@class,'range day') or @class='day' or @class='active selected range-start day']";
    private static final String NEXT_PREV_BUTTON_END_YEAR_CALENDER="//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][2]//div[@class='datepicker-years']//th[contains(@class,'prev') or contains(@class,'next')]";
    private static final String NEXT_PREV_BUTTON_START_YEAR_CALENDER="//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][1]//div[@class='datepicker-years']//th[contains(@class,'prev') or contains(@class,'next')]";

    private ElementsCollection datePickerViewLeftCalendar=$$x(DATE_PICKER_VIEW_LEFT_CAL);
    private ElementsCollection datePickerViewRightCalendar=$$x(DATE_PICKER_VIEW_RIGHT_CAL);
    private SelenideElement datePickerStartYearView=$x(DATE_PICKER_START_YEAR_VIEW);
    private SelenideElement datePickerEndYearView=$x(DATE_PICKER_END_YEAR_VIEW);
    private ElementsCollection startDateList=$$x(START_DATE_LIST);
    private ElementsCollection endDateList=$$x(END_DATE_LIST);
    private ElementsCollection startMonthList=$$x(START_MONTH_LIST);
    private ElementsCollection endMonthList=$$x(END_MONTH_LIST);
    private ElementsCollection startYearList=$$x(START_YEAR_LIST);
    private ElementsCollection endYearList=$$x(END_YEAR_LIST);
    private ElementsCollection nextPrevButtonEndYearCalender=$$x(NEXT_PREV_BUTTON_END_YEAR_CALENDER);
    private ElementsCollection nextPrevButtonStartYearCalender=$$x(NEXT_PREV_BUTTON_START_YEAR_CALENDER);

    public void selectStartDateAndEndDate(LocalDate startDate, LocalDate endDate) {

        clickDatePicker(datePickerViewLeftCalendar, datePickerStartYearView);
        datePickerStartYearView.shouldBe(Condition.visible);
        //waitForElementToAppear(DATE_PICKER_START_YEAR_VIEW);

        navigateToYearList(startYearList,nextPrevButtonStartYearCalender,String.valueOf(startDate.getYear()));
        selectCalendarElement(startYearList, String.valueOf(startDate.getYear()), DATE_PICKER_START_MONTH_VIEW);
        selectCalendarElement(startMonthList, getMonth(startDate), DATE_PICKER_START_DATE_VIEW);
        selectCalendarElement(startDateList, String.valueOf(startDate.getDayOfMonth()), DATE_PICKER_START_DATE_VIEW);

        clickDatePicker(datePickerViewRightCalendar, datePickerEndYearView);
        datePickerEndYearView.shouldBe(Condition.visible);
        //waitForElementToAppear(DATE_PICKER_END_YEAR_VIEW);

        navigateToYearList(endYearList,nextPrevButtonEndYearCalender,String.valueOf(endDate.getYear())); // Navigate to year List.
        selectCalendarElement(endYearList, String.valueOf(endDate.getYear()), DATE_PICKER_END_MONTH_VIEW);
        selectCalendarElement(endMonthList, getMonth(endDate), DATE_PICKER_END_DATE_VIEW);
        selectCalendarElement(endDateList, String.valueOf(endDate.getDayOfMonth()), DATE_PICKER_END_DATE_VIEW);

//    waitForElementToDisappear(FISCAL_DATE_RANGE_CALENDAR_HEADER);
    }

    public void selectDateInCalendar(LocalDate date) {
        clickDatePicker(datePickerViewLeftCalendar, datePickerStartYearView);
        datePickerStartYearView.shouldBe(Condition.visible);
        //waitForElementToAppear(DATE_PICKER_START_YEAR_VIEW);

        selectCalendarElement(startYearList, String.valueOf(date.getYear()), DATE_PICKER_START_MONTH_VIEW);
        selectCalendarElement(startMonthList, getMonth(date), DATE_PICKER_START_DATE_VIEW);
        selectCalendarElement(startDateList, String.valueOf(date.getDayOfMonth()), DATE_PICKER_START_DATE_VIEW);

    }

    private void clickDatePicker(ElementsCollection datePickerViewLeftCalendar, SelenideElement datePickerStartYearView) {
        for (WebElement datePicker : datePickerViewLeftCalendar) {
            datePicker.click();
            if (datePicker.getText().equalsIgnoreCase(datePickerStartYearView.getText()) && datePicker.isDisplayed()) {
                break;
            }
        }
    }

    private void selectCalendarElement(ElementsCollection calendarElementList, String calendarElement, String datePickerView) {
        calendarElementList.stream().filter(instance -> instance.getText().equalsIgnoreCase(calendarElement) && instance.isDisplayed())
                .findFirst().ifPresent(element -> element.click());
       // datePickerView
       // waitForElementToAppear(datePickerView);
    }

    private void navigateToYearList(ElementsCollection calendarElementList, ElementsCollection prevNextButton, String calendarElement){
        int startYear=Integer.parseInt(calendarElementList.get(0).getText().trim());
        int endYear=Integer.parseInt(calendarElementList.get(calendarElementList.size()-1).getText().trim());
        int yearToBeSelected=Integer.parseInt(calendarElement);
        while(!(yearToBeSelected>startYear && yearToBeSelected<endYear)){
            startYear=Integer.parseInt(calendarElementList.get(0).getText().trim());
            endYear=Integer.parseInt(calendarElementList.get(calendarElementList.size()-1).getText().trim());
            if(yearToBeSelected<startYear){
                prevNextButton.get(0).click();
            }else if(yearToBeSelected>endYear) {
                prevNextButton.get(1).click();
            }
        }

    }

    public String getMonth(LocalDate localDate) {
        return localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
    }

/*
    //Use of JavascriptExecutor is discouraged. Use only when ran out of options.
    //TODO:: A click should be made in a calendar using selenium instead of injecting that date directly using JS executor
    @Deprecated
    public void sendTextWithJavascriptExecutorClassName(String date, String locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("jQuery('." + locator + "').datepicker('setDate','" + date + "')");
    }

    //Use of JavascriptExecutor is discouraged. Use only when ran out of options.
    //TODO:: A click should be made in a calendar using selenium instead of injecting that date directly using JS executor
    @Deprecated
    public void sendTextWithJavascriptExecutorId(String date, String locator) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("jQuery('#" + locator + "').datepicker('setDate','" + date + "')");
    }
*/

}