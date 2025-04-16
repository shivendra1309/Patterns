package org.example;

public class AlphaTriangle implements Pattern{
    @Override
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + n-i+j-1));
            }
            System.out.println();

        }
    }
}
