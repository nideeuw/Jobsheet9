import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlPesan;
        String menu [] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makanan = input.nextLine();

        boolean avail = false;

        for (int i = 0; i < menu.length; i++) {
            if (makanan.equalsIgnoreCase(menu[i])) {
                avail = true;
                break;
            }
        }

        if (avail) {
            System.out.println("Makanan " + makanan + " tersedia di menu");
        } else {
            System.out.println("Makanan " + makanan + " tidak tersedia di menu");
        }
    }
}
