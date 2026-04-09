package Jobsheet5;
import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Profit month " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        Sum s = new Sum(arr);

        System.out.println("Total BF: " + s.totalBF());
        System.out.println("Total DC: " + s.totalDC(0, n-1));
    }
}