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
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        
        insertMember();
        
        String idMember;
        int dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in);
    
        System.out.println("PROJECT RENTAL CONSOLE GAME");
        
        System.out.print("\nMasukkan ID Member                 : ");
        idMember = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam (1 - 31)   : ");
        dateRent = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)     : ");
        monthRent = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam (xxxx)       : ");
        yearRent = input.nextInt();
        
        System.out.print("\nMasukkan Tanggal Kembali (1 - 31)  : ");
        dateReturn = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)    : ");
        monthReturn = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali (xxxx)      : ");
        yearReturn = input.nextInt();
        
        searchMember(idMember);
        
        System.out.println("\nTanggal Pinjam                     : " + dateRent + " - " + monthRent + " - " + yearRent);
        System.out.println("Tanggal Kembali                    : " + dateReturn + " - " + monthReturn + " - " + yearReturn);
        
        int rentalDuration = rentDuration(dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn);
        System.out.println("Lama Sewa                          : " + rentalDuration + " hari");

        String jenisMember = getJenisMember(idMember);
        if(null == jenisMember) {
            System.out.println("");
        } else switch (jenisMember) {
            case "Silver":
                System.out.println("\nTotal Sewa                         : Rp. " + s.costAmount(rentalDuration));
                System.out.println("Jumlah Poin                        : " + s.getPoint(rentalDuration));
                break;
            case "Gold":
                System.out.println("\nTotal Sewa                         : Rp. " + g.costAmount(rentalDuration));
                System.out.println("Jumlah Poin                        : " + g.getPoint(rentalDuration));
                System.out.println("Jumlah Cashback                    : Rp. " + g.cashback);
                break;
            case "Platinum":
                System.out.println("\nTotal Sewa                         : Rp. " + p.costAmount(rentalDuration));
                System.out.println("Jumlah Poin                        : " + p.getPoint(rentalDuration));
                System.out.println("Jumlah Cashback                    : Rp. " + p.cashback);
                System.out.println("Bonus Pulsa                        : Rp. " + p.getBonus(rentalDuration));
                break;
            default:
                System.out.println("");
                break;
        }
    }   
}