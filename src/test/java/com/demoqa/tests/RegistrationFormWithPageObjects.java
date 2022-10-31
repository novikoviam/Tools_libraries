package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormWithPageObjects {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        //   Configuration.browser = "Google Chrome"
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
        .setFirstName("Vladimir")
        .setLastName("Novikov")
        .setEmail("novikoviam@ya.ru")
        .setGender("Other")
        .setNumber("10101010")
/*        .setCurrentAddress("address, city, state")*/
/*        .setBirthDate("10","10","2010")*/
        .setHobbies("Reading")
        .subjectsInput("Math")
        .setPicture("1.png")
/*        .checkResultsTableVisible()*/
        ;



/*        //Based fills
        $("#firstName").setValue("Vladimir");
        $("#lastName").setValue("Novikov");
        $("#userEmail").setValue("novikoviam@ya.ru");
        $("#genterWrapper").$(byText("Female")).click();
        // OR other examples
        // $("#gender-radio-1").click();
        // $("#gender-radio-3").parent().click();
        // $("[for=gender-radio-2]").click();
        //$(by("for", "gender-radio-2")).click();
        $("#userNumber").setValue("88003332345");
        $("#currentAddress").setValue("Some test address input");


        // Date
      *//*  $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("2005");
        $(".react-datepicker__day--012:not(.react-datepicker__day--outside-month)").click();
*//*
*//*
        registrationFormPage .setBirthDate("20", "10", "2000");
*//*

        // Subjects field input not a work
//        $("#subjectsInput").click();com.codeborne.selenide.Configuration
//        $("#subjectsInput").setValue("Math").pressEnter();
        // OR
//        $("subjectsInput)").sendKeys("Math");
//        $("subjectsInput)").pressEnter();

        //Hobbies
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        // image uploading
        $("#uploadPicture").uploadFromClasspath("1.png");

        // state and city
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();

        //Check

        $(".modal-dialog").should(appear);

        registrationFormPage.checkResultsTableVisible();
        registrationFormPage.checkResult("Student Name", "Vladimir Novikov");
        registrationFormPage.checkResult("Student Email", "novikoviam@ya.ru");
        registrationFormPage.checkResult("Date of Birth", "12 January, 2005");


*//*        $(".table-responsive").shouldHave(text("Vladimir Novikov"), text("novikoviam@ya.ru"),
                text("Female"), text("8800333234"), text("12 January,2005"));*/
    }

    @Test
    void fillFormWithMinimumDataTest() {
        registrationFormPage.openPage()
                .setFirstName("Vladimir")
                .setLastName("Novikov")
                .setEmail("novikoviam@ya.ru")
                .setGender("Other");

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Vladimir Novikov"), text("novikoviam@ya.ru"),
                text("Other"));
    }
}
