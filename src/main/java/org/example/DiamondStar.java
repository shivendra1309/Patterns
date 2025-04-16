package org.example;

public class DiamondStar implements Pattern{
    @Override
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n-i-1));
            System.out.print("*".repeat(2*i+1));
            System.out.print(" ".repeat(n-i-1));
            System.out.println();

        }

        for(int i = n-1; i>=0; i--){
            System.out.print(" ".repeat(n-1-i));
            System.out.print("*".repeat(2*i+1));
            System.out.print(" ".repeat(n-i-1));
            System.out.println();
        }

    }
}
