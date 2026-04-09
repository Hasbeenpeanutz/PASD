package Quiz1_CalistaNathaniaArdijatmono_SIB1G;

import java.util.Scanner;

public class accessoriesMain {
    public static void main(String[] args) {
        // accessories05 acc1 = new accessories05();
        // accessories05 acc2 = new accessories05();
        
        // acc1.name = "necklace";
        // acc1.category = "a";
        // acc1.price = 5000;
        // acc1.sold = 2;
        // acc1.stock = 10;
        
        // acc2.name = "bracelet";
        // acc2.category = "a";
        // acc2.price = 5000;
        // acc2.sold = 2;
        // acc2.stock = 10;

        // accessories05 acc3 = new accessories05("earing", "c", 2500, 4, 15);

        Scanner sc = new Scanner(System.in);

        accessories05[] arrayOfAccessories05 = new accessories05[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Accessories Data #" + (i + 1));
            
            System.out.print("Accessories Name   : ");
            String name = sc.nextLine();
            
            System.out.print("Category   : ");
            String category = sc.nextLine();
            
            System.out.print("Price: ");
            int price = sc.nextInt();
            
            System.out.print("Sold    : ");
            int sold = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Stock    : ");
            int stock = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println("------------------------------------");

            arrayOfAccessories05[i] = new accessories05(name, category, price, sold, stock);

        }

        System.out.println("\n=== DISPLAYING ACCESSORIES DATA ===");
        for (accessories05 accessories : arrayOfAccessories05) {
            System.out.println("Name: " + accessories.name + "\nCategory: " + accessories.category + "\nPrice: " + accessories.price  + "\nItem Sold: " + accessories.sold + "\nItem Stock: " + accessories.stock);
        }
        System.out.println("------------------------------------");

        System.out.println("1. Display accessories data \n2. Calculate total sales \n3. Check stock \n4. Search the cheapest accessories");
        System.out.print("Pick a number: ");
        int ch = sc.nextInt();

        accessoriesData05 data = new accessoriesData05();

        switch (ch) {
            case 1:
                data.display(arrayOfAccessories05);

            case 2:
                
            case 3:
                data.checkStock(arrayOfAccessories05);

            case 4:
                data.searchCheapestAccessories(arrayOfAccessories05);
        
            default:
                break;
        }

        
    }
}
