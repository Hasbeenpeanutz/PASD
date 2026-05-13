package assignment;

public class StudentQueue {
    String nim, name, className;
    double gpa;

    public StudentQueue() {
    }

    public StudentQueue(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}
