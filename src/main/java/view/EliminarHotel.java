/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class EliminarHotel extends javax.swing.JPanel {

    /**
     * Creates new form EliminarCity
     */
    public EliminarHotel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        ConfirmarLabel = new javax.swing.JLabel();
        SiBtn = new javax.swing.JButton();
        NoBtn = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        setName("EliminarCity"); // NOI18N

        ConfirmarLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ConfirmarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmarLabel.setText("¿Seguro que quieres Eliminar este Hotel?");

        SiBtn.setBackground(new java.awt.Color(153, 255, 255));
        SiBtn.setText("No");
        SiBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        NoBtn.setBackground(new java.awt.Color(153, 255, 255));
        NoBtn.setText("Sí");
        NoBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        NoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(NoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(ConfirmarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ConfirmarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void NoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmarLabel;
    private javax.swing.JButton NoBtn;
    private javax.swing.JButton SiBtn;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
