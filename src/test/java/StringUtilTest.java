import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hello", 3);
        assertEquals(result, "hellohellohello");

        String result2 = StringUtil.repeat("hello", 1);
        assertEquals(result2, "hello");
    }

    private static void assertEquals(String current, String expected){
        if(!current.equals(expected)){
            throw new RuntimeException(current + " is not equal to " + expected);
        }
    }
}