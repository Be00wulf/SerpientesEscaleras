package edu.cunoc.serpientesescaleras.jugador;

public class Casilla {
    private String claseCasilla;
    private int pX;
    private int pY;
    private int movimientoEspecial;
    
    //constructor
    public Casilla() {
        this.pX = 0;
        this.pY = 0;
        this.movimientoEspecial = 0;
    }
    
    //metodos
    
    //get set
    public String getClaseCasilla() {
        return claseCasilla;
    }

    public void setClaseCasilla(String claseCasilla) {
        this.claseCasilla = claseCasilla;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getMovimientoEspecial() {
        return movimientoEspecial;
    }

    public void setMovimientoEspecial(int movimientoEspecial) {
        this.movimientoEspecial = movimientoEspecial;
    }
    
    
    
    
    
    
    
}
