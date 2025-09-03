package com.tutorial;

class Mahasiswa {
    String nama;
    String jurusan;
    int umur;

    void perkenalan() {
        System.out.println("Hallo, nama saya " + this.nama + ", saya dari jurusan " + this.jurusan + ", umur saya " + this.umur + " tahun");
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Atha";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.umur = 18;
        mahasiswa1.perkenalan();
        
        System.out.println(mahasiswa1.nama);
    }
    
}
