/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorutama;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class KalkulatorUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        
        System.out.println("==== Aplikasi Kalkulator Bilangan ====");
        System.out.print("Masukkan Angka Ke-1 = ");
        double angka1=input.nextDouble();
        System.out.print("Masukkan Angka Ke-2 = ");
        double angka2=input.nextDouble();
        System.out.println("");
        
        kalkulator itung=new kalkulator();
        System.out.println("Hasil Pertambahan : "+itung.tambahBilangan(angka1, angka2));
        System.out.println("Hasil Pengurangan : "+itung.kurangBilangan(angka1, angka2));
        System.out.println("Hasil Perkalian   : "+itung.kaliBilangan(angka1, angka2));
        System.out.println("Hasil Pembagian   : "+itung.bagiBilangan(angka1, angka2));
        System.out.println("Hasil Sisa        : "+itung.sisaBilangan(angka1, angka2));
        
    }
    
}
