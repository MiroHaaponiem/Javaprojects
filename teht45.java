/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 4
Jakson tehtävänumero: 4.5
Päiväys: 9.11.2020
*************************************/

import java.util.Timer; 
import java.util.TimerTask; 
  
class Helper extends TimerTask 
{ 
    public static int i = 0; 
    public void run() 
    { 
        System.out.println("Timer ran " + ++i); 
        if (i >= 10) {
            cancel();
            return;
        }
    } 
} 
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
          
        Timer timer = new Timer(); 
        TimerTask tasknew = new Helper(); 
          
        timer.schedule(tasknew, 1000, 1000); 
    } 
} 
