package edu.cunoc.serpientesescaleras.jugador;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bienvenida {
    //variables
    private Object jugadores;
    private Object espacios;
    
    //constructor

    public Bienvenida() {
        
        //AQUI INICIAN LOS PROBLEMAS
        /*
        ImageIcon imagen = new ImageIcon(getClass().getResource("foto.jpg"));
        JLabel bienv = new JLabel(imagen);
        bienv.setSize(500, 500);
        bienv.setVisible(true);
        Object seleccion = JOptionPane.showInputDialog(null,"Elija un dificultad","Selector de dificultad",
        JOptionPane.QUESTION_MESSAGE,imagen,  // null para icono defecto
        new Object[] { "Nivel facil", "Nivel avanzado" },"Nivel avanzado");
        */
        //FIN DE LOS PROBLEMAS
        
        ingresarDatos();
    }
    
    //metodos
    public void ingresarDatos(){
    //dimensiones del tablero
    (this.espacios) = JOptionPane.showInputDialog(null, "Seleccione el numero de Casillas",   "" + "Casillas",   JOptionPane.QUESTION_MESSAGE,null, new Object[] {16,25,36,49},64);
    
    //cantidad de jugadores
     jugadores = JOptionPane.showInputDialog(null, "Seleccione el numero de jugadores", "Jugadores",   JOptionPane.QUESTION_MESSAGE,null, new Object[] {2,3,4,5,6},   "");
    }
    
    //get set
    public Object getJugadores() {
        return jugadores;
    }

    public Object getEspacios() {
        return espacios;
    }

}
