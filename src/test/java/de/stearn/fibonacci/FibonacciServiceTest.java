package de.stearn.fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


public class FibonacciServiceTest {

    private static FibonacciService fibonacciService;

    @BeforeAll
    static void setUp() {
        fibonacciService = new FibonacciService();
    }

    @Test
    protected void shouldCalculateFibonacciNumberForIndex4() {
        long index = 4;

        long fibunacciNumber = fibonacciService.getFibonacciNumberFor(index);

        assertThat(fibunacciNumber).isEqualTo(3);
    }

    @Test
    protected void shouldCalculateFibonacciNumberForIndex7() {
        long index = 7;

        long fibunacciNumber = fibonacciService.getFibonacciNumberFor(index);

        assertThat(fibunacciNumber).isEqualTo(13);
    }

    @Test
    protected void shouldCalculateFibonacciNumberForIndex42() {
        long index = 42;

        long fibunacciNumber = fibonacciService.getFibonacciNumberForRecursive(index);

        assertThat(fibunacciNumber).isEqualTo(267914296L);
    }

    @Test
    protected void shouldCalculateFibonacciNumberForIndex1() {
        long index = 1;

        long fibunacciNumber = fibonacciService.getFibonacciNumberFor(index);

        assertThat(fibunacciNumber).isEqualTo(1);
    }

    @Test()
    protected void shouldThrowIllegalArgumentExceptionForNegativeIndex() {
        long index = -1;

        assertThatIllegalArgumentException().isThrownBy(() -> fibonacciService.getFibonacciNumberFor(index))
                .withMessage("Index must be greater than 0");
    }
}
