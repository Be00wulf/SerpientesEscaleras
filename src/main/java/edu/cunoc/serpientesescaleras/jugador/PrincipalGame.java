package edu.cunoc.serpientesescaleras.jugador;

import java.awt.Color;
import java.util.Random;
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
        
        //casillas normales
        Casilla[] c1;
        c1 = new Casilla[(int)espacios + 1];
        
        //casilla simple
        for (int i = 1; i<=(int)espacios;i++){
            c1[i] = new Casilla();
            c1[i].setClaseCasilla("NORMAL");
        }
        
        //CASILLA DE PIERDE TURNO
        Random aleatorio = new Random();
        for (int i = 1; i <=5 ;i++){
            int varAleatoria = aleatorio.nextInt((int)(espacios))+1;
            while(true){
                if (varAleatoria == 1 || varAleatoria == (int)espacios){                                                                //REVISAR
                    varAleatoria = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }
                break;//se sale del ciclo
            }
            c1[varAleatoria].setClaseCasilla("PERDER TURNO");
       }
        
       //casillas de cambiar el tablero 
        
        
        
        
        
        
        
        
        
        
    }
}
