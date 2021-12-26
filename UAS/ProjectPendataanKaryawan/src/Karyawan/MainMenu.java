/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainMenu {
    public static void main(String[] args) {
        ArrayList<String> karyawan = new ArrayList<>();
        Scanner scn = new Scanner (System.in);
        Operator option = new Operator();
        boolean status = false;
        while (status == false){
            System.out.println("====== Menu Utama ====== ");
            System.out.println("1 : Tambah Data Karyawan");
            System.out.println("2 : Hapus Data Karyawan");
            System.out.println("3 : Cari Data Karyawan");
            System.out.println("4 : Lihat Data Karyawan");
            System.out.println("5 : Keluar");
            System.out.println("");
            System.out.print("Masukkan Opsi yang Anda Pilih : ");
            int menu = scn.nextInt();
            System.out.print("");
            
            switch (menu) {
                case 1:
                    option.add(karyawan);
                    break;
                case 2:
                    System.out.print("Masukkan Kode Karyawan yang akan Dihapus : ");
                    String kodekrywn = scn.next();
                    option.delete(karyawan, kodekrywn);
                    break;
                case 3:
                    System.out.print("Masukkan Kode karyawan yang akan Dicari : ");
                    String kodekrywn2 = scn.next();
                    option.find(karyawan, kodekrywn2);
                    break;
                case 4:
                    option.show(karyawan);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
