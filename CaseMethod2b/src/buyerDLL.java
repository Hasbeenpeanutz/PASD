
public class buyerDLL {

    buyerNode head, tail;
    int size, autoNumber = 1;

    buyerDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addBuyer(buyer buyer) {
        buyerNode newNode = new buyerNode(autoNumber, buyer);
        autoNumber++;

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Queue successfully added with queue number " + newNode.queueNumber);
        size++;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        } else {
            buyerNode current = head;
            System.out.println("===========================================");
            System.out.println("              Buyer Queue List              ");
            System.out.println("===========================================\n");
            System.out.println("Queue \t Name \t\t Phone Number");

            while (current != null) {
                System.out.println(current.queueNumber + "\t " + current.buyer.name + "\t\t  " + current.buyer.mobileNumber);
                current = current.next;
            }

        }

    }

    buyerNode removeFirst() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return null;
        }

        buyerNode temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return temp;
    }

    //Additional method
    // int totalBuyers() {
    //     return size;
    // }
//     void removeBuyer(int queueNumber) {

//         if (isEmpty()) {
//             System.out.println("The queue is empty.");
//             return;
//         }

//         buyerNode current = head;

//         while (current != null) {
//             if (current.queueNumber == queueNumber) {

//                 if (current == head) {
//                     removeFirst();

//                 } else if (current == tail) {
//                     tail = tail.prev;
//                     if (tail != null) {
//                         tail.next = null;

//                     } else {
//                         head = null;

//                     }
//                     size--;

//                 } else {
//                     current.prev.next = current.next;
//                     current.next.prev = current.prev;

//                     size--;

//                 }
//                 System.out.println("Buyer with queue number " + queueNumber + " has been removed from the queue.");

//                 return;
//             }
//             current = current.next;
//         }

//         System.out.println("Buyer with queue number " + queueNumber + " not found in the queue.");
//     }

    buyerNode proccessBuyer(int queueNumber) {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return null;
        }

        buyerNode current = head;

        while (current != null) {

            if (current.queueNumber == queueNumber) {

                // jika hanya ada 1 node
                if (head == tail) {
                    head = tail = null;
                } // jika node pertama
                else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } // jika node terakhir
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } // jika node di tengah
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                return current;
            }

            current = current.next;
        }

        System.out.println("Queue number not found.");
        return null;
    }
}
