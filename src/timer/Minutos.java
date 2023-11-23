
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Minutos extends Thread{
    
        static int flag;
        
        public Minutos (int flag){
            this.flag = flag;          
        }
       
        @Override
        public void run(){
            int min = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flag);            
                if (flag == 1){                 
                    min += 1;
                    Timer.setmin(min);
                    System.out.println("Incremento min....");
                    //flag = 0;
                    
                }                
            }           
        }
}
