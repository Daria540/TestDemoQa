package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    private SelenideElement
            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileInput = $("#userNumber");

    public RegistrationForm openPage() {
        open("/automation-practice-form");
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

    public void submitForm() {
        $("#submit").click();
    }

    public RegistrationForm setProfession(String profession) {
        $("#subjectsInput").setValue(profession).pressEnter();
        return this;

    }

    public RegistrationForm setHobby(String hobby) {
        $(byText(hobby)).click();
        return this;
    }

    public RegistrationForm uploadFile(String nameFile) {
        $("input#uploadPicture").uploadFile(new File(nameFile));
        return this;
    }

    public RegistrationForm setAddress(String address) {
        $("#currentAddress").setValue(address);
        return this;
    }

    public RegistrationForm setState(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();
        return this;
    }

    public RegistrationForm setCity(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();
        return this;
    }

}
