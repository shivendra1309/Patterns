package org.example;

public class BinaryTriangle implements Pattern{
    @Override
    public void printPattern(int n) {
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                System.out.print(j%2);
            System.out.println();
        }

    }
}
