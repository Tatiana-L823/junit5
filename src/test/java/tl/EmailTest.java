package tl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Emailing tests")
    public class EmailTest {

    @Test
    @DisplayName("Email should be sent for a new user")
    void emailShouldBeSentForNewUser() {
        System.out.println("Hello World");

   }

    @Test
    @DisplayName("Email should be sent for a banned user")
    void emailShouldBeSentForBannedUser() {
        System.out.println("Hello World");

    }

    @Disabled("JDK-8316534")
    @Test
    @DisplayName("Email should be sent after change of the payment method")
    void emailShouldBeSentAfterChangePaymentMethod() {
        throw new AssertionError("Falling");

    }
}
