package Jobsheet5;

import java.util.Scanner;

public class mainFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial f = new Factorial(num);

        System.out.println("Factorial (Brute Force): " + f.factorialBF());
        System.out.println("Factorial (Divide Conquer): " + f.factorialDC(num));
    }
}
