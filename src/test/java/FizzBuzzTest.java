import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    void should_return_string_of_input_when_not_multiple_of_three_or_five() {
        String expectedOutput = "1";
        int inputNumber = 1;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void should_return_string_of_2_when_given_int_2() {
        String expectedOutput = "2";
        int inputNumber = 2;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_Fizz_when_given_int_3() {
        String expectedOutput = "Fizz";
        int inputNumber = 3;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void should_return_Fizz_when_given_int_6() {
        String expectedOutput = "Fizz";
        int inputNumber = 6;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_Fizz_when_given_int_9() {
        String expectedOutput = "Fizz";
        int inputNumber = 9;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void should_return_Buzz_when_given_int_5() {
        String expectedOutput = "Buzz";
        int inputNumber = 5;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_Buzz_when_given_int_10() {
        String expectedOutput = "Buzz";
        int inputNumber = 10;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_Buzz_when_given_int_20() {
        String expectedOutput = "Buzz";
        int inputNumber = 20;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_FizzBuzz_when_given_int_15() {
        String expectedOutput = "FizzBuzz";
        int inputNumber = 15;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_FizzBuzz_when_given_int_30() {
        String expectedOutput = "FizzBuzz";
        int inputNumber = 30;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_FizzBuzz_when_given_int_45() {
        String expectedOutput = "FizzBuzz";
        int inputNumber = 45;

        String actualOutput = fizzbuzz.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

}
