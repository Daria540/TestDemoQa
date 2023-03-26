package tests;

import core.TestBase;
import org.junit.jupiter.api.Test;
import pages.*;
import pages.components.*;

public class PageObjectPracticeFormTest {

    RegistrationForm registrationForm = new RegistrationForm();
    CheckResultForm checkResultForm = new CheckResultForm();

    @Test
    void firstTest() {
        TestBase.openPage();
        registrationForm.closeBanner()
                .setFirstName("Tiabaldy")
                .setLastName("Ivanov")
                .setEmail("test@gmail.com")
                .setGender("Other")
                .setMobile("9034561234");

        BirdDateInputForm.selectDate("April", "2000", "21");
        registrationForm.setProfession("Computer Science")
                .setHobby("Sports")
                .uploadFile("src/test/resources/17478da42271207e1d86.jpg")
                .setAddress("Name street, 20 house, 123 apartment")
                .setState("Haryana")
                .setCity("Panipat")
                .submitForm();

//        check result
        checkResultForm.checkModalAppears("Thanks for submitting the form")
                .verifyResult("Student Name", "Tiabaldy Ivanov")
                .verifyResult("Student Email", "test@gmail.com")
                .verifyResult("Gender", "Other")
                .verifyResult("Mobile", "9034561234")
                .verifyResult("Date of Birth", "21 April,2000")
                .verifyResult("Subjects", "Computer Science")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "17478da42271207e1d86.jpg")
                .verifyResult("Address", "Name street, 20 house, 123 apartment")
                .verifyResult("State and City", "Haryana Panipat")
                .closeModal();
    }
}
