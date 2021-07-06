import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void testRepeat() {
        Assert.assertEquals("hellohellohello", StringUtil.repeat("hello", 3));
        Assert.assertEquals("hello", StringUtil.repeat("hello", 1));
    }
}