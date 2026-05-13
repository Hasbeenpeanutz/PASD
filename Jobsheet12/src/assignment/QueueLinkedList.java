package assignment;

public class QueueLinkedList {
    NodeQueue front;
    NodeQueue rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared");
    }

    void enqueue(StudentQueue std) {
        NodeQueue newNode = new NodeQueue(std, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Called student:");
            front.data.print();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void printFront() {
        if (!isEmpty()) {
            System.out.println("Front Queue:");
            front.data.print();
        }
    }

    void printRear() {
        if (!isEmpty()) {
            System.out.println("Rear Queue:");
            rear.data.print();
        }
    }

    void printSize() {
        System.out.println("Total queue: " + size);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            NodeQueue temp = front;

            System.out.println("Queue Data:");
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }
}