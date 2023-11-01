package com.Tutorial;
class Mahasiswa {
    // Data member 
    String nama; 
    String nim; 
    String prodi;
    
    // construktor dengan parameter
    Mahasiswa (String inputNama,String inputNIM,String inputProdi){
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;
    }

    // Method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Prodi : " + this.prodi);
    }
    // Method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    } // Method dengan return tanpa parameter 
    String getNama(){
        return this.nama;
    }

    // method dengan returm dan parmeter
    String sayHi(String pesan){
        return pesan + "aku adalah" + this.nama;

    }
}
public class Main {
    public static void main(String[] args) {
         // instansiasi objek
         Mahasiswa mhs1 = new Mahasiswa("Chal", "22241088", "PTI");
         
        mhs1.show();
        mhs1.setNama("Ucul");
        mhs1.show();
        System.out.println(mhs1.getNama());
        String pesan  = mhs1.sayHi ("Hallo");
        System.out.println(pesan);


}
    }
