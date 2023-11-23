
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Horas extends Thread{
    
        static int flagh;
        
        
        public Horas (int flagh){
            this.flagh = flagh;          
        }
       
        @Override
        public void run(){
            int hrs = 0;
            while (true){                
                System.out.println("Cambio efectuado h " + flagh);            
                if (flagh == 1){                 
                    hrs += 1;
                    Timer.sethrs(hrs);
                    System.out.println("Incremento horas....");
                    //flag = 1;
                    
                }                
            }           
        }
}
