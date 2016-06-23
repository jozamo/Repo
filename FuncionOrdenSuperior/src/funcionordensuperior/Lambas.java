/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionordensuperior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
/**
 *
 * @author José Zambrano
 */
public class Lambas {
    
     private static boolean esPar(Integer n){
        return n % 2 == 0;
    }
    public static void main(String[] args){
        
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Encontrar números pares y guardarlos en un array
        List<Integer> numPares = new ArrayList<>();
         /*
         //funcional, declarativo. Que quiero hacer?
         numPares = numeros.stream()
         .filter(Lambas::esPar)
         .collect(Collectors.toList());
         //funcional con lambdas
         numPares = numeros.stream()
         .filter( n -> n  % 2 == 0)
         .collect(Collectors.toList());
         //imperativa tradicional como lo voy a hacer?
         for(int i=0; i<numeros.size(); i++)
         if( numeros.get(i)%2 == 0 )
         numPares.add(numeros.get(i));
          */
         numeros.stream().filter((i) -> (i % 2 == 0)).forEach((i) -> {
             numPares.add(i);
         });
                
        System.out.println(numPares);
    }
    
    
    
}
