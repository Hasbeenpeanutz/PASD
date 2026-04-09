package Quiz1_CalistaNathaniaArdijatmono_SIB1G;

public class accessoriesData05 {
    public void display(accessories05[] arrayOfAccessories05) {
        System.out.println("=== ALL ACCESSORIES DATA ===");
        for (accessories05 acc : arrayOfAccessories05) {
            System.out.println("Name            : " + acc.name);
            System.out.println("Category        : " + acc.category);
            System.out.println("Price           : " + acc.price);
            System.out.println("Sold            : " + acc.sold);
            System.out.println("Stock           : " + acc.stock);
            System.out.println("--------------------------");
        }
    }

    // int calculateTotalSales(){

    // }

    void checkStock (accessories05[] arrayOfAccessories05){
    }

    void searchCheapestAccessories (accessories05[] arrayOfAccessories05){
        if (arrayOfAccessories05.length == 0) return;
        accessories05 cheapest = arrayOfAccessories05[0];
        
        for (accessories05 acc : arrayOfAccessories05) {
            if (acc.price < cheapest.price) {
                cheapest = acc;
            }
        }
            System.out.println("=== CHEAPEST ACCESSOIRES ===");
            System.out.println("Name            : " + cheapest.name);
            System.out.println("Category        : " + cheapest.category);
            System.out.println("Price           : " + cheapest.price);
            System.out.println("Sold            : " + cheapest.sold);
            System.out.println("Stock           : " + cheapest.stock);
            System.out.println("--------------------------");
        System.out.println("-------------------------");
    }


}

