package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    //Elements

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail");

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
    public RegistrationFormPage clearFirstName(String value) {
        firstNameInput.clear();
        return this;
    }
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




}
