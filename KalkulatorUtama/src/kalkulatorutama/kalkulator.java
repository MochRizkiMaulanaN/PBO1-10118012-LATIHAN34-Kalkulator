/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorutama;

/**
 *
 * @author LENOVO
 */
public class kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan(double value1,double value2){
       
        return value1 + value2;
    }
    public double kurangBilangan(double value1,double value2){
        
        return value1 - value2;
    }
    public double kaliBilangan(double value1,double value2){
        
        return value1*value2;
    }
    public double bagiBilangan(double value1,double value2){
        
        return value1/value2;
    }
    public double sisaBilangan(double value1,double value2){
        
        return value1 % value2;
    }
}
