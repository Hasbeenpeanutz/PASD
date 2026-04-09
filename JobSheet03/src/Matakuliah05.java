
public class Matakuliah05 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah05(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void addData(String name, int sks) {
        this.nama = name;
        this.sks = sks;
    }

    void printInfo() {
        System.out.println("Course: " + nama);
        System.out.println("SKS: " + sks);
    }
}
