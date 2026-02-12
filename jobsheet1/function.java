package jobsheet1;

public class function {

    public static void main(String[] args) {

        int priceAglonema = 75000;
        int priceYam = 50000;
        int priceAlocasia = 60000;
        int priceRose = 10000;

        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        calculateIncome(stock, priceAglonema, priceYam, priceAlocasia, priceRose);
    }

    public static void calculateIncome(int[][] stock, int priceAglonema, int priceYam, int priceAlocasia, int priceRose) {

        for (int i = 0; i < stock.length; i++) {

            int income = 0;

            income = (stock[i][0] * priceAglonema)
                    + (stock[i][1] * priceYam)
                    + (stock[i][2] * priceAlocasia)
                    + (stock[i][3] * priceRose);

            System.out.println("RoyalGarden Branch " + (i + 1));
            System.out.println("Total Income: IDR " + income);

            if (income > 1500000) {
                System.out.println("Status: Very Good");
            } else {
                System.out.println("Status: Need Evaluation");
            }

            System.out.println("-----------------------------");
        }
    }
}
