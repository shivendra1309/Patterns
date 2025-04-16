package org.example;


public class AlphaHill implements Pattern{
    @Override
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n-i-1));
            for (int j = 0; j <= i ; j++) {
                System.out.print((char)('A'+j) );

            }
            for (int j = i-1; j >= 0 ; j--) {
                System.out.print((char) ('A'+j));
            }
            System.out.println();

        }
    }
}
