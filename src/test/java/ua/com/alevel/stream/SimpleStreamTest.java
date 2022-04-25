package ua.com.alevel.stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStreamTest {

    @Test
    void deleteTest() {
        SimpleStream simpleStream = new SimpleStream();
        simpleStream.add();
        int length = simpleStream.list.toArray().length;
        simpleStream.delete(5);
        Assertions.assertThat(149).isEqualTo(length-1);
    }
}
