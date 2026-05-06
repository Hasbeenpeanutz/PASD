public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int processed;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        processed = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Student s) {
        if (isFull()) {
            System.out.println("Queue full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = s;
        size++;
    }

    void dequeue2() {
        if (size < 2) {
            System.out.println("Not enough students!");
            return;
        }

        for (int i = 0; i < 2; i++) {
            Student s = data[front];
            front = (front + 1) % max;
            size--;
            processed++;
            System.out.println("Processed:");
            s.print();
        }
    }

    void printAll() {
        if (isEmpty()) return;

        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void printFront2() {
        if (size >= 2) {
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    void printRear() {
        data[rear].print();
    }
}