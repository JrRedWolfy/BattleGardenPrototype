/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import control.Controlador;
import objetos.Player;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import objetos.Arma;

/**
 *
 * @author RedCa
 */
public class Aliado extends javax.swing.JFrame {

    /**
     * Creates new form Aliado
     */
    public Aliado() {
        initComponents();
    }
    
    public Aliado(Controlador c) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.playSet = c;
        jListDialogo.setModel(playSet.getmDialogo());
        
        jTextFieldNombre.setText(playSet.getAlly().getNombre());
        jProgressBarVida.setValue(playSet.getAlly().getVida());
        jProgressBarEstamina.setValue(playSet.getAlly().getEstamina());
        mArma = new DefaultComboBoxModel();
        for(Arma s: playSet.getAlly().getvEquipo()){
            mArma.addElement(s.getNombre());
        }
        jComboBoxObjeto.setModel(mArma);
        
    }
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LoboIcono.png"));
        return retValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListDialogo = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabelTurno = new javax.swing.JLabel();
        jLabelTurnoNumber = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jProgressBarVida = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jProgressBarEstamina = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMinimo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEsfuerzo = new javax.swing.JTextField();
        jComboBoxAccion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxObjeto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jScrollPane1.setViewportView(jListDialogo);

        jButton1.setText("CONTINUAR --->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabelTurno.setText("TURNO:");

        jLabelTurnoNumber.setText("1");

        jLabelNombre.setText("NOMBRE:");

        jTextFieldNombre.setEditable(false);

        jLabel1.setText("VIDA:");

        jProgressBarVida.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBarVida.setForeground(new java.awt.Color(204, 0, 0));
        jProgressBarVida.setValue(100);
        jProgressBarVida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setText("ESTAMINA:");

        jProgressBarEstamina.setBackground(new java.awt.Color(51, 204, 255));
        jProgressBarEstamina.setForeground(new java.awt.Color(51, 204, 255));
        jProgressBarEstamina.setValue(100);
        jProgressBarEstamina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setText("RENDIMIENTO:");

        jTextFieldMinimo.setEditable(false);
        jTextFieldMinimo.setText("0");

        jLabel4.setText("+");

        jTextFieldEsfuerzo.setEditable(false);
        jTextFieldEsfuerzo.setText("0");
        jTextFieldEsfuerzo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEsfuerzoFocusLost(evt);
            }
        });

        jComboBoxAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURARSE", "BLOQUEAR", "FINTAR", "RETROCEDER", "ARREMETER", "ATACAR" }));
        jComboBoxAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccionActionPerformed(evt);
            }
        });

        jLabel5.setText("ACCION");

        jLabel6.setText("OBJETO");

        jComboBoxObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTurnoNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombre)
                                            .addComponent(jProgressBarVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jProgressBarEstamina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxAccion, 0, 148, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldEsfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jComboBoxObjeto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarVida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBarEstamina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEsfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabelTurnoNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        String turno;
        
      
        
        playSet.getAlly().setAccion(jComboBoxAccion.getSelectedItem().toString());
        playSet.getAlly().setArma(jComboBoxObjeto.getSelectedItem().toString());
        playSet.getAlly().setEstamina(jProgressBarEstamina.getValue());
        playSet.getAlly().setEsfuerzo(Integer.parseInt(jTextFieldEsfuerzo.getText()));
        playSet.getAlly().setMinimo(Integer.parseInt(jTextFieldMinimo.getText()));
        playSet.getAlly().setVida(jProgressBarVida.getValue());
        
        Pantalla leo = new Pantalla(playSet);
        leo.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextFieldEsfuerzoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEsfuerzoFocusLost
        
        int esfuerzo = Integer.parseInt(jTextFieldEsfuerzo.getText());
        int minimo = Integer.parseInt(jTextFieldMinimo.getText());
        int stamina = jProgressBarEstamina.getValue()-minimo;
        
        
        if (esfuerzo%5!=0){
            while (esfuerzo%5!=0){
                esfuerzo -= 1;   
            }
        }
        jTextFieldEsfuerzo.setText("" + esfuerzo);
        if (esfuerzo>stamina){
            jTextFieldEsfuerzo.setText("" + stamina);
        }
    }//GEN-LAST:event_jTextFieldEsfuerzoFocusLost

    private void jComboBoxAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccionActionPerformed
        String opc = jComboBoxAccion.getSelectedItem().toString();
        
        switch (opc){
            case "CURARSE":
                jTextFieldMinimo.setText("0");
                jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(false);
                break;
            case "BLOQUEAR":
                jTextFieldMinimo.setText("5");
                jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(false);
                break;
            case "FINTAR":
                jTextFieldMinimo.setText("15");
                 jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(true);
                break;
            case "RETROCEDER":
                jTextFieldMinimo.setText("10");
                jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(false);
                break;
            case "ARREMETER":
                jTextFieldMinimo.setText("25");
                jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(true);
                break;
            case "ATACAR":
                jTextFieldMinimo.setText("10");
                jTextFieldEsfuerzo.setText("0");
                jTextFieldEsfuerzo.setEditable(true);
                break;
        } 
        
    }//GEN-LAST:event_jComboBoxAccionActionPerformed

    private void jComboBoxObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxObjetoActionPerformed
        
        String arma = jComboBoxObjeto.getSelectedItem().toString();
        int st = jProgressBarEstamina.getValue();
        for(Arma r: playSet.getAlly().getvEquipo()){
            if (arma.equals(r.getNombre())){
                mAccion = objetos.Arma.getActions(r, usos, st);
            }
        }
        jComboBoxAccion.setModel(mAccion);
        
    }//GEN-LAST:event_jComboBoxObjetoActionPerformed

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
            java.util.logging.Logger.getLogger(Aliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Aliado().setVisible(true);
            }
        });
    }

    private int usos = 3;
    private DefaultComboBoxModel mAccion;
    private DefaultComboBoxModel mArma;
    private Controlador playSet;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxAccion;
    private javax.swing.JComboBox<String> jComboBoxObjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTurno;
    private javax.swing.JLabel jLabelTurnoNumber;
    private javax.swing.JList<String> jListDialogo;
    private javax.swing.JProgressBar jProgressBarEstamina;
    private javax.swing.JProgressBar jProgressBarVida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEsfuerzo;
    private javax.swing.JTextField jTextFieldMinimo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
