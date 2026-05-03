import java.util.Scanner;

public class StudentDemo05 {
    public static void main(String[] args) {
        StudentAssignmentStack05 stack = new StudentAssignmentStack05(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    Student05 std = new Student05(nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", std.name);
                    break;
                case 2:
                    Student05 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                    }
                    break;
                case 3:
                    Student05 view = stack.peek();
                    if (view != null) {
                        System.out.println("The last assignment comes from " + view.name);
                    }
                    break;
                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("NIM\tName\tClass Name");
                    stack.print();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice >= 1 && choice <= 4);
        
        scan.close();
    }
}