class Student {
     String nim;
     String name;
     String studyProgram;
     String phoneNumber;

    public Student(String nim, String name, String studyProgram, String phoneNumber) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.phoneNumber = phoneNumber;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void printStudent() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + studyProgram + "| Phone Number: " + phoneNumber);
    }
}
