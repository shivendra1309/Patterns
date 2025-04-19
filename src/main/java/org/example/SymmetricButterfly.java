package org.example;

public class SymmetricButterfly implements Pattern {
    @Override
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {

            System.out.print("*".repeat(i + 1));
            System.out.print(" ".repeat(2 * (n - i - 1)));
            System.out.print("*".repeat(i + 1));
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {

            System.out.print("*".repeat(i + 1));
            System.out.print(" ".repeat(2 * (n - i - 1)));
            System.out.print("*".repeat(i + 1));
            System.out.println();
        }
    }
}
