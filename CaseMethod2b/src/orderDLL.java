
public class orderDLL {

    orderNode head, tail;
    int size;

    public orderDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addOrder(buyer buyer, order order) {
        orderNode newNode = new orderNode(buyer, order);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Order successfully added for " + buyer.name);
        size++;
    }

    void sortOrder() {
        if (isEmpty()) {
            System.out.println("No orders to sort.");
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            orderNode current = head;

            while (current.next != null) {
                if (current.order.orderName.compareToIgnoreCase(current.next.order.orderName) > 0) {
                    // Swap orders
                    order tempOrder = current.order;
                    current.order = current.next.order;
                    current.next.order = tempOrder;

                    swapped = true;
                }
                current = current.next;
            }

        } while (swapped);

    }

    void printOrders() {
        if (isEmpty()) {
            System.out.println("No orders to display.");
            return;
        } else {
            int totalRevenue = 0;
            orderNode current = head;

            System.out.println("===========================================");
            System.out.println(" Current Orders Queue (Sort by Order Name) ");
            System.out.println("===========================================\n");
            System.out.println("Order Number \t  Order Name \t\t Price");

            while (current != null) {
                System.out.println(current.order.orderCode + "\t\t  " + current.order.orderName + "\t\t " + current.order.price);
                totalRevenue = totalRevenue + current.order.price;
                current = current.next;
            }

            System.out.println("--------------------------------------------- +");
            System.out.println("Total Revenue: \t\t\t\t " + totalRevenue);

        }

    }

    //Additional method

    // int totalOrder() {
    //     return size;
    // }

}
