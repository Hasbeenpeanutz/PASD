import java.util.Scanner;

public class MainLecturer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData05 list = new LecturerData05();

        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest → Oldest)");
            System.out.println("4. Sort DSC (Oldest → Youngest)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Gender (true=Male, false=Female): ");
                    boolean gender = sc.nextBoolean();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 

                    Lecturer05 lec = new Lecturer05(id, name, gender, age);
                    list.add(lec);
                    System.out.println("Data added!");
                    break;

                case 2:
                    System.out.println("\nLecturer Data:");
                    list.print();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Sorted Ascending!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Sorted Descending!");
                    break;

                case 0:
                    System.out.println("Exit program.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}