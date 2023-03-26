package pages.components;


import static com.codeborne.selenide.Selenide.$;

public class BirdDateInputForm {

    public static void selectDate(String month, String year, String day) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText(month);
        $(".react-datepicker__year-select").selectOptionContainingText(year);
        $(".react-datepicker__day--0" + day+ ":not(.react-datepicker__day--outside-month").click();
    }
}
