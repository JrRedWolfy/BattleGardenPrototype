/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import objetos.Arma;
import objetos.Player;

/**
 *
 * @author alumnodaw
 */
public class Controlador implements Serializable {
    
    private Player ally;
    
    private Player enemy;
    
    private int turno;
    
    private javax.swing.DefaultListModel mDialogo;

    public Controlador(Player ally, Player enemy, int turno, DefaultListModel mDialogo) {
        this.ally = ally;
        this.enemy = enemy;
        this.turno = turno;
        this.mDialogo = mDialogo;
    }

    public Player getAlly() {
        return ally;
    }
    public void setAlly(String nombre, String accion, String arma, int vida, int estamina, int minimo, int esfuerzo, ArrayList<Arma> vEquipo) {
        ally = new Player(nombre, accion, arma, vida, estamina, minimo, esfuerzo, vEquipo);
    }

    public Player getEnemy() {
        return enemy;
    }
    public void setEnemy(String nombre, String accion, String arma, int vida, int estamina, int minimo, int esfuerzo, ArrayList<Arma> vEquipo) {
        this.enemy = new Player(nombre, accion, arma, vida, estamina, minimo, esfuerzo, vEquipo);
    }

    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }

    public DefaultListModel getmDialogo() {
        return mDialogo;
    }
    public void setmDialogo(DefaultListModel mDialogo) {
        this.mDialogo = mDialogo;
    }

    @Override
    public String toString() {
        return "Controlador{" + "ally=" + ally + ", enemy=" + enemy + ", turno=" + turno + ", mDialogo=" + mDialogo + '}';
    }
    
    
    public void crearModelo(String name, String dialog){
        
        String text = name + " " + dialog;
        mDialogo.addElement(text);
    }
    
    
    
    public boolean comprobarEstado(){
        boolean yes = false;
        
        if (ally.getVida()==0){
            yes = true;
        }
        if (enemy.getVida()==0){
            yes = true;
        }
        
        return yes;
    }
    
    public String quienGana(){
        String ganador ="";
        if ((ally.getVida()==0)&&(enemy.getVida()==0)){
            ganador = "EMPATE";
        } else {
            if (ally.getVida()== 0){
                ganador = "YOU WIN: " + enemy.getNombre();
            }else{
                ganador = "YOU WIN: " + ally.getNombre();
            }
        }
        
        return ganador;
    }
    
    
    
    
    
    
}
