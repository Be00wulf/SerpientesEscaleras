package edu.cunoc.serpientesescaleras.jugador;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class PrincipalGame {
    public static void main(String[] args) {
        Bienvenida b1 = new Bienvenida();
        //b1.ingresarDatos();
        
        Object espacios = b1.getEspacios();
        Object jugadores = b1.getJugadores();
        
        Jugad0r[] j1; 
        j1 = new Jugad0r[(int)jugadores+1];
        
        //pidiendo datos
        for(int i = 1; i<=(int)jugadores; i++){
            String nombre = JOptionPane.showInputDialog(null, "ʕ•́ᴥ•̀ʔっ NOMBRE DEL JUGADOR");
            
            //PANTALLA DE SELECCION DE COLOR
            Color colorFicha = JColorChooser.showDialog(null,"ʕ•́ᴥ•̀ʔっ SELECCIONA EL COLOR DE TU FICHA", Color.RED);
            
            j1[i] = new Jugad0r();
            j1[i].setNombreJugador(nombre);
            j1[i].setColorFicha(colorFicha); 
        }
        
        
    }
}
