package util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

    /*
    All years divisible by 400 are leap years (1600, 2000, 2400)
    All years divisible by 100 but NOT by 400 are NOT leaps (1700, 1800, 1900)
    All years divisible by 4 are leaps (1996, 2004, 2012)
    All the years that are NOT divisible by 4 are NOT leaps (2017, 2018, 2019)
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));
    }
}