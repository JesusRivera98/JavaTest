package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void str_is_null(){
        String str = null;
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void str_is_empty(){
        String str = "";
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void str_is_only_spaces(){
        String str = "  ";
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void str_is_text(){
        String str = "a";
        assertFalse(StringUtil.isEmpty(str));
    }

}