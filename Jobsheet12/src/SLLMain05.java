import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SingleLinkedList05 sll = new SingleLinkedList05();

        System.out.print("Input NIM : ");
        String nim = sc.nextLine();

        System.out.print("Input Name : ");
        String name = sc.nextLine();

        System.out.print("Input Class : ");
        String cls = sc.nextLine();

        System.out.print("Input GPA : ");
        double gpa = sc.nextDouble();

        Student05 std = new Student05(nim, name, cls, gpa);

        sll.addFirst(std);

        sll.print();
    }
}