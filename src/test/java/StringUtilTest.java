import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hello", StringUtil.repeat("hello", 1));
    }
    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("hellohellohello", StringUtil.repeat("hello", 3));Assert.assertEquals("hello", StringUtil.repeat("hello", 1));
    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hello", 0));
    }
    @Test(expected =  IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hello", -1);
    }
}