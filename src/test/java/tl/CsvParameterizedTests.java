
package tl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CsvParameterizedTests extends TestBase {

    @ParameterizedTest
    @CsvSource({
            "John, john@example.com",
            "Anna, anna@test.com",
            "Peter, peter@mail.com"
    })
    void fillFormWithNameAndEmail(String name, String email) {
        open("/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text(email));
    }
}
