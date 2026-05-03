package assignment;

import java.util.Scanner;

public class ExcuseLetterDemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExcuseLetterStack05 stack = new ExcuseLetterStack05(5);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Class: ");
                    String className = input.nextLine();
                    System.out.print("Type (S/I): ");
                    char type = input.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = input.nextInt();

                    ExcuseLetter05 letter = new ExcuseLetter05(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.println("Excuse letter submitted!");
                    break;

                case 2:
                    ExcuseLetter05 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from " + processed.name);
                    }
                    break;

                case 3:
                    ExcuseLetter05 topLetter = stack.peek();
                    if (topLetter != null) {
                        System.out.println("Latest letter:");
                        System.out.println(topLetter.name + " - " + topLetter.className);
                    }
                    break;

                case 4:
                    System.out.print("Input name to search: ");
                    String searchName = input.nextLine();
                    stack.search(searchName);
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select menu 1-4.");
                    break;
            }

        } while (choice != 0);
    }
}