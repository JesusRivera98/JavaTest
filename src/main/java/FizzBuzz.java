public class FizzBuzz {

    public static String fizzBuzz(int n) {
        if (n % 3 == 0){
            if (n % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (n % 5 == 0){
            return "Buzz";
        }
        return ""+n;

    }
}
