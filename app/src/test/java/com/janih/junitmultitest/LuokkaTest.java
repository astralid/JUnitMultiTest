package com.janih.junitmultitest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * A test case for Luokka, with multiple test values.
 * A new instance of Luokka is used for each iteration through the supplied test value pairs.
 */
@RunWith(Parameterized.class)
public class LuokkaTest {

    Luokka luokka = new Luokka(0);
    float input;
    int expected;

    /**
     * Specifies the test values for a single iteration
     * @param input value to call the testable method with
     * @param expected value expected to be returned
     */
    public LuokkaTest(float input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    /**
     * A public static method annotated with @Parameters
     * @return a Collection of Objects (as Array) as test data set
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2.5f, 2},
                {2, 2},
                {3.9f, 3}
        });
    }

    @Test
    public void testMetodi() throws Exception {
        int result = luokka.metodi(input);
        assertEquals(expected, result);
    }
}