package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void fact_3_should_produce_6() {
        int a = 3;

        Sample s = new Sample();
        int result = s.fact(a);
        Assertions.assertThat(result).as("result of 3!")
            .isEqualTo(6);
    }

    @Test
    void add_10_and_10_should_produce_20() {
        int a = 10;
        int b = 10;

        Sample s = new Sample();
        int result = s.op(Sample.Operation.ADD, a,b);
        Assertions.assertThat(result).as("result of 10 + 10")
            .isEqualTo(20);
    }

    @Test
    void mult_10_times_10_should_produce_100() {
        int a = 10;
        int b = 10;

        Sample s = new Sample();
        int result = s.op(Sample.Operation.MULT, a,b);
        Assertions.assertThat(result).as("result of 10 * 10")
            .isEqualTo(100);
    }
}
