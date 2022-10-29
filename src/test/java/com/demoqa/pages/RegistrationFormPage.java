package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultTableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    //Elements
    private CalendarComponent calendarComponent = new CalendarComponent();
    private ResultTableComponent resultTableComponent = new ResultTableComponent();
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            hobbiesCheckBoxes =  $("hobbiesWrapper");


    private final static String TITLE_TEXT = "Thanks for submitting the form";

    // Actions

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;

    }
    public RegistrationFormPage setFirstName(String value) {
       firstNameInput.setValue(value);
       return this;


    }
  /*  public RegistrationFormPage clearFirstName(String value) {
        firstNameInput.clear();
        return this;
    }*/
    public RegistrationFormPage setLastName(String value) {
       lastNameInput.setValue(value);
       return this;

    }
    public RegistrationFormPage setEmail(String value) {
        emailInput.setValue(value);
        return this;

    }
    public RegistrationFormPage setGender(String value) {
        $("#genterWrapper").$(byText("Other")).click();
        return this;
    }

        public RegistrationFormPage setBirthDate(String day, String month, String year ) {
            $("#dateOfBirthInput").click();
            calendarComponent.setDate(day, month, year);
            return this;
    } public RegistrationFormPage setNumber(String value) {
            $("#userNumber").setValue(value);
            return this;
    }
    public RegistrationFormPage setCurrentAddress(String value) {
           currentAddressInput.setValue("Some test address input");

        return this;
    }
    public RegistrationFormPage hobbiesCheckBoxes (String value) {
           hobbiesCheckBoxes.setValue("Some test address input");

        return this;
    }
    public RegistrationFormPage checkResultsTableVisible() {
        resultTableComponent.checkVisible();
        return this;
    }
        public RegistrationFormPage checkResult(String key, String value) {
            resultTableComponent.checkResult(key, value);

            return this;


        }
}
