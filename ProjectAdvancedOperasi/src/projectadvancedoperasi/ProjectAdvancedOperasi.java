/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ACER
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi m = new Operasi();
        
        m.jumlahkan(3,4);
        m.jumlahkan(4, 7, (-9));
        m.jumlahkan(3.4, (-0.002), 0.12313);
    }
    
}
