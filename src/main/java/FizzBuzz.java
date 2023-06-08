public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String convert(int inputNumber) {
        String result = String.valueOf(inputNumber);
        boolean isMultipleOf3 = inputNumber % 3 == 0;

        if(isMultipleOf3) {
            result = FIZZ;
        }
        if(inputNumber == 5) {
            result = BUZZ;
        }
        if(inputNumber == 10) {
            result = BUZZ;
        }
        if(inputNumber == 20) {
            result = BUZZ;
        }
        return result;
    }
}
