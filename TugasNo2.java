import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan anda: ");
        int jmlPesan = input.nextInt();
        input.nextLine();
        
        String[] namaPesanan = new String[jmlPesan];
        double[] hargaPesanan = new double[jmlPesan];
        double totalBiaya = 0;

        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("\nMasukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); // membersihkan input buffer

            // Menambahkan harga ke total biaya
            totalBiaya += hargaPesanan[i];
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\nDAFTAR PESANAN:");
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("\nTotal biaya dari semua pesanan: Rp " + totalBiaya);

    }
}
