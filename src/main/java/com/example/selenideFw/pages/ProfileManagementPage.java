package com.example.selenideFw.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

@Component
public class ProfileManagementPage{

    private static final String linkingDropDownPath = "//tr[td[span[text()='string']]]/td[5]/div/div/div/span";
    private static final String delinkingDropDownPath = "//tr[td[span[span[text()='string']]]]/td[5]/div/div/div/span/div/button/span";

    private static final String CLASS = "class";
    private static final String EXCLUDED_TAB = "//a[contains(text(),'Excluded Profiles')]";
    private static final String EDIT_ICON_IN_REPORT_GRID = ".profile-management-table .chi-edit";
    private static final String SAVE_BUTTON_IN_REPORT_GRID = ".profile-management-table .chi-save";
    private static final String CANCEL_SAVE_BUTTON_IN_REPORT_GRID = "tr .chi-close3";
    private static final String SELECT_FROM_SEARCHED_TEXT = ".sub-profile-select label";
    private static final String SUB_PROFILE_CHECK_BOX = ".sub-profiles-checkbox span";
    private static final String TABLE_HEADER_SUBPROFILE = "//table/thead/tr/th[5]";
    private static final String ACCEPT_ALL_BUTTON = ".list-action-content .btn-accept";
    private static final String CLOSE_BUTTON_STAR_ICON_POPUP = ".action-bar .chi-close3";
    private static final String INVALID_LINKING_POPUPTEXT = "#globalConfirmationBox p";
    private static final String INVALID_LINKING_OK_BUTTON = "#globalConfirmationBox button";
    private static final String MASTER_PROFILES = "//tbody/tr/td[3]/span";
    private static final String SORT_PROFILE_LIST_DROP_DOWN = ".sort-profile-select .multiselect-list";
    private static final String PROFILE_DISPLAY = ".btn-profile-search";
    private static final String SORT_PROFILE_DROP_DOWN_BUTTON = ".sort-profile-select button";
    private static final String RN_COL = "//tbody/tr/td[last()-1]/span";
    private static final String GO_BUTTON_IN_CRITERIA = ".chi-go";
    private static final String TABLE_HEADER_AUTOLINK = "//table/thead/tr/th[7]";
    private static final String PROFILE_SEARCH_BUTTON_DROP_DOWN = ".profile-name-select .multiselect-selected-text";
    private static final String SEARCH_FIELD = "//input[@placeholder='Search..']";
    private static final String SEARCH_RESULT = ".profile-name-select label";
    private static final String PROFILE_TYPE_DROP_DOWN = ".profile-type-select button";
    private static final String PROFILE_TYPE_SELECT_DROP_DOWN = ".profile-type-select .profile-type";
    private static final String PROFILE_TYPE_SELECT_SELECT_ALL_OPTION = "//a[label[input[@value='select-all-value']]]";
    private static final String COMPARABLE_SEGMENT_BUTTON = ".btn-popup-segment";
    private static final String COMPARABLE_SEGMENT_DIALOG_BOX = "common-dialog-popup-for-comparable-segment";
    private static final String COMPARABLE_SEGMENT_ROWS = "//div[@id='common-dialog-popup-for-comparable-segment']//div[contains(@class,'utilities-view active')]//span[contains(@class,'utilities__cell-head')]";
    private static final String COMPARABLE_SEGMENT_CANCEL_BUTTON = ".action-bar .chi-close3";
    private static final String COMPARABLE_SEGMENT_SAVE_BUTTON = ".action-bar .chi-save";
    private static final String COMPARABLE_SEGMENT_EDIT_BUTTON = ".action-bar .chi-edit";
    private static final String PENDING_INFORMATION_LABEL = "//div[@class='account-function']//input";
    private static final String TABLE_HEADERS = "//table/thead/tr/th";
    private static final String AUTOLINK_CHECKBOX = ".auto-link-checkbox span";
    private static final String AUTOLINK_BUTTON_IN_COLUMN = "//tr[td[span[span[text()='string']]]]/td[7]";
    private static final String AUTOLINK_POPUP_INPUT_TEXT = ".autoLinkName";
    private static final String AUTOLINK_POPUP_SAVE_BTN = ".mars-popup-titlebar .chi-save";
    private static final String AUTOLINK_POPUP_CLOSE_BTN = ".mars-popup-titlebar .chi-close3";
    private static final String AUTOLINK_POPUP_ADD_BTN = ".chi-plus2";
    private static final String SUBPROFILES_ALL = "//tr[td[span[span[text()='string']]]]/following-sibling::tr[position()<5]/td[5]/span";
    private static final String SUBPROFILE_EXPAND_ICON = "//tr[td[span[span[text()='string']]]]/td[5]/span/i[contains(@class,'chi-arrowright')]";
    private static final String AUTOLINK_ERROR_POPUPTEXT = ".modal-body p";
    private static final String AUTOLINK_ERROR_POPUP_OK_BUTTON = "//button[text()='OK']";
    private static final String AUTOLINK_POPUP_DELETE_BUTTON = ".autolink-popup-content--edit .btn-deletecell .chi-minus";
    private static final String PENDING_OR_APPROVAL_BUTTON = "//tr[td[span[span[text()='string']]]]/td[2]/div/div/div/span/i[1]";
    private static final String EXCLUDE_BUTTON = "//tr[td[span[span[text()='string']]]]/td[2]/div/div/div/span/i[2]";
    private static final String MESSAGE_IN_AUTOLINK_POPUP = "#autoLinkConfigPopupNotification strong";
    private static final String EDIT_ICON_IN_AUTOLINK_POPUP = "#common-dialog-popup-for-auto-link .chi-edit";
    private static final String COMPARABLE_SEG_CHECKBOX_PREFIX = "//div[div[span[text()='";
    private static final String REACTIVATE_STAR_ICON = "table .chi-star";
    private static final String WAIT_LOCATOR = "wait";

    private SelenideElement excludedProfileTab=$x(EXCLUDED_TAB);
    private SelenideElement editIcon=$(EDIT_ICON_IN_REPORT_GRID);
    private SelenideElement saveButton=$(SAVE_BUTTON_IN_REPORT_GRID);
    private SelenideElement cancelSaveButton=$(CANCEL_SAVE_BUTTON_IN_REPORT_GRID);
    private SelenideElement selectFromSearchedText=$(SELECT_FROM_SEARCHED_TEXT);
    private SelenideElement subProfileCheckBox=$(SUB_PROFILE_CHECK_BOX);
    private SelenideElement tableHeaderSubprofile=$x(TABLE_HEADER_SUBPROFILE);
    private SelenideElement reactivateStarIcon=$(REACTIVATE_STAR_ICON);
    private SelenideElement acceptAllButton=$(ACCEPT_ALL_BUTTON);
    private SelenideElement closeButtonStarIconPopup=$(CLOSE_BUTTON_STAR_ICON_POPUP);
    private SelenideElement invalidLinkingPopupText=$(INVALID_LINKING_POPUPTEXT);
    private SelenideElement invalidLinkingOkButton=$(INVALID_LINKING_OK_BUTTON);
    private ElementsCollection masterProfiles=$$x(MASTER_PROFILES);
    private SelenideElement sortProfileListSelect=$(SORT_PROFILE_LIST_DROP_DOWN);
    private SelenideElement profileDisplayButton=$(PROFILE_DISPLAY);
    private SelenideElement sortProfileButton=$(SORT_PROFILE_DROP_DOWN_BUTTON);
    private SelenideElement goButton=$(GO_BUTTON_IN_CRITERIA);
    private ElementsCollection rnCol=$$x(RN_COL);
    private SelenideElement profileSearchButtonDropdown=$(PROFILE_SEARCH_BUTTON_DROP_DOWN);
    private SelenideElement searchField=$x(SEARCH_FIELD);
    private ElementsCollection searchResults=$$(SEARCH_RESULT);
    private SelenideElement profileTypeButton=$(PROFILE_TYPE_DROP_DOWN);
    private SelenideElement profileTypeSelectOptions=$(PROFILE_TYPE_SELECT_DROP_DOWN);
    private SelenideElement profileTypeSelectAllOptions=$x(PROFILE_TYPE_SELECT_SELECT_ALL_OPTION);
    private ElementsCollection tableHeaders=$$x(TABLE_HEADERS);
    private SelenideElement compSegmentButton=$(COMPARABLE_SEGMENT_BUTTON);
    private SelenideElement compSegmentDialogBox=$(byId(COMPARABLE_SEGMENT_DIALOG_BOX));
    private ElementsCollection comparableSegmentRows=$$x(COMPARABLE_SEGMENT_ROWS);
    private SelenideElement comparableSegmentCancelSaveButton=$(COMPARABLE_SEGMENT_CANCEL_BUTTON);
    private SelenideElement comparableSegmentSaveButton=$(COMPARABLE_SEGMENT_SAVE_BUTTON);
    private SelenideElement comparableSegmentEditButton=$(COMPARABLE_SEGMENT_EDIT_BUTTON);
    private SelenideElement pendingInformation=$x(PENDING_INFORMATION_LABEL);
    private SelenideElement autoLinkCheckbox=$(AUTOLINK_CHECKBOX);
    private SelenideElement autolinkPopupInputText=$(AUTOLINK_POPUP_INPUT_TEXT);
    private SelenideElement autolinkPopupSaveButton=$(AUTOLINK_POPUP_SAVE_BTN);
    private SelenideElement autolinkCloseButton=$(AUTOLINK_POPUP_CLOSE_BTN);
    private SelenideElement autolinkPopupAddButton=$(AUTOLINK_POPUP_ADD_BTN);
    private SelenideElement tableHeaderAutolink=$x(TABLE_HEADER_AUTOLINK);
    private SelenideElement autolinkErrorTextPopup=$(AUTOLINK_ERROR_POPUPTEXT);
    private SelenideElement autolinkErrorOkButton=$x(AUTOLINK_ERROR_POPUP_OK_BUTTON);
    private SelenideElement autolinkDeleteButton=$(AUTOLINK_POPUP_DELETE_BUTTON);
    private SelenideElement messageInAutolinkPopup=$(MESSAGE_IN_AUTOLINK_POPUP);
    private SelenideElement autolinkEditIcon=$(EDIT_ICON_IN_AUTOLINK_POPUP);
    private SelenideElement waitLocator=$(byId(WAIT_LOCATOR));

    public void openProfileDisplayPopup() {
        profileDisplayButton.click();
    }

    public void selectSortProfile(String sortType) {
        sortProfileButton.click();
        sortProfileListSelect.selectOptionContainingText(sortType);
        //selectByVisibleTextInDropdown(sortProfileListSelect, sortType);
    }

    public void clickGoButton() {
        goButton.click();
    }

    public List<String> allMasterProfiles() {
        $(byId("wait")).shouldNotBe(Condition.visible);
        //waitForElementToDisappear(By.id("wait"));
        return masterProfiles.stream().map(SelenideElement::getText).collect(Collectors.toList());
    }

    public void checkSubProfileCheckBox() {
        if (!"Sub - Profiles".equalsIgnoreCase(tableHeaderSubprofile.getText().trim())) {
            subProfileCheckBox.click();
            $(byId("wait")).shouldNotBe(Condition.visible);
        }
    }

    public void profileTypeSelectOnly(String byVisibleText) {
        profileTypeButton.click();
        profileTypeSelectAllOptions.click();
        profileTypeSelectOptions.selectOptionContainingText(byVisibleText);
        //selectByVisibleTextInDropdown(profileTypeSelectOptions, byVisibleText);
    }


}
