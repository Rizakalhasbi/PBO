/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author ACER
 */
public class Platinum extends Gold {
    int bonus;
    
    Platinum() {
        rentCost = 45000;
        point = 10;
        disc = 3;
        cashback = 10000;
    }
    
    protected int getBonus(int rentalDuration) {
        
        bonus = rentalDuration * 5000;
        return bonus;
    }
}