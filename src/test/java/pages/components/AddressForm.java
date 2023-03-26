package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class AddressForm {
    public static void setAddress(String address){
        $("#currentAddress").setValue(address);
    }
    public static void setState(String state){
        $("#react-select-3-input").setValue(state).pressEnter();
    }
    public static void setCity (String city){
        $("#react-select-4-input").setValue(city).pressEnter();
    }

}
