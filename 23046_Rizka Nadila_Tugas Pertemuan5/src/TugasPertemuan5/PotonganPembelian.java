package TugasPertemuan5;

    import java.util.Scanner;

        public class PotonganPembelian {
            
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = input.nextDouble();

        double potongan;
        if (totalPembelian >= 50000) {
            potongan = totalPembelian * 0.20;  
        } else {
            potongan = totalPembelian * 0.05; 
        }

        double jumlahYangDibayar = totalPembelian - potongan;

        System.out.println("Total pembelian: Rp " + totalPembelian);
        System.out.println("Besarnya potongan: Rp " + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp " + jumlahYangDibayar);
    }
}
