public class Lecturer05 {
    String id, name;
    boolean gender;
    int age;

    public Lecturer05(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println(id + " " + name + " " + gender + " " + age);
    }
}
