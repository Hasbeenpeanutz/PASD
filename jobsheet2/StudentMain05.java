package jobsheet2;

public class StudentMain05 {
    public static void main(String[] args) {
        Student05 mhs1 = new Student05();
        mhs1.name = "Calista Nathania A";
        mhs1.nim = "254107060106";
        mhs1.kelas = "SIB-1G";
        mhs1.gpa = 3.79;

        mhs1.printInformation();
        mhs1.changeClass("SIB-1H");
        mhs1.updateGPA(3.85);
        mhs1.printInformation();
        
        Student05 student2 = new Student05("Calista Nathania B", "254107060107", 3.85, "SIB-1H");
        student2.updateGPA(3.30);
        student2.printInformation();

        Student05 mhsCalista = new Student05("Calista", "254107060106", 3.8, "SIB-1G");
        System.out.println("Performance: " + mhsCalista.performanceValue());

    }
}
