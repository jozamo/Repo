/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdbasanonimas;

/**
 *
 * @author José Zambrano
 */
public class LamdbasAnonimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread h1 = new Thread(new Hilo1());
        Thread hilo = new Thread( 
                () -> System.err.println("HOla desde el hilo otra vez") 
          
       );
    
       h1.start();
       hilo.start();
       
    }
}
    
    class Hilo1 extends Thread{
        @Override
        public void run(){
            
            System.out.println("Hola, hilo1");
        }
        
       
        
    }
    

