package org.example;

import java.time.LocalDateTime;

public class SymmetricVoid implements Pattern{
    @Override
    public void printPattern(int n) {
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i>0; i--){
//            String stars = "*".repeat(i);
//            String spaces = " ".repeat(2*(n-i));
//            System.out.println(stars + spaces + stars);
           stringBuilder.setLength(0);
            stringBuilder.append("*".repeat(i));
            stringBuilder.append(" ".repeat(2*(n-i)));
            stringBuilder.append("*".repeat(i));
            System.out.println(stringBuilder);
        }
        for (int i = 1; i <= n ; i++) {
//            String stars = "*".repeat(i);
//            String spaces = " ".repeat(2 *(n-i));
//            System.out.println(stars + spaces + stars);
            stringBuilder.setLength(0);
            stringBuilder.append("*".repeat(i));
            stringBuilder.append(" ".repeat(2*(n-i)));
            stringBuilder.append("*".repeat(i));
            System.out.println(stringBuilder);

        }
        System.out.println("time taken: "+(System.nanoTime() - startTime));
    }
//    @Override
//    public void printPattern(int n) {
//        for (int i = n; i > 0 ; i--) {
//            for (int j = i; j > 0 ; j--) {
//                System.out.print("*");
//            }
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//
//            }
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//
//            }
//
//            for (int j = i; j > 0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for (int i = 0; i < n ; i++) {
//            for (int j = i; j >= 0 ; j--) {
//                System.out.print("*");
//            }
//            for (int j = n-1; j > i; j--) {
//                System.out.print(" ");
//
//            }
//            for (int j = n-1; j > i; j--) {
//                System.out.print(" ");
//
//            }
//
//            for (int j = i; j >= 0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
}
