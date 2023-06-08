public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String convert(int inputNumber) {
        String result = String.valueOf(inputNumber);
        boolean isMultipleOf3 = inputNumber % 3 == 0;

        if(isMultipleOf3) {
            result = FIZZ;
        }
        return result;
    }
}
