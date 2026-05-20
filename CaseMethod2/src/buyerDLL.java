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
        } else{
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

    buyerNode removeFirst(){
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

}
