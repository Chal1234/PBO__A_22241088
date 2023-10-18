    package com.Tutorial;
class Polos {
    String dataString;
    int dataInteger;

}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String NIM;
    String Prodi;
    // membuat konstruktor tanpa parameter
//     Mahasiswa(){
// System.out.println("ini adalah konstruktor");

//     }
    // membuat konstruktor dengan parameter
    Mahasiswa(String inputnama,String inputNIM,String inputProdi) {
        nama = inputnama;
        NIM = inputNIM;
        Prodi = inputProdi;

System.out.println("nama :" + nama);
System.out.println("NIM :" + NIM);
System.out.println("Prodi :" + Prodi);

    }
    
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Pertama Saya");
        // instansiansi objek dari class polos
        // Polos pls = new Polos ();

        // // isi ciri pada objek pls
        // pls.dataString = "POLOS";
        // pls.dataInteger = 10;

        // // cetak data
        // System.out.println("isi data String" + pls.dataString);
        // System.out.println("isi data Integer" + pls.dataInteger);

        Mahasiswa mhs1 = new Mahasiswa("ChalTzy", "22241088", "PTI");
        

        //memanggil konstruktor
        
    }
}
