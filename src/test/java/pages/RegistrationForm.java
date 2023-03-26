package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    private SelenideElement
            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileInput = $("#userNumber");

    public RegistrationForm openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationForm closeBanner() {
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationForm setFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }

    public RegistrationForm setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationForm setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationForm setGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    public RegistrationForm setMobile(String mobile) {
        mobileInput.setValue(mobile);
        return this;
    }
    public void submitForm (){
        $("#submit").click();
    }

}
