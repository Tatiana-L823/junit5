package tl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class SourceTests extends TestBase {
    static Stream<org.junit.jupiter.params.provider.Arguments> nameAndCityProvider() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of("Alice", "New York"),
                org.junit.jupiter.params.provider.Arguments.of("Bob", "Berlin"),
                org.junit.jupiter.params.provider.Arguments.of("Clara", "Paris")
        );
    }

    @ParameterizedTest
    @MethodSource("nameAndCityProvider")
    void fillFormWithNameAndAddress(String name, String city) {
        open("/text-box");
        $("#userName").setValue(name);
        $("#currentAddress").setValue(city);
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #currentAddress").shouldHave(text(city));
    }

}
