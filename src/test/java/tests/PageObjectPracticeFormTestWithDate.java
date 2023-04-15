package tests;

import core.TestBase;
import org.junit.jupiter.api.Test;
import pages.CheckResultForm;
import pages.RegistrationForm;
import pages.components.BirdDateInputForm;
import testdata.TestData;


public class PageObjectPracticeFormTestWithDate extends TestBase {

    RegistrationForm registrationForm = new RegistrationForm();
    CheckResultForm checkResultForm = new CheckResultForm();

    @Test
    void firstTest() {
        registrationForm.openPage()
                .closeBanner()
                .setFirstName(TestData.name)
                .setLastName(TestData.lastName)
                .setEmail(TestData.email)
                .setGender(TestData.gender)
                .setMobile(TestData.mobile);
        BirdDateInputForm.selectDate(TestData.monthOfBirth, TestData.yearOfBirth, TestData.dayOfBirth);
        registrationForm.setProfession(TestData.setProfession)
                .setHobby(TestData.hobby)
                .uploadFile("src/test/resources/17478da42271207e1d86.jpg")
                .setAddress(TestData.address)
                .setState(TestData.state)
                .setCity(TestData.randomCity())
                .submitForm();

//        check result
        checkResultForm.checkModalAppears("Thanks for submitting the form")
                .verifyResult("Student Name", TestData.name + " " + TestData.lastName)
                .verifyResult("Student Email", TestData.email)
                .verifyResult("Gender", TestData.gender)
                .verifyResult("Mobile", TestData.mobile)
                .verifyResult("Date of Birth", TestData.dayOfBirth + " " + TestData.monthOfBirth + "," + TestData.yearOfBirth)
                .verifyResult("Subjects", TestData.setProfession)
                .verifyResult("Hobbies", TestData.hobby)
                .verifyResult("Picture", "17478da42271207e1d86.jpg")
                .verifyResult("Address", TestData.address)
                .verifyResult("State and City", TestData.state + " " + TestData.randomCity())
                .closeModal();
    }
}