

public class studentdemo05 {
    public static void main(String[] args) {
        Student05[] arrayOfStudent05 = new Student05[3];
        
        arrayOfStudent05[0] = new Student05();
        arrayOfStudent05[0].nim = "244107060033";
        arrayOfStudent05[0].nama = "AGNES TITANIA KINANTI";
        arrayOfStudent05[0].kelas = "SIB-1E";
        arrayOfStudent05[0].ipk = (float) 3.75;
        
        arrayOfStudent05[1] = new Student05();
        arrayOfStudent05[1].nim = "2341720172";
        arrayOfStudent05[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfStudent05[1].kelas = "TI-2A";
        arrayOfStudent05[1].ipk = (float) 3.36;
        
        arrayOfStudent05[2] = new Student05();
        arrayOfStudent05[2].nim = "244107023006";
        arrayOfStudent05[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfStudent05[2].kelas = "TI-2E";
        arrayOfStudent05[2].ipk = (float) 3.80;
        
        System.out.println("NIM   : " + arrayOfStudent05[0].nim);
        System.out.println("Nama  : " + arrayOfStudent05[0].nama);
        System.out.println("Kelas : " + arrayOfStudent05[0].kelas);
        System.out.println("IPK   : " + arrayOfStudent05[0].ipk);
        System.out.println("------------------------------------");
        
        System.out.println("NIM   : " + arrayOfStudent05[1].nim);
        System.out.println("Nama  : " + arrayOfStudent05[1].nama);
        System.out.println("Kelas : " + arrayOfStudent05[1].kelas);
        System.out.println("IPK   : " + arrayOfStudent05[1].ipk);
        System.out.println("------------------------------------");
        
        System.out.println("NIM   : " + arrayOfStudent05[2].nim);
        System.out.println("Nama  : " + arrayOfStudent05[2].nama);
        System.out.println("Kelas : " + arrayOfStudent05[2].kelas);
        System.out.println("IPK   : " + arrayOfStudent05[2].ipk);
        System.out.println("------------------------------------");
    }   
}
