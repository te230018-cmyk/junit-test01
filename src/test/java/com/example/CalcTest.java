package com.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest {

    private final Calc calc = new Calc();

    @Test
    void subの正常系テスト() {
        // 10 - 4 = 6 になることを検証
        int result = calc.sub(10, 4);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void divの正常系テスト() {
        // 10 / 2 = 5 になることを検証
        int result = calc.div(10, 2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void multの正常系テスト() {
        // 3 * 4 = 12 になることを検証
        int result = calc.mult(3, 4);
        assertThat(result).isEqualTo(12);
    }
}