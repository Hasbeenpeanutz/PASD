package Jobsheet5;

public class Power {
    int baseNumber, exponent;

    // Constructor
    public Power(int baseNumber, int exponent) {
        this.baseNumber = baseNumber;
        this.exponent = exponent;
    }

    // Brute Force (NO PARAMETER)
    public int powerBF() {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= baseNumber;
        }

        return result;
    }

    // Divide and Conquer (NO PARAMETER)
    public int powerDC() {
        return powerDCRecursive(exponent);
    }

    // Helper Recursive Method
    private int powerDCRecursive(int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            int half = powerDCRecursive(exp / 2);
            return half * half;
        } else {
            return baseNumber * powerDCRecursive(exp - 1);
        }
    }
}
