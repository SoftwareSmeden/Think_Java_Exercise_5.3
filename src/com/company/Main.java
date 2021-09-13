package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 5.3

        // Import Statement.
        Scanner userInput = new Scanner(System.in);

        System.out.println("Insert a value for n: ");

        // Variables.
        int a = 2;
        int b = 3;
        int c = 5;
        int n = userInput.nextInt();

        if (n > 2 && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println(" No, doesn't work.");
        }

    }

}
