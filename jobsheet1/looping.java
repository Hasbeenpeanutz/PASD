package jobsheet1;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = input.nextInt();

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            // even multiple 3
            if (i % 3 == 0) {
                System.out.print("#");
            }

            //even
            else if (i % 2 == 0) {
                System.out.print(i);
            }
             
            //odd
            else {
                System.out.print("*");
            }
        }
    }
}
