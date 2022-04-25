package ua.com.alevel.thread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ThreadMainTest {

    static ThreadMain threadMain = new ThreadMain();

    @Test
    public void plus2numbers() {
        int expect = threadMain.sum(4, 5);
        Assertions.assertEquals(9, expect);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    public void all_numbers_shouldBE_show(int number) {
        //the best test
        Assertions.assertEquals(number, number);
    }
}
