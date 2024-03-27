package pertemuan2.modul3.nilai;
import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        System.out.print("Masukkan Nilai : ");
        hitung.inputNilai(nilai);
        System.out.print("Daftar Nilai : ");
        hitung.cetakNilai(nilai);
        System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
        
        System.out.println("Pilih Opsi:");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilai(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilai(nilai);
                break;
            case 2:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilaiBaru(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
