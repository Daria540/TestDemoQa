package example.org;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {


    @Test
    void testSelenide() {
            String Junit5Code = "@ExtendWith({SoftAssertsExtension.class})\n"
                    +"class Tests {\n"
                    +"@Test\n"
                    +" void test() {\n"
                    +"Configuration.assertionMode = SOFT;\n"
                    +"open(\"page.html\");\n"
                    +"\n"
                    +"$(\"#first\").should(visible).click();\n"
                    +" $(\"#second\").should(visible).click();\n"
                    +"}\n" +
                    "}";

        Configuration.browserSize = "1920x1080";
        open("https://github.com/");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
        $(".markdown-body").shouldHave(text(Junit5Code));

    }
}
