package jobsheet2;

public class Student05 {

    public Student05() {
    }
    
    String nim;
    String name;
    String kelas;
    double gpa;

    void printInformation() {
        System.out.println("Name  : " + name);
        System.out.println("NIM   : " + nim);
        System.out.println("gpa   : " + gpa);
        System.out.println("Class : " + kelas);
    }

    void changeClass(String newClass) {
        kelas = newClass;
    }

    void updateGPA(double newGPA) {
    if (newGPA >= 0.0 && newGPA <= 4.0) {
        gpa = newGPA;
    } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
    }
}


    String performanceValue() {
        if (gpa >= 3.5) {
            return "Excellent performance";
        } else if (gpa >= 3.0) {
            return "Good performance";
        } else if (gpa >= 2.5) {
            return "Sufficient performance";
        } else {
            return "Insufficient performance";
        }
    }
    
    public Student05(String nm, String nim, double gpa, String kls) {
        name = nm;
        this.nim = nim;
        this.gpa = gpa;
        kelas = kls;
    }

}
