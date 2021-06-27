package edu.cunoc.serpientesescaleras.principla;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bienvenida {
    //variables
    private Object jugadores;
    private Object espacios;
    
    //constructor

    public Bienvenida() {
        ImageIcon f1 = new ImageIcon(getClass().getResource("inicio.jpg"));
        JLabel bienv = new JLabel(f1);
        bienv.setSize(1000, 1000);
        bienv.setVisible(true);
        

        
    }
    
    
    
    
    
    
    
}
