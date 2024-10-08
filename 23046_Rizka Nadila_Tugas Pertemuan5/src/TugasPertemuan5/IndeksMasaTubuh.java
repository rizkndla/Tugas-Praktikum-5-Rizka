package TugasPertemuan5;

import java.util.Scanner;

    public class IndeksMasaTubuh {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();
        double imt = berat / (tinggi * tinggi);

        String kategori;
        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }

        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kategori: " + kategori);
    }
}
