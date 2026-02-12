package jobsheet1;

import java.util.Scanner;

public class studentSchedule {
    public static void inputSchedule(String[][] schedule, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nInput data for schedule number " + (i + 1));

            System.out.print("Course Name      : ");
            schedule[i][0] = input.nextLine();

            System.out.print("Room             : ");
            schedule[i][1] = input.nextLine();

            System.out.print("Lecture Day      : ");
            schedule[i][2] = input.nextLine();

            System.out.print("Lecture Hours    : ");
            schedule[i][3] = input.nextLine();
        }
    }

    public static void displayAllSchedule(String[][] schedule, int n) {
        System.out.println("\n===== ALL LECTURE SCHEDULE =====");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s\n", 
                          "Course Name", "Room", "Day", "Hours");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-15s %-15s\n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }

        System.out.println("------------------------------------------------------------------");
    }

    public static void displayByDay(String[][] schedule, int n, Scanner input) {
        System.out.print("\nEnter day to search: ");
        String day = input.nextLine();

        boolean found = false;

        System.out.println("\nSchedule on " + day + ":");

        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.println("Course : " + schedule[i][0]);
                System.out.println("Room   : " + schedule[i][1]);
                System.out.println("Hours  : " + schedule[i][3]);
                System.out.println("-------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No schedule found on that day.");
        }
    }

    public static void displayByCourse(String[][] schedule, int n, Scanner input) {
        System.out.print("\nEnter course name to search: ");
        String course = input.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.println("\nCourse Found:");
                System.out.println("Room   : " + schedule[i][1]);
                System.out.println("Day    : " + schedule[i][2]);
                System.out.println("Hours  : " + schedule[i][3]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lecture schedules: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] schedule = new String[n][4];

        inputSchedule(schedule, n, input);
        displayAllSchedule(schedule, n);
        displayByDay(schedule, n, input);
        displayByCourse(schedule, n, input);
    }
}
