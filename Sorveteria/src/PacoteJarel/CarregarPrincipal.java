
package PacoteJarel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CarregarPrincipal 
{
    public static void main(String[] args)
    {
        JFSplash splash = new JFSplash();
        JFLogin login = new JFLogin();
        splash.setVisible(true);        
        
        for (int i = 0; i <= 100; i++)
        {
            try {
                Thread.sleep(40);
                splash.lbl_load.setText("Carregando "+Integer.toString(i)+"%");
                splash.pgb_load.setValue(i);
                
                if(i==100)
                {
                    splash.dispose();
                    login.setVisible(true);
                }
            } 
            catch (Exception e)
            {
                
            }
        }
        
    }
    
}
