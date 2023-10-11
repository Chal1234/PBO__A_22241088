package com.Tutorial;

class Mahasiswa {
    String nama ;
    String NIM;
    String Prodi;
}


public class Main {
    public static void main(String[] args) {
        // instansiasi pembuatan objek`
        Mahasiswa mhs1 = new Mahasiswa();
        // objek mhs1 diberi atribut
        mhs1.nama="ChalTzy";
        mhs1.NIM="22241088";
        mhs1.Prodi="Pendidikan Teknologi Informasi";

         System.out.println ("Nama Mahasiswa ;" +mhs1.nama);
         System.out.println("NIM;"+mhs1.NIM);
         System.out.println("Prodi"+mhs1.Prodi);
        
         Mahasiswa mhs2 = new Mahasiswa();
         
         mhs2.nama="Yuta";
         mhs2.NIM="22241010";
         mhs2.Prodi="Kimia";

         System.out.println("nama Mahasiswa;"+mhs2.nama);
         System.out.println("NIM;"+mhs2.NIM);
         System.out.println("Prodi;"+mhs2.Prodi);

    }
}


