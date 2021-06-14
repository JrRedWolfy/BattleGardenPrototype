/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author RedCa
 */
public class Player {
    
    private String nombre;
    
    private String accion;
    
    private String arma;
    
    private int vida;
    
    private int estamina;
    
    private int minimo;
    
    private int esfuerzo;
    
    private ArrayList<Arma> vEquipo;
    

    public Player(String nombre, String accion, String arma, int vida, int estamina, int minimo, int esfuerzo, ArrayList<Arma> vEquipo) {
        this.nombre = nombre;
        this.accion = accion;
        this.arma = arma;
        this.vida = vida;
        this.estamina = estamina;
        this.minimo = minimo;
        this.esfuerzo = esfuerzo;
        this.vEquipo = vEquipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }
    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getMinimo() {
        return minimo;
    }
    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getEsfuerzo() {
        return esfuerzo;
    }
    public void setEsfuerzo(int esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public ArrayList<Arma> getvEquipo() {
        return vEquipo;
    }

    public void setvEquipo(ArrayList<Arma> vEquipo) {
        this.vEquipo = vEquipo;
    }
    
    

    @Override
    public String toString() {
        return "Player{" + "nombre=" + nombre + ", accion=" + accion + ", arma=" + arma + ", vida=" + vida + ", estamina=" + estamina + ", minimo=" + minimo + ", esfuerzo=" + esfuerzo + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
