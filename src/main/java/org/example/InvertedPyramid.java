package org.example;

public class InvertedPyramid implements Pattern {

    @Override
    public void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }



//    @Override
//    public void printPattern(int n) {
//        for (int i = n; i >= 1; i--) {
//            // Print leading spaces
//            System.out.print(" ".repeat(n - i));
//            // Print stars
//            System.out.print("*".repeat(2 * i - 1));
//            System.out.println();
//        }
//    }
}
