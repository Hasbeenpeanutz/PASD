package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueLinkedList queue = new QueueLinkedList();

        int choose;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Queue");
            System.out.println("2. Call Queue");
            System.out.println("3. Show Front");
            System.out.println("4. Show Rear");
            System.out.println("5. Show Total Queue");
            System.out.println("6. Print Queue");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Input NIM : ");
                    String nim = sc.nextLine();

                    System.out.print("Input Name : ");
                    String name = sc.nextLine();

                    System.out.print("Input Class : ");
                    String cls = sc.nextLine();

                    System.out.print("Input GPA : ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();

                    StudentQueue std = new StudentQueue(nim, name, cls, gpa);

                    queue.enqueue(std);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printFront();
                    break;

                case 4:
                    queue.printRear();
                    break;

                case 5:
                    queue.printSize();
                    break;

                case 6:
                    queue.print();
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished");
                    break;

                default:
                    System.out.println("Wrong menu");
            }

        } while (choose != 0);
    }
}
