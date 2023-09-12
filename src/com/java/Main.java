package com.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.java.Utils.printBonusDatesBetween;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromYear = 0, toYear = 0;
        try {
            System.out.println("Enter start year:");
            fromYear = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter end year:");
            toYear = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid integers for start and end years.");
        }

        if (fromYear > toYear) {
            System.err.println("Invalid input. Start year can't be bigger than end year.");
        }

        String bonusDates = printBonusDatesBetween(fromYear, toYear);

        System.out.println(bonusDates);
    }
}