package com.ydmins.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void add() {
        // given
        int x = 2;
        int y = 3;

        // when
        int result = Methods.add(x, y);

        // then
        assertEquals(5, result);
    }
}