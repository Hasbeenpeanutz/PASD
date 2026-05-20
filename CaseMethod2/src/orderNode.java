public class orderNode {
    buyer buyer;
    order order;

    orderNode prev;
    orderNode next;

    orderNode(buyer buyer, order order) {
        this.buyer = buyer;
        this.order = order;
        this.prev = null;
        this.next = null;
    }
}
