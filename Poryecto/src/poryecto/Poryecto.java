
package poryecto;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author julia
 */
public class Poryecto {

 
    public static void main(String[] args) {
          SwingUtilities.invokeLater(()->{
            
            Ventana ventana = new Ventana();
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(700, 400);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setVisible(true);
            
    });
    }
    
}
