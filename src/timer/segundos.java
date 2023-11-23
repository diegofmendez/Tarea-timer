
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class segundos extends Thread{

        @Override
        public void run(){
            for (int i = 0; i < 60; i++) {     
                Timer.setsec(i);
                try {
                    segundos.sleep(10);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (i==59){
                    
                    i = 0;
                    Minutos.flag = 1;
                }           
            }          
        }    
}
