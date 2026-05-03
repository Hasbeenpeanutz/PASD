import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = {
                new Student("22001", "Andi", "Informatics Engineering", "0811"), //0
                new Student("22002", "Budi", "Informatics Engineering", "0812"), //1
                new Student("22003", "Image", "Business Information Systems", "0813") //2
        };

        Book[] books = {
                new Book("B001", "Algorithm", 2020, "A"), //0
                new Book("B002", "Database", 2019, "B"), //1
                new Book("B003", "Programming", 2021, "C"), //2
                new Book("B004", "Physics", 2024, "D") //3
        };

        Loan[] loans = {
                new Loan(students[0], books[0], 7), //0
                new Loan(students[1], books[1], 3), //1
                new Loan(students[2], books[2], 10), //2
                new Loan(students[2], books[3], 6), //3
                new Loan(students[0], books[1], 4) //4
        };

        int input;
        do {
            printMenu();
            System.out.print("Select: ");
            input = sc.nextInt();
            System.out.println();

            switch (input) {
                case 1:
                    displayStudents(students);
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:
                    displayLoans(loans);
                    break;
                case 4:
                    sortLoansByFineDescending(loans);
                    System.out.println("After sorting (Largest fine):");
                    displayLoans(loans);
                    studentLoanExceed(loans);
                    
                    break;
                case 5:
                    System.out.print("Enter NIM: ");
                    String nim = sc.next();
                    searchLoanByNim(loans, nim);
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            System.out.println();
        } while (input != 0);

        sc.close();
    }

     static void printMenu() {
        System.out.println("=== JTI LIBRARY BORROWING SYSTEM ===");
        System.out.println("1. Display Students");
        System.out.println("2. Display Books");
        System.out.println("3. Display Borrowings");
        System.out.println("4. Sort by Fines");
        System.out.println("5. Search by Student ID");
        System.out.println("0. Exit");
    }

     static void displayStudents(Student[] students) {//case 1
        System.out.println("Student List:");
        for (Student student : students) {
            student.printStudent();
        }
    }

     static void displayBooks(Book[] books) { // case 2
        System.out.println("Book List:");
        for (Book book : books) {
            book.printBook();
        }
    }

     static void displayLoans(Loan[] loans) { // case 3
        System.out.println("Loan Data:");
        for (Loan loan : loans) {
            loan.printLoan();
        }
    }

     static void sortLoansByFineDescending(Loan[] loans) { //insertion sort
        for (int i = 1; i < loans.length; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].getFine() < temp.getFine()) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }

    static void studentLoanExceed(Loan[] loans){
        int count= 0;

        for (int i = 0; i<loans.length; i++) {
            if (loans[i].getLoanPeriod() >= 5) {
                count++;
        }
        System.out.println("Number of students exceed: " + count);
        }
    }

     static void searchLoanByNim(Loan[] loans, String nim) { //case 5
        Loan[] tempLoans = copyLoans(loans);
        sortLoansByNim(tempLoans);

        int index = binarySearchByNim(tempLoans, nim);
        if (index == -1) {
            System.out.println("Data not found.");
            return;
        }

        int left = index;
        while (left - 1 >= 0 && tempLoans[left - 1].getStudent().getNim().equals(nim)) {
            left--;
        }

        int right = index;
        while (right + 1 < tempLoans.length && tempLoans[right + 1].getStudent().getNim().equals(nim)) {
            right++;
        }

        for (int i = left; i <= right; i++) {
            tempLoans[i].printLoan();
        }
    }

     static Loan[] copyLoans(Loan[] loans) {
        Loan[] copy = new Loan[loans.length];
        for (int i = 0; i < loans.length; i++) {
            copy[i] = loans[i];
        }
        return copy;
    }

     static void sortLoansByNim(Loan[] loans) { //sorting case 5
        for (int i = 1; i < loans.length; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].getStudent().getNim().compareTo(temp.getStudent().getNim()) > 0) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }

     static int binarySearchByNim(Loan[] loans, String nim) {
        int left = 0;
        int right = loans.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midNim = loans[mid].getStudent().getNim();

            if (midNim.equals(nim)) {
                return mid;
            } else if (midNim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
