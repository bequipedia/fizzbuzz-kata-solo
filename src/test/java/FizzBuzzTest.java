import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    void should_return_string_of_input_when_not_multiple_of_three_or_five() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expectedOutput = "1";
        int inputNumber = 1;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }


}
