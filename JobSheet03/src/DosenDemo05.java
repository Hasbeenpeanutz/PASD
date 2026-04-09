import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of lecturers: ");
        int totalLecturers = sc.nextInt();
        sc.nextLine();

        Dosen05[] arrayOfLecturers = new Dosen05[totalLecturers];

        for (int i = 0; i < totalLecturers; i++) {
            System.out.println("Enter Lecturer Data #" + (i + 1));
            
            System.out.print("Code   : ");
            String code = sc.nextLine();
            
            System.out.print("Name   : ");
            String name = sc.nextLine();
            
            System.out.print("Gender (M/F): ");
            String genderInput = sc.nextLine();
            
            Boolean gender = genderInput.equalsIgnoreCase("M");
            
            System.out.print("Age    : ");
            int age = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println("------------------------------------");

            arrayOfLecturers[i] = new Dosen05(code, name, gender, age);
        }

        System.out.println("\n=== DISPLAYING LECTURER DATA (FOREACH) ===");
        for (Dosen05 lecturer : arrayOfLecturers) {
            System.out.println("Name: " + lecturer.name + " | Code: " + lecturer.code);
        }
        System.out.println("------------------------------------");

        System.out.println("\n=== STARTING LECTURER DATA ANALYSIS ===");
        DataDosen05 dataAnalysis = new DataDosen05();
        
        dataAnalysis.showAllLecturers(arrayOfLecturers);
        dataAnalysis.countLecturersByGender(arrayOfLecturers);
        dataAnalysis.averageAgeByGender(arrayOfLecturers);
        dataAnalysis.showOldestLecturer(arrayOfLecturers);
        dataAnalysis.showYoungestLecturer(arrayOfLecturers);
    }
}