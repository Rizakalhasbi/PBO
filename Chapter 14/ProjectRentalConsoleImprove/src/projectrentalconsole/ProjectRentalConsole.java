/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ProjectRentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dataMember data = new dataMember();
        premium p = new premium();
        gold g = new gold();
        data.data();

        
        String x = data.id;
        p.dataAnggota(x, data.setnama(), 
                data.setJenisMmber(), 
                data.setTglPinjam(), 
                data.setBlnPinjam(), 
                data.getThnPinjam(), 
                data.setTglKembali(), 
                data.setBlnPinjam(), 
                data.getThnKembali(), 
                data.setLamaHari(), 
                data.getTotalSewa(), 
                data.getJmlPoin());
        g.cashback(x);
        p.pulsa(x);
  
    }
    
}