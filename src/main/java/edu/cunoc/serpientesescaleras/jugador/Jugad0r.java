/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cunoc.serpientesescaleras.jugador;

public class Jugad0r {
    private int id;
    private String nombreJugador;
    private String apellidoJugador;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    private int posicionAhora;
    private int posicionAntes;
    private Object colorFicha;
    private int pierdeTurno;

    public Jugad0r() {
        //jugador en sus inicios
        this.partidasJugadas = 0;
        this.partidasGanadas = 0;
        this.posicionAhora = 1;
        this.pierdeTurno = 0;
    }
    
    //metodos
    
    //set get
    public int getPierdeTurno() {
        return pierdeTurno;
    }

    public void setPierdeTurno(int pierdeTurno) {
        this.pierdeTurno = pierdeTurno;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getApellidoJugador() {
        return apellidoJugador;
    }

    public void setApellidoJugador(String apellidoJugador) {
        this.apellidoJugador = apellidoJugador;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPosicionAhora() {
        return posicionAhora;
    }

    public void setPosicionAhora(int posicionAhora) {
        this.posicionAhora = posicionAhora;
    }

    public int getPosicionAntes() {
        return posicionAntes;
    }

    public void setPosicionAntes(int posicionAntes) {
        this.posicionAntes = posicionAntes;
    }

    public Object getColorFicha() {
        return colorFicha;
    }

    public void setColorFicha(Object colorFicha) {
        this.colorFicha = colorFicha;
    }

    
    
}
