import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hello", 3);
        System.out.println(result);
        if (!result.equals("hellohellohello")){
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("hello", 1);
        System.out.println(result2);
        if (!result2.equals("hello")){
            System.out.println("ERROR");
        }
    }
}