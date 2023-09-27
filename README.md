# Tugas_Pemilihan
import java.util.Scanner;

public class PemilihanPercobaan125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        String result = (angka % 2 == 0) ? " adalah bilangan genap" : " adalah bilangan ganjil";
        System.out.println("Angka " + angka + result);
    }
}

