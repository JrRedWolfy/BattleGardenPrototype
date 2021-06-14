/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historia;

import control.Controlador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnodaw
 */
public class IODatos {
    
    public static void guardarPartida(Controlador playSet){
        
        File f = new File("lastGame.dat");
        
        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                ){
            
            oos.writeObject(playSet);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Controlador cargarPartida(){
        Controlador playSet = null;
        
        File f = new File("lastGame.dat");
        
        if (!f.exists()){
            try {
                f.createNewFile();
                return playSet;
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));){
            playSet = (Controlador) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return playSet;
    }
    
    
}
