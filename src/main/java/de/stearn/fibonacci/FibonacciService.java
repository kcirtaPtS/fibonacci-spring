package de.stearn.fibonacci;

public class FibonacciService {

    public long getFibonacciNumberFor(long index) {
        if (index <= 0) {
            throw new IllegalArgumentException("Index must be greater than 0");
        }
        if (index <= 2) {
            return 1;
        }

        long summandA = 1;
        long summandB = 1;
        long zwischenSumme;

        for(int i = 2; i < index; i++) {
            zwischenSumme = summandA + summandB;
            summandA = summandB;
            summandB = zwischenSumme;
        }

        return summandB;
    }

    public long getFibonacciNumberForRecursive(long index) {
        return recursive( index);

    }

    private long recursive(long index) {
        if (index < 2) {
            return index;
        }
        else {
            return recursive(index - 1) + recursive(index - 2);
        }
    }
}
