import java.util.Scanner;

public class Kondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaBakso = 15000;
        int hargaMieAyam = 12000;
        int hargaRujak = 10000;

        System.out.println("---- MENU MAKANAN ----");
        System.out.println("1. Bakso     - Rp " + hargaBakso);
        System.out.println("2. Mie Ayam  - Rp " + hargaMieAyam);
        System.out.println("3. Rujak     - Rp " + hargaRujak);

        System.out.print("Silakan pilih menu (1-3): ");
        int pilihan = input.nextInt();

        String namaMenu = "";
        long harga = 0;

        if (pilihan == 1) {
            namaMenu = "Bakso";
            harga = hargaBakso;
        } else if (pilihan == 2) {
            namaMenu = "Mie Ayam";
            harga = hargaMieAyam;
        } else if (pilihan == 3) {
            namaMenu = "Rujak";
            harga = hargaRujak;
        } else {
            System.out.println("Pilihan tidak valid!");
            System.exit(0);
        }

        System.out.print("Masukkan jumlah porsi: ");
        int porsi = input.nextInt();

        long total = harga * porsi;

        System.out.println("\n---- PESANAN ANDA ----");
        System.out.println("Menu dipesan  : " + namaMenu);
        System.out.println("Harga         : Rp " + harga);
        System.out.println("Porsi         : " + porsi);
        System.out.println("Total         : Rp " + total);

        input.close();
    }
}
