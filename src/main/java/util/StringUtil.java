package util;

public class StringUtil {
    public static void main(String[] args) {
    }
    public static String repeat(String str, int times){
        String result = "";

        if (times < 0){
            throw new IllegalArgumentException("negative times not allowed");
        }

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

    public static boolean isEmpty(String str){
        if (str == null){
            return true;
        }
        return str.isBlank();
    }
}
