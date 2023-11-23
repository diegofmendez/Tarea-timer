
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class segundos extends Thread{

        @Override
        public void run(){
            for (int i = 0; i < 60; i++) {
                //Hace que el numero aumente en la vista
                Timer.setsec(i);
                try {
                    segundos.sleep(5);
                    
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
