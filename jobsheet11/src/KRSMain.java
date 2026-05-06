import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue q = new KRSQueue(10);

        int choice;
        do {
            System.out.println("\n1.Enqueue");
            System.out.println("2.Process 2 Students");
            System.out.println("3.Show All");
            System.out.println("4.Show Front 2");
            System.out.println("5.Show Rear");
            System.out.println("6.Total Queue");
            System.out.println("7.Total Processed");
            System.out.println("0.Exit");
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

                    q.enqueue(new Student(nim, name, sp, cls));
                    break;

                case 2:
                    q.dequeue2();
                    break;

                case 3:
                    q.printAll();
                    break;

                case 4:
                    q.printFront2();
                    break;

                case 5:
                    q.printRear();
                    break;

                case 6:
                    System.out.println("Queue: " + q.size);
                    break;

                case 7:
                    System.out.println("Processed: " + q.processed);
                    break;
            }

        } while (choice != 0);
    }
}