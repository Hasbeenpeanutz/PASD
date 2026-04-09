package Jobsheet5;

import java.util.Scanner;

public class powerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Power[] p = new Power[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter base number: ");
            int base = sc.nextInt();

            System.out.print("Enter exponent: ");
            int exp = sc.nextInt();

            p[i] = new Power(base, exp);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Result BF: " + p[i].powerBF());
            System.out.println("Result DC: " + p[i].powerDC());
        }
    }
    
}
