/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Juan
 */
public class V_SignIn extends javax.swing.JFrame {
    V_Inicio vistaInicio;
    /**
     * Creates new form view
     */
    public V_SignIn(V_Inicio vistaInic) {
        initComponents();
        this.vistaInicio = vistaInic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        HeaderLogin = new javax.swing.JPanel();
        NombreApp = new javax.swing.JLabel();
        RegistarseBtn = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        FormDatosReg = new javax.swing.JPanel();
        NombreField = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        ApellidoField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        TelefonoLabel = new javax.swing.JLabel();
        TelefonoField = new javax.swing.JTextField();
        ContrasenaLabel = new javax.swing.JLabel();
        SummitBtn = new javax.swing.JButton();
        ContrasenaField = new javax.swing.JPasswordField();
        IngresarDatosLabel = new javax.swing.JLabel();
        InicioGmail = new javax.swing.JButton();
        InicioFacebook = new javax.swing.JButton();
        InicioTwitter = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("123 Viajes C.A.");
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLogin.setBackground(new java.awt.Color(204, 255, 255));

        NombreApp.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        NombreApp.setText("123 Viajes C.A");

        RegistarseBtn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        RegistarseBtn.setText("Entrar");
        RegistarseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLoginLayout = new javax.swing.GroupLayout(HeaderLogin);
        HeaderLogin.setLayout(HeaderLoginLayout);
        HeaderLoginLayout.setHorizontalGroup(
            HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(RegistarseBtn)
                .addGap(14, 14, 14))
        );
        HeaderLoginLayout.setVerticalGroup(
            HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(NombreApp, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addComponent(RegistarseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(HeaderLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(720, 480));
        Background.setMinimumSize(new java.awt.Dimension(720, 480));
        Background.setPreferredSize(new java.awt.Dimension(720, 480));
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackgroundHoverIn(evt);
            }
        });
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FormDatosReg.setBackground(new java.awt.Color(153, 204, 255));
        FormDatosReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFieldActionPerformed(evt);
            }
        });

        NombreLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NombreLabel.setText("Nombre");

        ApellidoLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ApellidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ApellidoLabel.setText("Apellido");

        ApellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoFieldActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmailLabel.setText("Email");

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        TelefonoLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TelefonoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TelefonoLabel.setText("Telefono");

        TelefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoFieldActionPerformed(evt);
            }
        });

        ContrasenaLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ContrasenaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ContrasenaLabel.setText("Contraseña");

        SummitBtn.setText("Ok");
        SummitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SummitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SummitBtnMouseEntered(evt);
            }
        });
        SummitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummitBtnActionPerformed(evt);
            }
        });

        ContrasenaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContrasenaField.setText("jPasswordField1");

        javax.swing.GroupLayout FormDatosRegLayout = new javax.swing.GroupLayout(FormDatosReg);
        FormDatosReg.setLayout(FormDatosRegLayout);
        FormDatosRegLayout.setHorizontalGroup(
            FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormDatosRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContrasenaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApellidoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TelefonoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TelefonoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApellidoField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContrasenaField))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormDatosRegLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(SummitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        FormDatosRegLayout.setVerticalGroup(
            FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormDatosRegLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormDatosRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaLabel)
                    .addComponent(ContrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(SummitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        Background.add(FormDatosReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 280, 210));

        IngresarDatosLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IngresarDatosLabel.setText("Ingresa tus datos");
        Background.add(IngresarDatosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        InicioGmail.setText("Iniciar con gmail");
        InicioGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioGmailActionPerformed(evt);
            }
        });
        Background.add(InicioGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 150, -1));

        InicioFacebook.setText("Iniciar con facebook");
        Background.add(InicioFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 150, -1));

        InicioTwitter.setText("Iniciar con twitter");
        Background.add(InicioTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 150, -1));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistarseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistarseBtnActionPerformed

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void ApellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void TelefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoFieldActionPerformed

    private void SummitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SummitBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SummitBtnMouseEntered

    private void SummitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SummitBtnActionPerformed

    private void InicioGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioGmailActionPerformed

    private void BackgroundHoverIn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundHoverIn
        // TODO add your handling code here:

    }//GEN-LAST:event_BackgroundHoverIn

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoField;
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JPanel Background;
    private javax.swing.JPasswordField ContrasenaField;
    private javax.swing.JLabel ContrasenaLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel FormDatosReg;
    private javax.swing.JPanel HeaderLogin;
    private javax.swing.JLabel IngresarDatosLabel;
    private javax.swing.JButton InicioFacebook;
    private javax.swing.JButton InicioGmail;
    private javax.swing.JButton InicioTwitter;
    private javax.swing.JLabel NombreApp;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JButton RegistarseBtn;
    private javax.swing.JButton SummitBtn;
    private javax.swing.JTextField TelefonoField;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
