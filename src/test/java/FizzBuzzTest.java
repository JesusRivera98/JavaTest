import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void fizz_in_divisible_by_3() {
        assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");
    }

    @Test
    public void buzz_in_divisible_by_5() {
        assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");
    }

    @Test
    public void fizzBuzz_in_divisible_by_3_and_5() {
        assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void n_in_not_divisible_by_3_or_5() {
        assertEquals(FizzBuzz.fizzBuzz(7), "7");
    }
}