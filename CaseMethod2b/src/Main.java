import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        buyerDLL buyerQueue = new buyerDLL();
        orderDLL orderList = new orderDLL();   

        int menu;

        do {
            System.out.println("\n===========================================");
            System.out.println("\tROYAL DELISH QUEUE SYSTEM");
            System.out.println("===========================================\n");
            System.out.println("1. Add Buyer to Queue");
            System.out.println("2. Print Buyer Queue");
            System.out.println("3. Remove Buyer from Queue and Add Order");
            System.out.println("4. Order Report");
            System.out.println("5. Process Buyer by Queue Number");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Buyer's name: ");
                    String name = sc.nextLine();
                    System.out.print("Buyer's mobile number: ");
                    String mobileNumber = sc.nextLine();
                    buyer newBuyer = new buyer(name, mobileNumber);
                    buyerQueue.addBuyer(newBuyer);
                    break;

                case 2:
                    buyerQueue.printQueue();
                    break;

                case 3:
                    buyerNode removedBuyerNode = buyerQueue.removeFirst();
                    
                    if (removedBuyerNode != null) {
                        System.out.print("Order code: ");
                        int orderCode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Order name: ");
                        String orderName = sc.nextLine();
                        System.out.print("Order price: ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        order newOrder = new order(orderCode, orderName, price);
                        orderList.addOrder(removedBuyerNode.buyer, newOrder);
                    }
                    break;

                case 4:
                    orderList.sortOrder();
                    orderList.printOrders();
                    break;

                case 5:
                    System.out.print("Enter the queue number to process:");
                    int queueNumber = sc.nextInt();
                    sc.nextLine();
                    buyerNode selectedBuyer = buyerQueue.proccessBuyer(queueNumber);

                    if (selectedBuyer != null) {
                        System.out.print("Order code: ");
                        int orderCode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Order name: ");
                        String orderName = sc.nextLine();
                        System.out.print("Order price: ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        order newOrder = new order(orderCode, orderName, price);
                        orderList.addOrder(selectedBuyer.buyer, newOrder);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (menu != 0);
    }
   
}
