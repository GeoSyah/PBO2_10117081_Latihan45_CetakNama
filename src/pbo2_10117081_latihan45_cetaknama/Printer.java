/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan45_cetaknama;

/**
 *
 * @author Geo Syah Alkautsar
 */
class Printer {
    private int jumlahCetak;
    private String nama;

    public int getJumlahCetak() {
        return jumlahCetak;
    }

    public void setJumlahCetak(int jumlahCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
      System.out.println("nama anda :");
        System.out.println(nama);
    }

    public void cetak(int jmlCetak, String nama) {
      System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i+". "+nama);
        }
    }    
}
