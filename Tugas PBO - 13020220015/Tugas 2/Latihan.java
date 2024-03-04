import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();

        System.out.print("Masukkan Fakultas: ");
        String fakultas = scanner.nextLine();

        System.out.println("\nData yang dimasukkan:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);

        scanner.close();
    }
}