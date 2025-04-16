package org.example;

public class IncreasingLetterTriangle implements Pattern{
    @Override
    public void printPattern(int n) {
        char ascii = 'A';
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ascii + j));
            }
            System.out.println();

        }
    }
}
