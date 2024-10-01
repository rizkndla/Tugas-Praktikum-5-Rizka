package TugasPertemuan5;

    import java.util.Scanner;

        public class NilaiMahasiswa {
            
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Menentukan grade
        String grade;
        String keterangan;
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        // Output hasil
        System.out.println("\nOutput:");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
