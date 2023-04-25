package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private Sum sum = new Sum();

    @Test // 1й тестовый сценарий
    void simpleTest(){
        assertEquals(5, sum.add(2,3));
    }

    @Test // 2й тестовый сценарий
    void testBigInt() {
        int expected = Integer.MAX_VALUE + Integer.MAX_VALUE;
        assertEquals(expected, sum.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test // 3й тестовый сценарий
    void textException() {
        String str = "string";
        Integer integer = Integer.getInteger(str); // integer = null
        assertThrows(NullPointerException.class, () -> sum.add(0, integer));
    }



}