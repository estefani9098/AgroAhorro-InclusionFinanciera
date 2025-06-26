
package proyecto_inclusion_finaciera;

import javax.swing.*;

public class FormPrincipal extends JFrame 
{
    public FormPrincipal() {
        this.setUndecorated(true);
        initComponents(); // generado por el GUI Builder
        this.setLocationRelativeTo(null); // centra la ventana
        this.setSize(1100, 650); // tamaño deseado
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblEducacion = new javax.swing.JLabel();
        lblAhorro = new javax.swing.JLabel();
        lblPredicciones = new javax.swing.JLabel();
        lblSoporte = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 209, 123));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Imagen1.png"))); // NOI18N
        lblDashboard.setText(" ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Logoc.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });

        lblEducacion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblEducacion.setText("Educación Financiera");
        lblEducacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEducacionMouseClicked(evt);
            }
        });

        lblAhorro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblAhorro.setText("Ahorro Financiero");
        lblAhorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAhorroMouseClicked(evt);
            }
        });

        lblPredicciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblPredicciones.setText("Predicciones");
        lblPredicciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrediccionesMouseClicked(evt);
            }
        });

        lblSoporte.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblSoporte.setText("Soporte");
        lblSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSoporteMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setText("Dashboard");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAhorro)
                .addGap(25, 25, 25)
                .addComponent(lblPredicciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSoporte, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPredicciones)
                            .addComponent(lblSoporte)
                            .addComponent(jLabel8)
                            .addComponent(lblEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))))
                .addGap(14, 14, 14)
                .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
    JOptionPane.showMessageDialog(this, "El módulo 'Usuario' está en construcción.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void lblEducacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEducacionMouseClicked
    JOptionPane.showMessageDialog(this, "El módulo 'Educación Financiera' está en construcción.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblEducacionMouseClicked

    private void lblPrediccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrediccionesMouseClicked
    JOptionPane.showMessageDialog(this, "El módulo 'Predicciones' está en construcción.", "Aviso", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_lblPrediccionesMouseClicked

    private void lblSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoporteMouseClicked
         JOptionPane.showMessageDialog(this, "El módulo 'Soporte' está en construcción.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lblSoporteMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         JOptionPane.showMessageDialog(this, "El módulo 'Dashboard' está en construcción.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lblAhorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAhorroMouseClicked
        AhorroFinanciero ahorro = new AhorroFinanciero();
    ahorro.setVisible(true);
    }//GEN-LAST:event_lblAhorroMouseClicked
        public static void main(String[] args) {
             java.awt.EventQueue.invokeLater(() -> {
            new FormPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAhorro;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblEducacion;
    private javax.swing.JLabel lblPredicciones;
    private javax.swing.JLabel lblSoporte;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
