/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Objetos.Player;

/**
 *
 * @author RedCa
 */
public class Garden extends javax.swing.JFrame {

    /**
     * Creates new form Garden
     */
    public Garden() {
        initComponents();
    }
    
     public Garden(Player leon, Player lobo, String turno, javax.swing.DefaultListModel mDialogo) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.lobo=lobo;
        this.leon=leon;
        
        // Atributos Aliado
        accion = lobo.getAccion();
        arma = lobo.getArma();
        esfuerzo = lobo.getEsfuerzo();
        estamina = lobo.getEstamina();
        vida = lobo.getVida();
        minimo = lobo.getMinimo();
        int rendimiento = estamina - esfuerzo;
        
        // Atributos Enemigo
        accionEn = leon.getAccion();
        esfuerzoEn = leon.getEsfuerzo();
        estaminaEn = leon.getEstamina();
        vidaEn = leon.getVida();
        minimoEn = leon.getMinimo();
        armaEn = leon.getArma();
        int rendimientoEn = estaminaEn - esfuerzoEn;
        
        
        
        jTextFieldActAlly.setText(accion);
        jTextFieldArmaAlly.setText(arma);
        jLabelNombre.setText(lobo.getNombre() + ":");
        
        jTextFieldActEnemy.setText(accionEn);
        jTextFieldArmaEnemy.setText(armaEn);
        //Especiales
        boolean desarmado = false;
        
       // Calcular Vida Aliada
       double danio = 0;
       double cura = 0;
       double modArma;
       double aE = (esfuerzo/5);
       
       //Calcular Vida Enemiga
       double danioEn = 0;
       double curaEn = 0;
       double modArmaEn;
       double aEEn = (esfuerzoEn/5);
       //aE = Esfuerzo Aplicado, mas Esfuerzo en el ataque, mas daño. Por cada 5 de Esfuerzo, aE += 1
       
       
       if (armaEn == "ESPADA"){
           modArmaEn = 1;
       } else {
           modArmaEn = 0.5;
       }
       
       if (arma == "ESPADA"){
           modArma = 1;
       } else {
           modArma = 0.5;
       }
       
        
       switch (accion){
           case "CURARSE":
               switch (accionEn){
                    case "FINTAR":
                        danio = (40*modArmaEn)+(modArmaEn*4*aEEn); 
                        // daño base(Finta)*arma + Esfuerzo
                        cura = 25;
                        rendimiento += 25;
                        break;
                    case "ARREMETER":
                        danio = (50*modArmaEn)+(modArmaEn*5*aEEn)+20;
                        cura = 25;
                        rendimiento += 25;
                        break;
                    case "ATACAR":
                        danio = (20*modArmaEn)+(modArmaEn*2*aEEn);
                        cura = 25;
                        rendimiento += 25;
                        break;
                    default:
                        vida += 50;
                        rendimiento += 50;
                        break;
                    }
               break;
           case "BLOQUEAR":
               switch (accionEn){
                    case "ATACAR":
                        danio = (modArmaEn*2*aEEn)-10;
                        rendimiento -= danio;
                        if (rendimiento<0){
                            desarmado = true;
                        }
                       break;
                    case "FINTAR":
                        danio = (40*modArma)+(modArma*4*aE)+5;
                       break;
                    case "ARREMETER":
                        danio = (modArmaEn*5*aEEn)-25;
                        rendimiento -= danio;
                        if (rendimiento<0){
                            desarmado = true;
                            rendimiento = 0;
                        }
                        break;
                    case "CURARSE":
                        
                        
                        break;
                    default:
                        break;
               }
               break;
           case "FINTAR":
               switch (accionEn){
                   case "ATACAR":
                        danio = (modArmaEn*2*aE)+10;
                        danioEn = (20*modArmaEn)+(modArmaEn*2*aEEn);
                        rendimiento -= danio;
                        if (rendimiento<0){
                            desarmado = true;
                        }
                       break;
                    case "FINTAR":
                        danio = (40*modArma)+(modArma*4*aE)+5;
                       break;
                    case "ARREMETER":
                        danio = (modArma*5*aE)-25;
                        rendimiento -= danio;
                        if (rendimiento<0){
                            desarmado = true;
                        }
                        break;
                    case "CURARSE":
                        
                        
                        break;
                    default:
                        break;
                   
                   
                   
               }
               
               
               break;
           case "RETROCEDER":
               
               
               
               break;
           case "ARREMETER":
               
               
               
               break;
           case "ATACAR":
               
               
               
               break;
        }
        vida -= danio;
        if (vida < 0){
            vida = 0;
        }
        jProgressBarVida.setValue(vida);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldActEnemy = new javax.swing.JTextField();
        jTextFieldActAlly = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldArmaAlly = new javax.swing.JTextField();
        jTextFieldArmaEnemy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jProgressBarVida.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBarVida.setForeground(new java.awt.Color(204, 0, 0));

        jProgressBarEstamina.setBackground(new java.awt.Color(51, 204, 255));
        jProgressBarEstamina.setForeground(new java.awt.Color(51, 204, 255));

        jLabel1.setText(":ESTAMINA");

        jLabel2.setText("VIDA:");

        jButton1.setText("NEXT TURN --->");

        jLabel5.setText("DECIR:");

        jTextFieldActEnemy.setEditable(false);

        jTextFieldActAlly.setEditable(false);

        jTextFieldArmaAlly.setEditable(false);

        jTextFieldArmaEnemy.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldActAlly)
                            .addComponent(jTextFieldArmaAlly, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jProgressBarVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBarEstamina, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldActEnemy)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldArmaEnemy)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jTextFieldActAlly, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldArmaAlly, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jTextFieldActEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldArmaEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(Garden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Garden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Garden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Garden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Garden().setVisible(true);
            }
        });
    }

    private Player lobo;
    private Player leon;
    
    private int minimo;
    private String accion;
    private String arma;
    private String nombre;
    private String turno;
    private int vida;
    private int estamina;
    private int esfuerzo;
   
    private int minimoEn;
    private String accionEn;
    private String armaEn;
    private String nombreEn;
    private String turnoEn;
    private int vidaEn;
    private int estaminaEn;
    private int esfuerzoEn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JProgressBar jProgressBarEstamina;
    private javax.swing.JProgressBar jProgressBarVida;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldActAlly;
    private javax.swing.JTextField jTextFieldActEnemy;
    private javax.swing.JTextField jTextFieldArmaAlly;
    private javax.swing.JTextField jTextFieldArmaEnemy;
    // End of variables declaration//GEN-END:variables
}
