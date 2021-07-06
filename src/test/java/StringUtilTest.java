import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("hello", 3), "hellohellohello");

        assertEquals(StringUtil.repeat("hello", 1), "hello");
    }

    private static void assertEquals(String current, String expected){
        if(!current.equals(expected)){
            throw new RuntimeException(current + " is not equal to " + expected);
        }
    }
}