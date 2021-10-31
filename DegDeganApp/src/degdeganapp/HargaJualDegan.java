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
public class HargaJualDegan {
    public static void main (String[] args) {
        HargaDegan h1 = new HargaDegan();
        h1.jumlahPasokan = 5000;
        h1.hargaBeli = 8000;
        h1.hargaAngkut = 700000;
        h1.jarakAngkut = 6;
        h1.totalDegan = 29900;
        h1.jumlahSuplai();
        h1.sewaAntar();
        h1.hargaDegan();
        
        HargaDegan h2 = new HargaDegan();
        h2.jumlahPasokan = 7500;
        h2.hargaBeli = 8000;
        h2.hargaAngkut = 700000;
        h2.jarakAngkut = 21;
        h2.totalDegan = 29900;
        h2.jumlahSuplai();
        h2.sewaAntar();
        h2.hargaDegan();
        
        HargaDegan h3 = new HargaDegan();
        h3.jumlahPasokan = 8300;
        h3.hargaBeli = 8000;
        h3.hargaAngkut = 700000;
        h3.jarakAngkut = 24;
        h3.totalDegan = 29900;
        h3.jumlahSuplai();
        h3.sewaAntar();
        h3.hargaDegan();
        
        HargaDegan h4 = new HargaDegan();
        h4.jumlahPasokan = 9100;
        h4.hargaBeli = 8000;
        h4.hargaAngkut = 700000;
        h4.jarakAngkut = 60;
        h4.totalDegan = 29900;
        h4.jumlahSuplai();
        h4.sewaAntar();
        h4.hargaDegan();
    }
}
