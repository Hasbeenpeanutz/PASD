public class buyerNode {
    int queueNumber;
    buyer buyer;

    buyerNode prev;
    buyerNode next;

    buyerNode(int queueNumber, buyer buyer) {
        this.queueNumber = queueNumber;
        this.buyer = buyer;
        this.prev = null;
        this.next = null;
    }
}
