package tl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ParameterizedTests extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"John", "Anna", "Peter"})
    public void fillFormWithDifferentNames(String name) {
        open("https://demoqa.com/text-box");
        $("#userName").setValue(name);
        $("#submit").click();
        $("#output #name").shouldHave(text(name));
    }
    }

