package org.example;

public class IncreasingNumberTriangle implements Pattern {
    @Override
    public void printPattern(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
