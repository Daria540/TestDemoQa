package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckResultForm {

    public CheckResultForm checkModalAppears(String text) {
        $("#example-modal-sizes-title-lg").shouldHave(text(text));
        return this;
    }

    public CheckResultForm verifyResult(String label, String value) {
        $(".table-responsive").$(byText(label)).parent().shouldHave(text(value));
        return this;
    }

    public CheckResultForm closeModal(){
        $("#closeLargeModal").click();
        return this;
    }
}


