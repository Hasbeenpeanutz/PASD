package Jobsheet5;

public class Factorial {
    int n;

    // Constructor
    public Factorial(int n) {
        this.n = n;
    }

    // Brute Force While
    public int factorialBF() {
        int result = 1;
        int i = 1;

        while (i <= n) {
            result = result * i;
            i++;
        }

        return result;
    }

    // Divide and Conquer (Recursive)
    public int factorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialDC(n - 1);
        }
    }
}
