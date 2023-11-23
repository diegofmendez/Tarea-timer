
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
                System.out.println("Cambio efectuado m" + flag);            
                if (flag == 1){                 
                    min += 1;
                    Timer.setmin(min);
                    System.out.println("Incremento min....");
                    flag = 0;
                    if (min == 59){
                        Horas.flagh=1;
                        min =0;
                        
                    }
                }                
            }  
            /**
            while (flag ==1){
                System.out.println(flag);
                min += 1;
                Timer.setmin(min);
                flag = 0;
            }
            **/
        }
}
