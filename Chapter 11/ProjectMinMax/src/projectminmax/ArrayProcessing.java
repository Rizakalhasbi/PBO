/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectminmax;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ArrayProcessing {
int [] dataBilangan = new int[100];
    int n,a,j;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tentukan jumlah bilangan data : ");
        this.n = input.nextInt();
            for(a = 0; a < n; a++){
                System.out.println("Masukan bilangan ke - " + (a+1)+ " : ");
                this.dataBilangan[a] = input.nextInt();
            }
    }
    double hitungRerata(int[] dataArray){
        double sum = 0;
        for(a=0;a<this.n;a++){
            sum += dataArray[a];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for( a=0;a<this.n;a++){
            if (max<dataArray[a]){
                max = dataArray[a];
            }
        }
        return max;
    }
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for(a=0;a<this.n;a++){
            if (min>dataArray[a]){
                min = dataArray[a];
            }
        }
        return min;
    }
    void output(){
    System.out.println("Rata-Rata Nilai : " + this.hitungRerata(this.dataBilangan));
    System.out.println("Nilai Minimum : " + this.cariMin(this.dataBilangan));
    System.out.println("Nilai Maximum : " + this.cariMax(this.dataBilangan));

    }
}
