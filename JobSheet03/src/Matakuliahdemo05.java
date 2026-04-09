
import java.util.Scanner;

public class Matakuliahdemo05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of courses: ");
        int n = sc.nextInt();

        Matakuliah05[] arrayOfMatakuliah05 = new Matakuliah05[n];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah05[i] = new Matakuliah05(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah05[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah05[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah05[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah05[i].jumlahJam);
            System.out.println("------------------------------------");
        }

        arrayOfMatakuliah05[0].addData("Data Structure", 3);

        arrayOfMatakuliah05[0].printInfo();
    }
}
