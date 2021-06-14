/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author alumnodaw
 */
public class Arma {
   
    /**/private String nombre;//                                  Lanza     Espada    Daga    Arco     Hacha    Escudo
    
    /*Proteje todo*/private boolean bloquear;//                    No         No       No      No       No       X                            
    
    /*Proteje No Sutil*/private boolean bloqueoMenor;//            X          X        No      No       X        X                        
    
    /*Reduce Cansancion*/private boolean ligera;//                 No         No       X       X        No       no                         
    
    /*Atacar al retroceso*/private boolean alcance;//              X          No       No      X        No       no                              
    
    /*Rompe escudos y cansancio dual*/private boolean pesada;//    No         No       No      No       X        no                               
      
    /*Puede fintar*/private boolean adaptable;//                   No         X        X       No       No       X                                  
    
    /*ataque brumoso*/private boolean fina;//                      X          No       X       X        No       no                                       
    
    /*Esquivar*/private boolean skilled;//                         no         no       X       X        no       X           
    
    /*Reducion de daño*/private boolean sutil;//                   no         no       X       no       no       X
    
    /*Mucha reduccion*/private boolean inadecuada;//               no         no       no      no       no       X
    
    /*vida del arma*/private int vida;
    
    /*desarmada*/private boolean desarmado;

    public Arma(String nombre, boolean bloquear, boolean bloqueoMenor, boolean ligera, boolean alcance, boolean pesada, boolean adaptable, boolean fina, boolean skilled, boolean sutil, boolean inadecuada, int vida, boolean desarmado) {
        this.nombre = nombre;
        this.bloquear = bloquear;
        this.bloqueoMenor = bloqueoMenor;
        this.ligera = ligera;
        this.alcance = alcance;
        this.pesada = pesada;
        this.adaptable = adaptable;
        this.fina = fina;
        this.skilled = skilled;
        this.sutil = sutil;
        this.inadecuada = inadecuada;
        this.vida = vida;
        this.desarmado = desarmado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBloquear() {
        return bloquear;
    }

    public void setBloquear(boolean bloquear) {
        this.bloquear = bloquear;
    }

    public boolean isBloqueoMenor() {
        return bloqueoMenor;
    }

    public void setBloqueoMenor(boolean bloqueoMenor) {
        this.bloqueoMenor = bloqueoMenor;
    }

    public boolean isLigera() {
        return ligera;
    }

    public void setLigera(boolean ligera) {
        this.ligera = ligera;
    }

    public boolean isAlcance() {
        return alcance;
    }

    public void setAlcance(boolean alcance) {
        this.alcance = alcance;
    }

    public boolean isPesada() {
        return pesada;
    }

    public void setPesada(boolean pesada) {
        this.pesada = pesada;
    }

    public boolean isAdaptable() {
        return adaptable;
    }

    public void setAdaptable(boolean adaptable) {
        this.adaptable = adaptable;
    }

    public boolean isFina() {
        return fina;
    }

    public void setFina(boolean fina) {
        this.fina = fina;
    }

    public boolean isSkilled() {
        return skilled;
    }

    public void setSkilled(boolean skilled) {
        this.skilled = skilled;
    }

    public boolean isSutil() {
        return sutil;
    }

    public void setSutil(boolean sutil) {
        this.sutil = sutil;
    }

    public boolean isInadecuada() {
        return inadecuada;
    }

    public void setInadecuada(boolean inadecuada) {
        this.inadecuada = inadecuada;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isDesarmado() {
        return desarmado;
    }

    public void setDesarmado(boolean desarmado) {
        this.desarmado = desarmado;
    }
    
    @Override
    public String toString() {
        
        String stats = nombre + "\n";
        
        if (bloquear==true){
            stats += " +Proteccion total \n";
        }
        if (bloqueoMenor==true){
            stats += " +Proteccion Parcial \n";
        }
        if (ligera==true){
            stats += " +Menos esfuerzo \n";
        }
        if (alcance==true){
            stats += " +Ataca a distancia \n";
        }
        if (pesada==true){
            stats += " +Golpea mas duro \n";
        }
        if (adaptable==true){
            stats += " +Engaña al oponente \n";
        }
        if (fina==true){
            stats += " +Dificil de Bloquear \n";
        }
        if (skilled==true){
            stats += " +Esquivando la muerte \n";
        }
        if (sutil==true){
            stats += " -Menos daño \n";
        }
        if (inadecuada==true){
            stats += " -Mucho menos daño \n";
        }
        stats += "";
        return stats;
    }
    
    
    public static DefaultComboBoxModel getActions(Arma ar, int usos, int stamina){
        DefaultComboBoxModel mAccion = new DefaultComboBoxModel();
        
        if (stamina > 10){
            mAccion.addElement("RETROCEDER");
        }
        
        
        if (usos > 0){
            mAccion.addElement("CURARSE");
        }
        
        if (ar.isDesarmado()){
            mAccion.addElement("RECUPERAR");
        }
        
        
        
        if (ar.isAdaptable()){
            mAccion.addElement("FINTAR");
        }
        
        if (!ar.isSkilled()){
            mAccion.addElement("ARREMETER");
        }
        
        
        
        
        return mAccion;
    }
    
    
    
    
    
    
    
    
}
