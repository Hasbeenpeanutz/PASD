import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(5);
        int choice;

        do {
            System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. View Rear");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String sp = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();

                    Student s = new Student(nim, name, sp, cls);
                    queue.enqueue(s);
                    break;

                case 2:
                    Student out = queue.dequeue();
                    if (out != null) {
                        System.out.println("Served:");
                        out.print();
                    }
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.print();
                    break;

                case 5:
                    System.out.println("Queue size: " + queue.size);
                    break;

                case 6:
                    queue.viewRear();
                    break;
            }

        } while (choice != 0);
    }
}