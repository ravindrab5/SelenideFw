package com.example.selenideFw.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

@Component
public class AddContractPage {

    private static final String ADD_CONTRACT_SAVE_BUTTON=".account-intelligence--contract-summary .chi-save";
    private SelenideElement addContractSaveButton=$(ADD_CONTRACT_SAVE_BUTTON);

    private static final String ADD_CONTRACT_CLOSE_BUTTON=".account-intelligence--contract-summary .btn-close .chi-close3";
    private SelenideElement addContractCloseButton=$(ADD_CONTRACT_CLOSE_BUTTON);

    private static final String CONTRACT_DATE_RANGE_CALENDAR=".account-intelligence--contract-summary #commonCustomDatePicker .btn-calendar";
    private SelenideElement contractDateRangeCalender=$(CONTRACT_DATE_RANGE_CALENDAR);

    private static final String LIST_OF_CONTRACT_STATUS=".draft-item .mars-radio label";
    private ElementsCollection listOfContractStatus=$$(LIST_OF_CONTRACT_STATUS);

    private static final String ADD_RATE_PLAN=".draft-item .chi-plus2";
    private SelenideElement addRatePlanButton=$(ADD_RATE_PLAN);

    private static final String RATE_PLAN_INPUT="//div[contains(@class,'draft-item--rate-plan') or contains(@class,'draft-row--rateplan-extra')]//input";
    private ElementsCollection ratePlanInput=$$x(RATE_PLAN_INPUT);

    private static final String NOTES_INPUT="//div[div[span[text()='Notes']]]//input";
    private SelenideElement notesInput=$x(NOTES_INPUT);

    private static final String ADD_CONTRACT_IN_FORM=".chi-add-property";
    private SelenideElement addContractInForm=$(".chi-add-property");

    private static final String CONTRACT_SAVED_ERROR_NOTIFICATION=".draft-bar-title #contractSavedNotification";
    private SelenideElement contractSavedErrorNotification=$(CONTRACT_SAVED_ERROR_NOTIFICATION);

    private static final String CONTRACT_SAVED_ERROR_MSG=".draft-bar-title #contractSavedNotification strong";
    private SelenideElement contractSavedErrorMsg=$(CONTRACT_SAVED_ERROR_MSG);


    private static final String CONTRACT_DATE_RANGE_DROPDOWN_BUTTON=".contract-date-select button span";
    private SelenideElement contractDateRangeDropDownButton=$(CONTRACT_DATE_RANGE_DROPDOWN_BUTTON);

    private static final String CONTRACT_DATE_RANGE_OPTIONS=".contract-date-select .radio";
    private ElementsCollection contractDateRangeOptions=$$(CONTRACT_DATE_RANGE_OPTIONS);

    private static final String CONTRACT_DATE_RANGE_LABEL=".draftrowcontentarea .form-group-input .data-info";
    private SelenideElement contractDateRangeLabel=$(CONTRACT_DATE_RANGE_LABEL);

    private static final String RATEPLAN_MINUS_ICONS=".contract-draft-content .chi-minus";
    private ElementsCollection rateplanMinusIcons=$$(RATEPLAN_MINUS_ICONS);

    private static final String EDIT_CONTRACT="//div[@class='contract-update']/following-sibling::*";
    private ElementsCollection editContract=$$x(EDIT_CONTRACT);

    private static final String RATE_PLAN_INPUTTEXT_IN_SAVEMODE =".draft-item--rate-plan .form-control";
    private ElementsCollection ratePlanInputTextInSaveMode=$$x(RATE_PLAN_INPUTTEXT_IN_SAVEMODE);

    private static final String DELETE_CONTRACT_POPUP_OK_BTN="//button[text()='OK']";
    private SelenideElement deleteContractConfirmationOkButton=$x(DELETE_CONTRACT_POPUP_OK_BTN);

    private static final String CONTRACT_MANAGER_DROPDOWNBUTTON=".contract-manager-edit button";
    private SelenideElement contractManagerButton=$(CONTRACT_MANAGER_DROPDOWNBUTTON);

    private static final String CONTRACT_MANAGER_OPTIONS="//div[contains(@class,'contract-manager-edit')]//li[not(contains(@class,'multiselect-item'))]//label";
    private ElementsCollection contractManagerOptions=$$x(CONTRACT_MANAGER_OPTIONS);

    private static final String MARKETSEGMENT_DROPDOWN_BUTTON=".primary-segment-edit button span";
    private SelenideElement marketSegmentDropDownButton=$(MARKETSEGMENT_DROPDOWN_BUTTON);

    private static final String MARKETSEGMENT_DROPDOWN_OPTIONS="//div[contains(@class,'primary-segment-edit')]//li[not(contains(@class,'multiselect-group'))]//label";
    private ElementsCollection marketSegmentDropDownOptions=$$x(MARKETSEGMENT_DROPDOWN_OPTIONS);

    private static final String RATE_STRATEGY_CEILING_DROPDOWN_BUTTON=".ceiling-rate-select button span";
    private SelenideElement rateStrategyCeilingDropDownButton=$(RATE_STRATEGY_CEILING_DROPDOWN_BUTTON);

    private static final String RATE_STRATEGY_CEILING_DROPDOWN_OPTIONS="//div[contains(@class,'ceiling-rate-select')]//li[not(contains(@class,'multiselect-group'))]//label";
    private ElementsCollection rateStrategyCeilingDropdownOptions=$$x(RATE_STRATEGY_CEILING_DROPDOWN_OPTIONS);

    private static final String PRIMARY_SEGMENT_SELECTED_INSAVE_MODE="//div[div[span[text()='Primary Segment']]]//div[@class='is-save']//div";
    private SelenideElement primarySegmentSelectedInSaveMode=$x(PRIMARY_SEGMENT_SELECTED_INSAVE_MODE);

    private static final String ACCOUNT_NAME_INPUT="//div[div[span[text()='Account Name']]]//input";
    private SelenideElement accountNameInput=$x(ACCOUNT_NAME_INPUT);

    private static final String PMS_PROFILE_ID_INPUT="//div[div[span[text()='PMS Profile ID']]]//input";
    private SelenideElement pmsProfileIdInput=$x(PMS_PROFILE_ID_INPUT);

    private static final String DELETE_CONTRACT_BUTTON="//div[div[span[text()='Contract Date Range']]]//div[@class='is-save']/span";
    private SelenideElement deleteContractButtons=$x(DELETE_CONTRACT_BUTTON);

    private static final String DELETE_CONTRACT_CONFIRMATION_MSG="#globalConfirmationBox p";
    private SelenideElement delectContractConfirmationMessage=$(DELETE_CONTRACT_CONFIRMATION_MSG);

    private static final String SPINNER="wait";
    private SelenideElement waitSpinner=$(byId(SPINNER));

    private static final String CONTRACT_DATE_RANGE_LABEL_EDIT=".data-rangecalendar p";
    private SelenideElement contractDateRangeLabelEdit=$(CONTRACT_DATE_RANGE_LABEL_EDIT);

    private static final String CALENDER_CLOSE_BUTTON="#commonCustomDatePicker .chi-close3";
    private SelenideElement calenderCloseButton=$(CALENDER_CLOSE_BUTTON);

    public void enterAccountName(String acountName){
        accountNameInput.clear();
        accountNameInput.sendKeys(acountName);
    }

    public void enterPmsProfileIdInput(String pmsId){
        pmsProfileIdInput.clear();
        pmsProfileIdInput.sendKeys(pmsId);
    }

    public void selectContractManager(String contractManager){
        contractManagerButton.shouldBe(Condition.visible).click();
        contractManagerOptions.get(0).should(Condition.visible);
        int index=contractManagerOptions.stream().map(element -> element.getText().trim()).collect(Collectors.toList()).indexOf(contractManager);
        contractManagerOptions.get(index).click();
    }

    public void  openContractDateRangeCalender(){
        //waitForElementToAppear(contractDateRangeCalender);
        //waitForElementToBeClickable(contractDateRangeCalender);
        contractDateRangeCalender.shouldBe(Condition.visible);
        contractDateRangeCalender.click();
    }

    public void enterRatePlanIn(int inputIndex,String ratePlan){
        ratePlanInput.get(inputIndex).sendKeys(ratePlan);
    }


    public void enterNotes(String notes){
        notesInput.sendKeys(notes);
    }

    public void selectRatePlanStrategyCeiling(String option){
        rateStrategyCeilingDropDownButton.click();
        int index=rateStrategyCeilingDropdownOptions.stream().map(element -> element.getText().trim()).collect(Collectors.toList()).indexOf(option);
        rateStrategyCeilingDropdownOptions.get(index).click();
    }

    public void selectAddMarketSegment(String marketSegment){
        marketSegmentDropDownButton.click();
        int index=marketSegmentDropDownOptions.stream().map(element->element.getText().trim()).collect(Collectors.toList()).indexOf(marketSegment);
        marketSegmentDropDownOptions.get(index).click();
    }

    public void clickSaveButton(){
       // waitForElementToAppear(addContractSaveButton);
        addContractSaveButton.shouldBe(Condition.visible);
        addContractSaveButton.click();
    }

    public void clickCloseButton(){
        addContractCloseButton.click();
    }

    public String getContractDateRangeLabel(){
        return contractDateRangeLabel.getText().trim();
    }


    public void clickAddContractInForm(){
        addContractInForm.click();
    }

    public String getCalenderLabelInEditMode(){
        return contractDateRangeLabelEdit.getText().trim();
    }

    /*public boolean isContractSavedErrorNotificationDisplayed(){
        return !contractSavedErrorNotification.getAttribute("style").contains("display: none;");
    }
*/
    public String getErrorMessageText(){
        contractSavedErrorMsg.shouldBe(Condition.visible);
        return contractSavedErrorMsg.getText().trim();
    }

}
