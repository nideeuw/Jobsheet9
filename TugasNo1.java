import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0, rataNilai;
        int jmlMhs, tertinggi = 0, terendah = 100;
        
        // memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        jmlMhs = input.nextInt();
        
        int nilaiMhs[] = new int[jmlMhs];

        // memasukkan setiap nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        // menghitung nilai rata-rata
        rataNilai = total / nilaiMhs.length;
        System.out.println("\n Nilai rata-rata = " + rataNilai);

        // menampilkan nilai tertinggi dan nilai terendah
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("\n Nilai tertinggi = " + tertinggi);
        System.out.println("\n Nilai terendah = " + terendah);

        // menampilkan semua nilai yang telah dimasukkan
        System.out.println("\nNILAI SELURUH MAHASISWA");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i]);
        }
    }
}
