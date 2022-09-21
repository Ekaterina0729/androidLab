package com.example.lab11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void check_func_max() {
        assertEquals(9,MainActivity.Max(new int[]{7, 3, 5, 9}));
        assertEquals(900,MainActivity.Max(new int[]{900, -1998, 0, 12}));
        assertEquals(0,MainActivity.Max(new int[]{0, 0, 0, 0}));
        assertEquals(-29,MainActivity.Max(new int[]{-29901, -1998, -2901, -29}));
    }

    @Test
    public void check_func_min() {
        assertEquals(3,MainActivity.Min(new int[]{7, 3, 5, 9}));
        assertEquals(-1998,MainActivity.Min(new int[]{900, -1998, 0, 12}));
        assertEquals(0,MainActivity.Min(new int[]{0, 0, 0, 0}));
        assertEquals(-29901,MainActivity.Min(new int[]{-29901, -1998, -2901, -29}));
    }
}