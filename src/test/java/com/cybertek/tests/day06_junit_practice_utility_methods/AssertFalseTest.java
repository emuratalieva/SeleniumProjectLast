package com.cybertek.tests.day06_junit_practice_utility_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertFalseTest {

    @Test
    public void testNum(){

        int num = 10;

        assertTrue(num>9);

        assertTrue(!(num<5));

        assertFalse(num<5);

    }

}


