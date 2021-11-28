/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author ACER
 */
public class HargaDegan {
    public int jumlahPasokan;
    public int hargaBeli;
    public int hargaAngkut;
    public int jarakAngkut;
    public int totalDegan;

    public void jumlahSuplai(){
        int jumlahSuplai = jumlahPasokan * hargaBeli;
        System.out.println("Jumlah Harga Degan yang Disuplai adalah:" + jumlahSuplai);
    }
    
    public void sewaAntar(){
        int sewaAntar = hargaAngkut * jarakAngkut;
        System.out.println("Jumlah Biaya Sewa yang Digunakan adalah:" + sewaAntar);  
    }
    
    public void totalKeluar(){
        int totalKeluar = 331900000;
        System.out.println("Total Biaya Yang Dikeluarkan Adalah:" + totalKeluar);
    }
    
     public void hargaDegan(){
        int hargaDegan;
        hargaDegan = 331900000/totalDegan;
        System.out.println("Harga Jual Degan yang Untung Adalah:" + hargaDegan);
    }
    
}
