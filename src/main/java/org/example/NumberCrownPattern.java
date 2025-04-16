package org.example;

public class NumberCrownPattern implements Pattern {
    @Override
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.print(" ".repeat(2 * (n - i - 1)));
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }

            System.out.println();
        }

    }
}
