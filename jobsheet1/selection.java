package jobsheet1;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        String letter, kualification, desc;
        double numberE;

        Scanner input = new Scanner(System.in);

        System.out.println("Final Grade Calculation Program");
        System.out.println("===============================");

        System.out.print("Input assignment scores: ");
        double assignment = input.nextDouble();

        System.out.print("Input quiz scores: ");
        double quiz = input.nextDouble();

        System.out.print("Input UTS scores: ");
        double uts = input.nextDouble();

        System.out.print("Input UAS scores: ");
        double uas = input.nextDouble();

        double finalScore = (0.2 * assignment) + (0.2 * quiz) + (0.3 * uts) + (0.3 * uas);

        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Invalid value");

        } else {
            if (finalScore > 80 && finalScore <= 100) {
                letter = "A";
                numberE= 4;
                kualification= "Excelent";
                desc= "Pass";

            } else if (finalScore > 73 && finalScore <= 80) {
                letter = "B+";
                numberE= 3.5;
                kualification= "More than good";
                desc= "Pass";

            } else if (finalScore > 65 && finalScore <= 73) {
                letter = "B";
                numberE= 3;
                kualification= "Good";
                desc= "Pass";

            } else if (finalScore > 60 && finalScore <= 65) {
                letter = "C";
                numberE= 2.5;
                kualification= "More than enough";
                desc= "Pass";

            } 
            else if (finalScore > 50 && finalScore <= 60) {
                letter = "C+";
                numberE= 2;
                kualification= "Enough";
                desc= "Pass";

            }else if (finalScore > 39 && finalScore <= 50) {
                letter = "D";
                numberE= 1;
                kualification= "Not Enough";
                desc= "Not Pass";

            }else {
                letter = "E";
                numberE= 0;
                kualification= "Failed";
                desc= "Not Pass";
            }

            
            System.out.println("================================");
            System.out.println("Final Score: " + finalScore);
            System.out.println("Letter Grade: " + letter);
            System.out.println("===============================");
            System.out.println(desc);
        }
    }
}
