package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class ProfessionForm {

    public static void setProfession(String profession){
        $("#subjectsInput").setValue(profession).pressEnter();
    }
}
