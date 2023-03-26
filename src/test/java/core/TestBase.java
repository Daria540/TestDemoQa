package core;


import static com.codeborne.selenide.Selenide.open;

public class TestBase {


    public static void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

}
