import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_les_than_8_letter() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assesPassword("1234567"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assesPassword("abcdefgh"));
    }
    @Test
    public void medium_when_has_only_letters_and_numbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assesPassword("abcd1234"));
    }


}