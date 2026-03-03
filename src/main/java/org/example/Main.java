
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose + or - : ");
        String action = sc.next();

        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();

        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();

        if (action.equals("+")) {
            System.out.println("Sum: " + (a + b));
        }
        if (action.equals("-")) {
            System.out.println("Difference: " + (a - b));
        }
    }
}
