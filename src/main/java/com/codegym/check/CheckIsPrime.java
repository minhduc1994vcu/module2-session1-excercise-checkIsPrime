package com.codegym.check;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number which you wanna check: ");
        int number = scanner.nextInt();
        boolean IsPrime = true;
        if (number < 2) {
            IsPrime = false;
        } else {
            int i = 2;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    IsPrime = false;
                }
                i++;
            }
        }
        if (IsPrime) {
            System.out.println(number + " is a prime");

        } else {
            System.out.println(number + " is not a prime");
        }

    }
}
