import java.util.Scanner;

public class PemilihanPercobaan225 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.println("Nilai UAS :");
        float UAS = input00.nextFloat();
        System.out.println("Nilai UTS :");
        float UTS = input00.nextFloat();
        System.out.println("Nilai kuis :");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas :");
        float tugas = input00.nextFloat();

        float total = (UAS*0.4F) + (UTS*0.3F) + (kuis*0.1F) + (tugas*0.2F);

        String nilai_huruf;
        String kualifikasi;
        String nilai_setara;
        
        if (total > 80 && total <= 100) {
            nilai_huruf = "A";
            kualifikasi = "Sangat baik";
            nilai_setara = "4";
        } else if (total > 73 && total <= 80) {
            nilai_huruf = "B+";
            kualifikasi = "Lebih dari baik";
            nilai_setara = "3.5";
        } else if (total > 65 && total <= 73) {
            nilai_huruf = "B";
            kualifikasi = "Baik";
            nilai_setara = "3";
        } else if (total > 60 && total <= 65) {
            nilai_huruf = "C+";
            kualifikasi = "Lebih dari cukup";
            nilai_setara = "2.5";
        } else if (total > 50 && total <= 60) {
            nilai_huruf = "C";
            kualifikasi = "Cukup";
            nilai_setara = "2";
        } else if (total > 39 && total <= 50) {
            nilai_huruf = "D";
            kualifikasi = "Kurang";
            nilai_setara = "1";
        } else {
            nilai_huruf = "E";
            kualifikasi = "Gagal";
            nilai_setara = "0";
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Nilai_huruf: " + nilai_huruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("Nilai_setara: " + nilai_setara);

    }
}