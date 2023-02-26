package example.org;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {
    @Test
    void firstTest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("[id=firstName]").setValue("Tiabaldy");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("test@gmail.com");
        $("label[for=gender-radio-3]").click();
        $("#userNumber").setValue("9034561234");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("April");
        $(".react-datepicker__year-select").selectOptionContainingText("2000");
        $(By.cssSelector("div.react-datepicker__day[aria-label='Choose Monday, April 10th, 2000']")).click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("label[for=hobbies-checkbox-1]").click();
        $("input#uploadPicture").uploadFile(new File("src/resources/17478da42271207e1d86.jpg"));
        $("#currentAddress").setValue("Moscow");
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Panipat").pressEnter();
        $("#submit").click();

//        check result
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Tiabaldy Ivanov"),text("test@gmail.com"),
                text("Other"),text("9034561234"),text("10 April,2000"),text("Computer Science"),
                text("Sports"),text("17478da42271207e1d86.jpg"),
                text("Moscow"),text("Haryana Panipat"));
        $("#closeLargeModal").click();
    }
}
