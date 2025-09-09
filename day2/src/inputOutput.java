

import java.util.Scanner;

public class inputOutput {

    public static void main(String[] args) {
     
        //deklarasi variabel
        String Nama;
        String Alamat;
        int Umur;

        //membuat scanner baru
        Scanner biodata = new Scanner(System.in);

        //tampilan output
        System.out.println("BIODATA SAYA");

        // menggunakan scanner dan menyimpan apa yang diketik di variabel
        System.out.println("Nama: ");
        Nama = biodata.nextLine();

         System.out.println("Alamat");
        Alamat = biodata.nextLine();

        System.out.println("Umur: ");
        Umur = biodata.nextInt(); 

       System.out.println("__________________________");

        //menampilkan data yang sudah di simpan di variabel
        System.out.println("Nama:   " + Nama);
        System.out.println("Umur:   " + Umur);
        System.out.println("Alamat: " + Alamat);


    }
}