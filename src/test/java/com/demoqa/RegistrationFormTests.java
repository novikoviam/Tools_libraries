package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
     //   Configuration.browserSize = "1920x1080";
     //   Configuration.browser = "Google Chrome"
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        String name = "Egor";

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form1"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");


        $("#firstname").setValue("Vladimir");
        $("#lastname").setValue("Novikov");
        $("#userEmail").setValue("novikoviam@ya.ru");
        $("#genterWrapper").$(byText("Male")).click()
       // OR
       // $("#gender-radio-1").click();
        // $("#gender-radio-3").parent().click();
        // $("[for=gender-radio-2]").click();
        //$(by("for", "gender-radio-2")).click();

        $("#usernumber").setValue("88003332345");
        $("#currentAddress").setValue("Some address 1");


        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("Egor@egor.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 1"));


    }
}
