package com.example.selenideFw.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Component
public class ContractOverviewPage {

    public ContractOverviewPage(){
        yearIsToIndex =new HashMap<>();
        yearIsToIndex.put(String.valueOf(LocalDateTime.now().minusYears(1).getYear()),"3");
        yearIsToIndex.put(String.valueOf(LocalDateTime.now().getYear()),"4");
        yearIsToIndex.put(String.valueOf(LocalDateTime.now().plusYears(1).getYear()),"5");
        yearIsToIndex.put(String.valueOf(LocalDateTime.now().plusYears(2).getYear()),"6");
    }

    private static final String CONTRACT_OVERVIEW="//h3[text()='Contract Overview']";
    private SelenideElement selenideElement=$x(CONTRACT_OVERVIEW);

    private static final String LIST_OF_ACCOUNTS="//tr//td[2]//span";
    private ElementsCollection listOfAccounts=$$x(LIST_OF_ACCOUNTS);

    private static final String LIST_OF_CONTRACT_ROWS="//tr[td[2]/span]";
    private ElementsCollection listOfContractRows=$$x(LIST_OF_CONTRACT_ROWS);

    private static final String LIST_OF_CONTRACT_COLS="td[contains(@class,'col-contract')]/span";
    private ElementsCollection listOfContractCols=$$x(LIST_OF_CONTRACT_COLS);

    private static final String LIST_OF_YEAR="//tr[2]/th//span";
    private ElementsCollection listOfYear=$$x(LIST_OF_YEAR);

    private static final String ADD_PROSPECT_BUTTON="//a[@title='Add Prospect Contract']//i";
    private SelenideElement addProspectButton=$x(ADD_PROSPECT_BUTTON);

    private static final String ADD_CONTRACT_TEXT="Add Contract";

    private Map<String,String> yearIsToIndex;


    public void openContractFor(String profileName,String year){
        listOfAccounts.shouldHaveSize(3);
        $x("//tr[td[span[text()='"+profileName+"']]]/td["+yearIsToIndex.get(year)+"]").click();
      /*  int indexOfYear=listOfYear.stream().map(element -> element.getText().trim()).collect(Collectors.toList()).indexOf(year);
        listOfAccounts.filter(Condition.exactText(profileName)).get(0).$$x(LIST_OF_CONTRACT_COLS).get(indexOfYear).click();*/
    }
}
