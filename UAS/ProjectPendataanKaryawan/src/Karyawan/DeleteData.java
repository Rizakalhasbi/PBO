/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;
import java.util.ArrayList;
import Karyawan.MainMenu;
/**
 *
 * @author ACER
 */
public class DeleteData {
    public void hapusData (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (!array.get(i).equals(kode)){
                System.out.println("Data Karyawan yang Anda Cari Tidak Tersedia!");
            } else {
                array.remove(i);
                array.remove(i + 1);
                array.remove(i + 2);
                array.remove(i + 3);
                array.remove(i + 4);
                array.remove(i + 5);
                status = true;
            }
        }
    }
    
}
