package jobsheet07;

import java.util.Scanner;

public class mainStudent05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        searchStudent05 data = new searchStudent05();
        int amountStudent = 5;

        System.out.println("---------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            System.out.print("Name\t:");
            String name = s1.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();

            students05 std = new students05(nim, name, age, gpa);
            data.add(std);
        }

        System.out.println("---------------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);

        data.showData(search, position);

        System.out.print("Search student by NIM: ");
        System.out.println("Using binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent - 1);
        data.showPosition(search, position1);
        data.showData(search, position1);

        data.sortData();
        System.out.println("\nBinary Search (Ascending) Result:");
        int pos2 = data.FindBinarySearch(search, 0, data.ListStd05.length - 1);
        data.showPosition(search, pos2);
        data.showData(search, pos2);

        
        data.sortDataDesc();
        System.out.println("\nBinary Search (Descending) Result:");
        int pos3 = data.findBinarySearchDesc(search, 0, data.ListStd05.length - 1);
        data.showPosition(search, pos3);
        data.showData(search, pos3);
    }
}
