package Jobsheet5;

public class Sum {
    int[] arr;

    public Sum(int[] arr) {
        this.arr = arr;
    }

    // Brute Force
    public int totalBF() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    // Divide and Conquer
    public int totalDC(int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int lsum = totalDC(l, mid);
            int rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
    }
}
