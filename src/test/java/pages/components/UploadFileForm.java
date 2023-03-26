package pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileForm {
    public static void uploadFile(String nameFile){
        $("input#uploadPicture").uploadFile(new File(nameFile));

    }
}
