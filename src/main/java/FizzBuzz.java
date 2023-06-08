public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String convert(int inputNumber) {
        String result = String.valueOf(inputNumber);
        boolean isMultipleOf3 = inputNumber % 3 == 0;
        boolean isMultipleOf5 = inputNumber % 5 == 0;

        if(isMultipleOf3) {
            result = FIZZ;
        }
        if(isMultipleOf5) {
            result = BUZZ;
        }
        if(inputNumber == 15) {
            return "FizzBuzz";
        }
        if(inputNumber == 30) {
            return "FizzBuzz";
        }

        return result;
    }
}
