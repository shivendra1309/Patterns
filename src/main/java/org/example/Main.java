package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed in pattern");
        int n = scanner.nextInt();
        System.out.println("n = " + n);
        Pattern p = new SymmetricVoid();
        p.printPattern(n);
    }
}