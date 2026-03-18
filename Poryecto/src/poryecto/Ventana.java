
package poryecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author julia
 */
public class Ventana extends JFrame {
    
    private JPanel panelNOR;
     private JPanel panelEST;
     private JPanel panelOES;
     private JPanel panelSUR;
    private JButton btns[];
    private JLabel totalP;
    private int total=0;
       private final String nombres[] = {
        "MODELO 1", "MODELO 2", " MODELO 3",
        "MODELO 4"};
       
        public Ventana(){
        super("Proyecto 2");
        setLayout(new BorderLayout(5,5));
        
        initNOR();
        initEST();
        initOES();
      
    }

    private void initNOR() {
         panelNOR = new JPanel(new BorderLayout());
        panelNOR.setBorder(BorderFactory.createTitledBorder("SUDADERAS"));
        panelNOR.add(new JLabel("TIENDA DE SUDADERAS",
                SwingConstants.CENTER), BorderLayout.CENTER);
        add(panelNOR, BorderLayout.NORTH);
    }

    private void initEST() {
       
        panelEST = new JPanel();
        panelEST.setLayout(new BoxLayout(panelEST, BoxLayout.Y_AXIS));
        panelEST.setBorder(BorderFactory.createTitledBorder("RESUMEN DE CARRITO"));
        
        totalP = new JLabel("TOTAL A PAGAR: $" + total);
        totalP.setAlignmentX(Component.CENTER_ALIGNMENT); 
        totalP.setFont(new Font("Segoe UI", Font.BOLD, 25));
        totalP.setForeground(new Color(255, 105, 180)); 
    
    panelEST.add(totalP);
        String [] opciones ={"PAGAR TOTAL","LIMPIAR CARRITO"};
        for(String op:opciones){
            JButton btn = new JButton (op);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (op.equals("LIMPIAR CARRITO")) {
                    total = 0; 
                    totalP.setText("TOTAL A PAGAR: $0");
                    }
                }
            });
            panelEST.add(btn);
      
        panelEST.add(Box.createVerticalStrut(25));
        add(panelEST, BorderLayout.CENTER);
        }
       
    }

    private void initOES() {
 panelOES = new JPanel (new GridLayout(3,3,4,4));
        panelOES.setBorder(BorderFactory.createTitledBorder("PRODUCTOS"));
        
       btns = new JButton[nombres.length];   
        for (int i = 0; i < nombres.length; i++) {
        btns[i] = new JButton(nombres[i]); 
        panelOES.add(btns[i]);           
        }
        add(panelOES, BorderLayout.WEST);
    }
   
}

   


