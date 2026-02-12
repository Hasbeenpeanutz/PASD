package jobsheet1;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalCourses = 8;

        String[] courseNames = {
            "Pancasila",
            "Information Technology Concepts",
            "Critical Thinking and Problem Solving",
            "Basic Mathematics",
            "English",
            "Programming Fundamentals",
            "Programming Fundamentals Practicum",
            "Occupational Safety and Health"
        };

        int[] credits = new int[totalCourses];
        double[] numericGrades = new double[totalCourses];
        double[] gradePoints = new double[totalCourses];
        String[] letterGrades = new String[totalCourses];

        double totalWeightedScore = 0;
        int totalCredits = 0;

        System.out.println("=== Semester GPA Calculation Program ===");

        for (int i = 0; i < totalCourses; i++) {

            System.out.println("\nCourse: " + courseNames[i]);

            System.out.print("Enter credit (SKS)        : ");
            credits[i] = input.nextInt();

            System.out.print("Enter numeric grade       : ");
            numericGrades[i] = input.nextDouble();

            if (numericGrades[i] >= 80) {
                letterGrades[i] = "A";
                gradePoints[i] = 4.0;
            } else if (numericGrades[i] >= 73) {
                letterGrades[i] = "B+";
                gradePoints[i] = 3.5;
            } else if (numericGrades[i] >= 65) {
                letterGrades[i] = "B";
                gradePoints[i] = 3.0;
            } else if (numericGrades[i] >= 60) {
                letterGrades[i] = "C+";
                gradePoints[i] = 2.5;
            } else if (numericGrades[i] >= 50) {
                letterGrades[i] = "C";
                gradePoints[i] = 2.0;
            } else if (numericGrades[i] >= 39) {
                letterGrades[i] = "D";
                gradePoints[i] = 1.0;
            } else {
                letterGrades[i] = "E";
                gradePoints[i] = 0.0;
            }

            totalWeightedScore += gradePoints[i] * credits[i];
            totalCredits += credits[i];
        }

        double gpa = totalWeightedScore / totalCredits;

        System.out.println("\n=== Grade Conversion Results ===\n");

        System.out.printf("%-40s %-7s %-15s %-15s %-10s\n",
                "Course Name", "Credit", "Numeric Grade", "Letter Grade", "Point");

        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < totalCourses; i++) {
            System.out.printf("%-40s %-7d %-15.2f %-15s %-10.2f\n",
                    courseNames[i],
                    credits[i],
                    numericGrades[i],
                    letterGrades[i],
                    gradePoints[i]);
        }

        System.out.println("\nTotal Credits : " + totalCredits);
        System.out.printf("Semester GPA  : %.2f\n", gpa);
    }
}
