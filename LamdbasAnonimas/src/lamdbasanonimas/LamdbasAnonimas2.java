package lamdbasanonimas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Zambrano
 */
public class LamdbasAnonimas2 {
    
    @FunctionalInterface
    interface Suma{
        public Integer sumarDosNumeros(Integer a, Integer b);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        Suma suma = (a,b) -> a+b;
        
        System.out.println("Suma: " + suma.sumarDosNumeros(10, 5));
    }
    
}
