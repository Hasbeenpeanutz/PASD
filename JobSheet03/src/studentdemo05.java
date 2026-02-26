import java.util.Scanner;

public class studentdemo05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        Student05[] arrayOfStudent05 = new Student05[3];
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfStudent05[i] = new Student05(); 
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfStudent05[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfStudent05[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfStudent05[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfStudent05[i].ipk = Float.parseFloat(dummy); 
            System.out.println("------------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + arrayOfStudent05[i].nim);
            System.out.println("Nama  : " + arrayOfStudent05[i].nama);
            System.out.println("Kelas : " + arrayOfStudent05[i].kelas);
            System.out.println("IPK   : " + arrayOfStudent05[i].ipk);
            System.out.println("------------------------------------");
        }
    }   
}
