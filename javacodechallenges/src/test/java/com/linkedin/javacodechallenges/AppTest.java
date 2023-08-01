package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isEven_True() {
        assertTrue(App.isEven(0));
        assertTrue(App.isEven(2));
        assertTrue(App.isEven(4));
        assertTrue(App.isEven(6));
        assertTrue(App.isEven(8));
        assertTrue(App.isEven(-20));
        assertTrue(App.isEven(100));
        assertTrue(App.isEven(-46));
    }

    @Test
    public void isEven_False() {
        assertFalse(App.isEven(1));
        assertFalse(App.isEven(3));
        assertFalse(App.isEven(5));
        assertFalse(App.isEven(7));
        assertFalse(App.isEven(9));
        assertFalse(App.isEven(-11));
        assertFalse(App.isEven(93));
        assertFalse(App.isEven(-75));
    }

    @Test
    public void isPasswordComplex_True() {
        assertTrue(App.isPasswordComplex("abC123"));
        assertTrue(App.isPasswordComplex("CBs123"));
    }

    @Test
    public void isPasswordComplex_False() {
        assertFalse(App.isPasswordComplex("abc123"));
        assertFalse(App.isPasswordComplex("sss123"));
        assertFalse(App.isPasswordComplex("123454"));
    }

    @Test
    public void calculateWaterBill() {
        assertEquals(22.74, App.calculateWaterBill(1800), 0);
    }
}
