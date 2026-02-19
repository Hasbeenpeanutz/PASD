package jobsheet2.practicum;

public class LecturerMain05 {
    public static void main(String[] args) {
        Lecturer05 lec1 = new Lecturer05();
        lec1.idLecturer = "L001";
        lec1.name = "Dr. Andi";
        lec1.activeStatus = true;
        lec1.yearOfEntry = 2015;
        lec1.expertiseCompetency = "Artificial Intelligence";

        lec1.displayInformation();
        lec1.setActiveStatus(false);
        System.out.println("Working period: " + lec1.calculateTimeWork(2025) + " years");
        lec1.changeSkill("Data Science");
        lec1.displayInformation();

        Lecturer05 lec2 = new Lecturer05("L002", "Dr. Budi", true, 2018, "Cyber Security");

        lec2.displayInformation();
        System.out.println("Working period: " + lec2.calculateTimeWork(2025) + " years");
        lec2.changeSkill("Network Security");
        lec2.displayInformation();
    }
}
