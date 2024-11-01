import java.util.Scanner;

public class ArrayRataNilai17Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berapa jumlah elemen : ");
        int elemen = input.nextInt();

        int[] nilaiMhs = new int[elemen];
        double total = 0;
        double rata2;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai rata-rata = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus adalah " + lulus);
    }
}
