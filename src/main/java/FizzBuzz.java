public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String convert(int inputNumber) {
        String result = String.valueOf(inputNumber);
        boolean isMultipleOf3 = inputNumber % 3 == 0;
        boolean isMultipleOf5 = inputNumber % 5 == 0;
        boolean isMultipleOf3and5 = inputNumber % 15 == 0;

        if(isMultipleOf3) {
            result = FIZZ;
        }
        if(isMultipleOf5) {
            result = BUZZ;
        }
        if(isMultipleOf3and5) {
            result = FIZZ_BUZZ;
        }

        return result;
    }
}
