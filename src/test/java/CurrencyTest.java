import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {

    @Test
    void testGiven74dot85RupeesEqualsOneDollar() {
        double rupees = 74.85;
        double dollar = 1;
        boolean expectedResult = true;
        Currency currency = new Currency(rupees);

        boolean actualResult = currency.ifEquals(dollar);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    void testGiven149dot7RupeesNotEqualsOneDollar() {
        double rupees = 149.7;
        double dollar = 1;
        boolean expectedResult = false;
        Currency currency = new Currency(rupees);

        boolean actualResult = currency.ifEquals(dollar);

        assertEquals(expectedResult,actualResult);
    }
}
