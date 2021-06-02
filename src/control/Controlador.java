/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import objetos.Player;

/**
 *
 * @author alumnodaw
 */
public class Controlador {
    
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
    public void setAlly(String nombre, String accion, String arma, int vida, int estamina, int minimo, int esfuerzo) {
        this.ally = new Player(nombre, accion, arma, vida, estamina, minimo, esfuerzo);
    }

    public Player getEnemy() {
        return enemy;
    }
    public void setEnemy(String nombre, String accion, String arma, int vida, int estamina, int minimo, int esfuerzo) {
        this.enemy = new Player(nombre, accion, arma, vida, estamina, minimo, esfuerzo);
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
    
    
    
    
    
}
