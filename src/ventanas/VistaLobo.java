/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import control.Controlador;
import javax.swing.ImageIcon;
import objetos.Player;

/**
 *
 * @author RedCa
 */
public class VistaLobo extends javax.swing.JFrame {

    /**
     * Creates new form Garden
     */
    public VistaLobo() {
        initComponents();
    }
    
     public VistaLobo(Controlador c) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.playSet = c;
        
        Player lobo = playSet.getAlly();
        Player leon = playSet.getEnemy();
        
        // Atributos Aliado
        String accion = lobo.getAccion();
        String arma = lobo.getArma();
        int esfuerzo = lobo.getEsfuerzo();
        int minimo = lobo.getMinimo();
        int estamina = lobo.getEstamina()-esfuerzo-minimo;
        
        // Atributos Enemigo
        String accionEn = leon.getAccion();
        int esfuerzoEn = leon.getEsfuerzo();
        int minimoEn = leon.getMinimo();
        String armaEn = leon.getArma();
        
        ImageIcon icon = new ImageIcon("imagenes/Enemigo.jpg");
        jLabelLobo.setIcon(icon);
        ImageIcon icones = new ImageIcon("imagenes/YOp.jpg");
        jLabelLeon.setIcon(icones);
        jLabelNombre.setText(lobo.getNombre() + ":");
        
        jTextFieldActEnemy.setText(accionEn);
        jTextFieldArmaEnemy.setText(armaEn);
        //Especiales
        boolean desarmado = false;
        
       // Calcular Vida Aliada
       float dano = 0;
       float cura = 0;
       
       //Calcular Vida Enemiga
       float modArmaEn;
       float aEEn = (esfuerzoEn/5);
       //aE = Esfuerzo Aplicado, mas Esfuerzo en el ataque, mas daño. Por cada 5 de Esfuerzo, aE += 1
       
       
       if (armaEn == "ESPADA"){
           modArmaEn = 1;
       } else {
           modArmaEn = (float) 0.5;
       }
       
        
       switch (accion){
           case "CURARSE":
               switch (accionEn){
                    case "FINTAR":
                        dano = (30*modArmaEn)+(aEEn*3);
                        break;
                    case "ARREMETER":
                        dano = (50*modArmaEn)+(aEEn*5);
                        break;
                    case "ATACAR":
                        dano = (20*modArmaEn)+(aEEn*2);
                        cura = 20;
                        estamina =+ 20;
                        break;
                    default:
                       cura = 40;
                       estamina =+ 40;
                        break;
                    }
               break;
           case "BLOQUEAR":
               switch (accionEn){
                    case "ATACAR":
                        
                       break;
                    case "FINTAR":
                        dano = (30*modArmaEn)+(aEEn*3)+5;
                       break;
                    case "ARREMETER":
                        
                        break;
                    default:
                        break;
               }
               break;
           case "FINTAR":
               switch (accionEn){
                   case "ATACAR":
                       dano = (20*modArmaEn)+(aEEn*3)+15;
                       break;
                    case "FINTAR":
                       dano = (30*modArmaEn)+(aEEn*3);
                       break;
                    case "ARREMETER":
                        dano = (20*modArmaEn)+(aEEn*3)+25;
                        break;
                    default:
                        break;
               }
               
               
               break;
           case "RETROCEDER":
               switch (accionEn){
                   case "ATACAR":
                       
                       break;
                    case "FINTAR":
                       
                       break;
                    case "ARREMETER":
                        dano = (50*modArmaEn)+(aEEn*5)+5;
                        break;
                    default:
                        break;
               }
               
               
               break;
           case "ARREMETER":
               switch (accionEn){
                   case "ATACAR":
                       dano = (50*modArmaEn)+(aEEn*5)-25;
                       break;
                    case "FINTAR":
                       dano = (50*modArmaEn)+(aEEn*5)+5;
                       break;
                    case "ARREMETER":
                       dano = (50*modArmaEn)+(aEEn*5)-10;
                       break;
                    default:
                        break;
               }
               
               
               break;
           case "ATACAR":
               switch (accionEn){
                   case "ATACAR":
                       dano = (20*modArmaEn)+(aEEn*2)-5;
                       break;
                    case "FINTAR":
                       dano = (30*modArmaEn)+(aEEn*3)-15;
                       break;
                    case "ARREMETER":
                        
                        break;
                    default:
                        break;
               }
               
               
               break;
        }
       
        int vida = lobo.getVida();
        vida = vida - Math.round(dano) + Math.round(cura);
        if (vida < 0){
            vida = 0;
        }else{
            if (vida > 100){
                vida = 100;
            }
        }
        jProgressBarVida.setValue(vida);
        jProgressBarEstamina.setValue(estamina);
        
        String nombre = lobo.getNombre();
        
        
        playSet.getAlly().setEstamina(jProgressBarEstamina.getValue());
        playSet.getAlly().setVida(jProgressBarVida.getValue());
        
        // Pendiente a añadir en un futuro: Armas [Lanza](NO Bloquea, Ataque golpea a Retroceder), [Ballesta](NO Bloquea, Atacar golpea a Retroceder, Traspasa Bloqueos de Armas)||
        // Mini-Eventos de Garden|| Estados como [Herido](Cuesta mas energia algunas acciones)
        // Dañar al enemigo con cualquier ataque te regenera +10 de Estamina
        // Eventos de 0 Estamina [Rendirse][Ataque desesperado]
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBarVida = new javax.swing.JProgressBar();
        jProgressBarEstamina = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelLobo = new javax.swing.JLabel();
        jLabelLeon = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldActEnemy = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldArmaEnemy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProgressBarVida.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBarVida.setForeground(new java.awt.Color(204, 0, 0));

        jProgressBarEstamina.setBackground(new java.awt.Color(51, 204, 255));
        jProgressBarEstamina.setForeground(new java.awt.Color(51, 204, 255));

        jLabel1.setText(":ESTAMINA");

        jLabel2.setText("VIDA:");

        jLabelLobo.setIcon(new javax.swing.ImageIcon("C:\\Users\\RedCa\\Desktop\\Netbean\\BattleGardenPrototype\\src\\imagenes\\YOp.jpg")); // NOI18N

        jLabelLeon.setIcon(new javax.swing.ImageIcon("C:\\Users\\RedCa\\Desktop\\Netbean\\BattleGardenPrototype\\src\\imagenes\\Enemigo.jpg")); // NOI18N

        jButton1.setText("NEXT TURN --->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setText("DECIR:");

        jTextFieldActEnemy.setEditable(false);

        jTextFieldArmaEnemy.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jProgressBarVida, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jProgressBarEstamina, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldArmaEnemy)
                            .addComponent(jTextFieldActEnemy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarEstamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldActEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldArmaEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        boolean acabado = playSet.comprobarEstado();
        if (acabado == true){
            
            Resultado fin = new Resultado(playSet);
            fin.setVisible(true);
            this.dispose(); 
            
        } else{
           
            int actual = playSet.getTurno();
            actual =+ 1;
        
            playSet.setTurno(actual);
        
            String dialog = jTextField1.getText();
            String name = jLabelNombre.getText();
        
            playSet.crearModelo(name, dialog);
        
            Aliado lobo = new Aliado(playSet);
            lobo.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaLobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLobo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaLobo().setVisible(true);
            }
        });
    }

    Controlador playSet;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLeon;
    private javax.swing.JLabel jLabelLobo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JProgressBar jProgressBarEstamina;
    private javax.swing.JProgressBar jProgressBarVida;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldActEnemy;
    private javax.swing.JTextField jTextFieldArmaEnemy;
    // End of variables declaration//GEN-END:variables
}
