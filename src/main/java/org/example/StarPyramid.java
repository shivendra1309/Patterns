package org.example;

public class StarPyramid implements Pattern{
    @Override
    public void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            int count = 1;
            while(count<=2*(i)-1){
                System.out.print("*");
                count++;
            }
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //    @Override
//    public void printPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            // Print leading spaces
//            System.out.print(" ".repeat(n - i));
//            // Print stars
//            System.out.print("*".repeat(2 * i - 1));
//            System.out.println();
//        }
//    }
}
