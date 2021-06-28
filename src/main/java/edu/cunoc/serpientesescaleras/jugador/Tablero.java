package edu.cunoc.serpientesescaleras.jugador;

import edu.cunoc.serpientesescaleras.jugador.Casilla;
import edu.cunoc.serpientesescaleras.jugador.Jugad0r;
import javax.swing.JPanel;

public class Tablero extends JPanel{
    //clases
    protected Casilla[] casilla;
    protected Jugad0r[] jugador;
    protected int cantJugadores;
    protected int cantCasillas;
    protected int dado1, dado2, sumaDados;                                          //saltor
    protected int jugadorActual = 1;
    
    //tabler0
    protected int dimensionXtablero = 2000 ;
    protected int dimensionYtablero = 1200; 
    protected int dimensionCasillaX, dimensionCasillaY;
    protected int posX, posY; 
    protected int casillaActual = 1;
    protected int filas, columnas;
}
