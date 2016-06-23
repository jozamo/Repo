/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionordensuperior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 *
 * @author José Zambrano
 */
public class FuncionOrdenSuperior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5,-5,2,-2,7,-7,0,12,-4,32,-64,128);
        BiFunction< 
                List<Integer>,
                Predicate<Integer>,
                List<Integer>
                > filtrar;
        filtrar = (list,predicado)->{
            List<Integer> resultado = new ArrayList<>();
            for(Integer i:list)
                if(predicado.test(i))
                    resultado.add(i);
            return resultado;        
        };
        System.out.println("numeros Positivos" + filtrar.apply(numeros, x-> x >= 0));
    }
    
}
