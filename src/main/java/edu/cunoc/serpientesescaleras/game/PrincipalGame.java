package edu.cunoc.serpientesescaleras.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
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
        for (int i =1;i<=5;i++){
            int varAleatoria=aleatorio.nextInt((int)espacios)+1;
            while(true){   
                if(varAleatoria == 1|| varAleatoria == (int)espacios) {
                    varAleatoria = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }
                break;
            }
            c1[varAleatoria].setClaseCasilla("Cambia Tablero");
        }
     
        //escalera
        int variable_avanza;
        for (int k = 1;k<=5;k++){
            int variable_aleatoria2 = aleatorio.nextInt((int)(espacios))+1;
            
            do {
                    variable_avanza = aleatorio.nextInt(20)+1;
                    if (( variable_aleatoria2 + variable_avanza ) >= (int) espacios){
                        variable_aleatoria2 = aleatorio.nextInt((int)(espacios))+1;
                        continue;
                    }
                    
                    if (variable_aleatoria2 == 1){
                        variable_aleatoria2 = aleatorio.nextInt((int)(espacios))+1;
                        continue;
                    }
                    
                    if((variable_aleatoria2)==  (int)espacios){
                        variable_aleatoria2 = aleatorio.nextInt((int)espacios)+1;
                        continue;
                    }
                   
                    if (variable_avanza <= Math.sqrt((int)espacios)){
                        continue; 
                    }
                    break;
                    
            } while ( true ) ;
            c1[variable_aleatoria2].setClaseCasilla("ESCALERA");
            c1[variable_aleatoria2].setMovimientoEspecial(variable_avanza);
    
        } 
        
        //serpietne
        for (int l = 1;l<=5;l++){
            
            int variable_aleatoria3 = aleatorio.nextInt((int)(espacios))+1;
            do{
                variable_avanza = aleatorio.nextInt(20)+1;
                variable_avanza= -variable_avanza;
                if ((variable_avanza+variable_aleatoria3)<=1){
                    variable_aleatoria3 = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }    
                if (c1[variable_avanza+variable_aleatoria3].getClaseCasilla().equals("ESCALERA")){ 
                    variable_aleatoria3 = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }
                
                if (-variable_avanza <= Math.sqrt((int)espacios))
                    continue;
               
                if (variable_aleatoria3 == (int)espacios){
                    variable_aleatoria3 = aleatorio.nextInt((int)espacios)+1;
                    continue;
                }
                break;
            }
            while(true);
            
            c1[variable_aleatoria3].setClaseCasilla("SERPIENTE");
            c1[variable_aleatoria3].setMovimientoEspecial(variable_avanza);
        }
        
        //movimiento especial
        for (int m = 1;m<=5;m++){
            int variable_aleatoria4 = aleatorio.nextInt((int)(espacios))+1;
                       
            do{
                variable_avanza = aleatorio.nextInt(5)+1;

                if ((variable_avanza+variable_aleatoria4) > (int)(espacios)){
                    variable_aleatoria4 = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }
                
                 if (c1[variable_avanza+variable_aleatoria4].getClaseCasilla().equals("SERPIENTE")){
                     variable_aleatoria4 = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                }
                
                if (variable_aleatoria4==1){
                    variable_aleatoria4 = aleatorio.nextInt((int)(espacios))+1;
                    continue;
                } 
                break; 
                
            }while(true);
                c1[variable_aleatoria4].setClaseCasilla("Avanza");
                c1[variable_aleatoria4].setMovimientoEspecial(variable_avanza);
        }
        
        //grafica PENDIENTE
        {   
        JFrame frame = new JFrame();
        //dependiendo de la dificultad elegida por el usuario, dependera el tablero a instanciar
            //Tablero tablero1 = new Tablero((int)(espacios), jugador, casilla1, (int) numeroJugadores);
            Tablero tablero1 = new Tablero((int)espacios, j1, c1, (int) jugadores);
            frame.getContentPane().add(tablero1, BorderLayout.CENTER);
            
        Titulo titulo1 = new Titulo();    
        frame.setTitle("Tablero");
        frame.getContentPane().add(titulo1, BorderLayout.NORTH);
        frame.setSize( Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height); 
        //Evitar que se pueda cambiar el tamanio de la ventana
	frame.setResizable(false);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	//Mostrar la ventana
	frame.setVisible(true);
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
}
