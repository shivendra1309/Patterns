package org.example;

public class ReverseLetterTriangle implements Pattern{
    @Override
    public void printPattern(int n) {
        char ascii = 'A';
        for (int i = n-1; i >=0 ; i--) {
            for (int j = i; j >=0; j--){
                System.out.print((char)(ascii+i-j));
            }
            System.out.println();
        }
    }
}
