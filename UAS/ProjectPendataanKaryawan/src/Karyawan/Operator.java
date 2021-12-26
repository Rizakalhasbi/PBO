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
public class Operator {
  public void add (ArrayList<String> array){
        Scanner input = new Scanner (System.in);
        System.out.print("");
        System.out.print("Masukkan Kode Karyawan (XXX) : ");
        String KodeKrywn = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan Nama Karyawan : ");
        String NamaKrywn = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan Alamat : ");
        String AlamatKrywn = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan Usia : ");
        String UsiaKrywn = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan Golongan : ");
        String GolKrywn = input.nextLine();
        GolKrywn = GolKrywn.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan Status Menikah : ");
        String StatusNikah = input.nextLine();
        StatusNikah = StatusNikah.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan Jumlah Anak : ");
        String JumAnak = input.nextLine();
        
        array.add(KodeKrywn);
        array.add(NamaKrywn);
        array.add(AlamatKrywn);
        array.add(UsiaKrywn);
        array.add(GolKrywn);
        array.add(StatusNikah);
        array.add(JumAnak);
        
    }
    
    public void delete (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (!array.get(i).equals(kode)){
                System.out.println("Data karyawan tidak ada");
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
    
    public void find (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (array.get(i).equals(kode)){
                double bruto = 0;
                double netto = 0;        
                double tunnik = 0;
                double tunanak = 0;
                double tunpeg = 0;
                System.out.println("==============");
                System.out.println("DATA KARYAWAN");
                System.out.println("==============");
                System.out.println("Kode Karyawan : "+ array.get(i));
                System.out.println("Nama Karyawan : "+ array.get(i+1));
                System.out.println("Alamat Karyawan : "+ array.get(i+2));
                System.out.println("Usia Karyawan : "+ array.get(i+3));
                System.out.println("Golongan Karyawan : "+ array.get(i+4));
                System.out.print("Status Pernikahan Karyawan : ");
                if ("y".equals(array.get(i+5))){
                    System.out.println("Menikah");
                    System.out.print("");
                } else {
                    System.out.println("Belum Menikah");
                    System.out.print("");
                }
                if (null == array.get(i+4)){
                    System.out.println("Error");
                }
                else switch (array.get(i+4)) {
                    case "a":
                        System.out.println("GAJI : Rp5000000");
                        System.out.print("Tunjangan Pernikahan : ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp500000");
                            tunnik = 500000 ;
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp750000");
                                tunpeg = 750000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error");
                        }  System.out.print("Tunjangan Anak : ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (250000 * anak));
                                tunanak = 250000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("Error");
                        }  
                        
                        System.out.println("----------------------------------- +");
                        bruto = 5000000 + tunanak + tunnik +tunpeg;
                        System.out.println("Gaji Brutto : Rp"+ bruto);
                        System.out.println("Potongan : Rp" + (bruto * 0.025));
                        bruto = bruto - (bruto * 0.025);
                        System.out.println("----------------------------------- -");
                        System.out.println("Gaji Netto \t: "+ netto);
                        status = true;
                        break;
                  
                }
            }
        }
    }
}
    
    public void show(ArrayList<String> array) {
        boolean status = false;
        int j = array.size();
        System.out.println("=========================");
        System.out.println("DATA KARYAWAN");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("KODE \t NAMA \t ALAMAT \t USIA \t GOL \t STATUS \t JUMLAH ANAK");
        System.out.println("------------------------------------------------------------------------------------");
            }
        }