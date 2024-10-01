package TugasPertemuan5;

    import java.util.Scanner;

        public class PotonganPembelian {
            
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = input.nextDouble();

        // Menentukan potongan
        double potongan;
        if (totalPembelian >= 50000) {
            potongan = totalPembelian * 0.20;  // 20% potongan
        } else {
            potongan = totalPembelian * 0.05;  // 5% potongan
        }

        // Hitung jumlah yang harus dibayar
        double jumlahYangDibayar = totalPembelian - potongan;

        // Output hasil
        System.out.println("Total pembelian: Rp " + totalPembelian);
        System.out.println("Besarnya potongan: Rp " + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp " + jumlahYangDibayar);
    }
}
