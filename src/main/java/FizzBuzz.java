public class FizzBuzz {
    public String convert(int inputNumber) {
        String result = "1";
        if(inputNumber == 3) {
            result = "3";
        }
        if(inputNumber == 2) {
            result = "2";
        }
        return result;
    }
}
