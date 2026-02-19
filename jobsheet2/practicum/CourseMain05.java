package jobsheet2.practicum;


public class CourseMain05 {
    public static void main(String[] args) {

        Course05 course1 = new Course05();
        course1.kodeCourse = "IF101";
        course1.name = "Basic Programming";
        course1.credits = 3;
        course1.numberOfHours = 4;

        course1.displayInformation();
        course1.changecredits(4);
        course1.addHours(2);
        course1.reduceHours(3);
        course1.displayInformation();

        Course05 course2 = new Course05("IF202", "Data Structure", 3, 5);

        course2.displayInformation();
        course2.changecredits(2);
        course2.addHours(1);
        course2.reduceHours(10);
        course2.displayInformation();
    }
}
