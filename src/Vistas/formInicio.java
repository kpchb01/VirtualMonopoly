
package Vistas;

import javax.swing.JOptionPane;
import Vistas.formJuego;




/**
 *
 * @author ARMENI
 */
public class formInicio extends javax.swing.JFrame {

    public static String message; 
    /**
     * Creates new form formInicio
     */
    public formInicio() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrinci = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnCantidad = new javax.swing.JButton();
        X = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrinci.setBackground(new java.awt.Color(255, 255, 255));
        panelPrinci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Goudy Stout", 0, 48)); // NOI18N
        labelTitulo.setText("VIRTUAL MONOPOLY");
        panelPrinci.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.setEnabled(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        panelPrinci.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 250, 30));

        btnCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCantidad.setText("CANTIDAD DE JUGADORES");
        btnCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadActionPerformed(evt);
            }
        });
        panelPrinci.add(btnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 250, 30));

        X.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        panelPrinci.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 20, 20));

        getContentPane().add(panelPrinci, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        main.vistaJuego = new formJuego();
        this.setVisible(false);
        if (Integer.parseInt(message)==3){
            formJuego.jLabelJugador3.setVisible(true);
            formJuego.jTextFieldDinero3.setVisible(true);
            formJuego.turno3.setVisible(true);
            
        }
        
        if(Integer.parseInt(message)==4){
            formJuego.jLabelJugador3.setVisible(true);
            formJuego.jTextFieldDinero3.setVisible(true);
            formJuego.turno3.setVisible(true);
            formJuego.jLabelJugador4.setVisible(true);
            formJuego.jTextFieldDinero4.setVisible(true);
            formJuego.turno4.setVisible(true);
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    
    private void btnCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadActionPerformed
       
        message = JOptionPane.showInputDialog("La cantidad de jugadores es de 2 a 4"); 

       if (message != null){
           if(message.equals("")){
          btnJugar.setEnabled(false);
        }
            if(Integer.parseInt(message)>4 || Integer.parseInt(message)<2){
                JOptionPane.showMessageDialog(null,"La cantidad de jugadores es de 2 a 4");
        }
            else{
                btnJugar.setEnabled(true);
            }
       }
       
    }//GEN-LAST:event_btnCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X;
    private javax.swing.JButton btnCantidad;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrinci;
    // End of variables declaration//GEN-END:variables
}
