package org.example;

public class AlphaRamp implements Pattern{

    @Override
    public void printPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));

            }
            System.out.println();

        }
    }
}
