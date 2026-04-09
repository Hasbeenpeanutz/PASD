package Jobsheet5;

public class assignmentMain {
    public static void main(String[] args) {

        Student[] s = {
            new Student("Ahmad", 78, 82),
            new Student("Budi", 85, 88),
            new Student("Cindy", 90, 87),
            new Student("Dian", 76, 79),
            new Student("Eko", 92, 95),
            new Student("Fajar", 88, 85),
            new Student("Gina", 80, 83),
            new Student("Hadi", 82, 84)
        };

        System.out.println("Max UTS: " + Assignment.maxUTS(s, 0, s.length-1));
        System.out.println("Min UTS: " + Assignment.minUTS(s, 0, s.length-1));
        System.out.println("Average UAS: " + Assignment.avgUAS(s));
    }
}
