public class DataDosen05 {
    
    public void showAllLecturers(Dosen05[] arrayOfDosen05) {
        System.out.println("=== ALL LECTURERS DATA ===");
        for (Dosen05 lecturer : arrayOfDosen05) {
            System.out.println("Code          : " + lecturer.code);
            System.out.println("Name          : " + lecturer.name);
            System.out.println("Gender        : " + (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age           : " + lecturer.age);
            System.out.println("--------------------------");
        }
    }

    public void countLecturersByGender(Dosen05[] arrayOfDosen05) {
        int male = 0, female = 0;
        for (Dosen05 lecturer : arrayOfDosen05) {
            if (lecturer.gender) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("=== NUMBER OF LECTURERS BY GENDER ===");
        System.out.println("Male   : " + male);
        System.out.println("Female : " + female);
        System.out.println("-------------------------------------");
    }

    public void averageAgeByGender(Dosen05[] arrayOfDosen05) {
        int totalAgeMale = 0, totalAgeFemale = 0;
        int countMale = 0, countFemale = 0;
        
        for (Dosen05 lecturer : arrayOfDosen05) {
            if (lecturer.gender) {
                totalAgeMale += lecturer.age;
                countMale++;
            } else {
                totalAgeFemale += lecturer.age;
                countFemale++;
            }
        }
        
        System.out.println("=== AVERAGE AGE OF LECTURERS BY GENDER ===");
        if (countMale > 0) 
            System.out.println("Male   : " + ((double) totalAgeMale / countMale));
        if (countFemale > 0) 
            System.out.println("Female : " + ((double) totalAgeFemale / countFemale));
        System.out.println("------------------------------------------");
    }

    public void showOldestLecturer(Dosen05[] arrayOfDosen05) {
        if (arrayOfDosen05.length == 0) return;
        Dosen05 oldest = arrayOfDosen05[0];
        
        for (Dosen05 lecturer : arrayOfDosen05) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("=== OLDEST LECTURER ===");
        System.out.println("Code          : " + oldest.code);
        System.out.println("Name          : " + oldest.name);
        System.out.println("Gender        : " + (oldest.gender ? "Male" : "Female"));
        System.out.println("Age           : " + oldest.age);
        System.out.println("-----------------------");
    }

    public void showYoungestLecturer(Dosen05[] arrayOfDosen05) {
        if (arrayOfDosen05.length == 0) return;
        Dosen05 youngest = arrayOfDosen05[0];
        
        for (Dosen05 lecturer : arrayOfDosen05) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("=== YOUNGEST LECTURER ===");
        System.out.println("Code          : " + youngest.code);
        System.out.println("Name          : " + youngest.name);
        System.out.println("Gender        : " + (youngest.gender ? "Male" : "Female"));
        System.out.println("Age           : " + youngest.age);
        System.out.println("-------------------------");
    }
}