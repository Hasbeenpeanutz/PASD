public class Student05 {
    String nim, name, className;
    double gpa;

    public Student05() {
    }

    public Student05(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}