package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HobbyForm {
    public static void setHobby(String hobby){
        $(byText(hobby)).click();
    }
}
