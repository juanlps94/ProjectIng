/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class V_Login extends javax.swing.JFrame {
    V_CityList vistaCityList;
    V_SignIn vistaSignIn;
    /**
     * Creates new form V_Registro
     */
    public V_Login(V_CityList vistaCiudades, V_SignIn vistaSignIn) {
        initComponents();
        this.vistaCityList = vistaCiudades;
        this.vistaSignIn = vistaSignIn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderLogin = new javax.swing.JPanel();
        NombreApp = new javax.swing.JLabel();
        RegistrarseBtn = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        BoxBackground = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UserInput = new javax.swing.JTextField();
        OkBtn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        CredencialesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("123 Viajes C.A.");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLogin.setBackground(new java.awt.Color(204, 255, 255));

        NombreApp.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        NombreApp.setText("123 Viajes C.A");

        RegistrarseBtn.setBackground(new java.awt.Color(153, 255, 255));
        RegistrarseBtn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        RegistrarseBtn.setText("Registrarse");
        RegistrarseBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        RegistrarseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLoginLayout = new javax.swing.GroupLayout(HeaderLogin);
        HeaderLogin.setLayout(HeaderLoginLayout);
        HeaderLoginLayout.setHorizontalGroup(
            HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(RegistrarseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        HeaderLoginLayout.setVerticalGroup(
            HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(NombreApp, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addComponent(RegistrarseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(HeaderLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(720, 480));
        Background.setMinimumSize(new java.awt.Dimension(720, 480));
        Background.setPreferredSize(new java.awt.Dimension(720, 480));

        BoxBackground.setBackground(new java.awt.Color(204, 255, 255));
        BoxBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        UserLabel.setText("Usuario");

        PasswordLabel.setText("Contraseña");

        UserInput.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        UserInput.setForeground(new java.awt.Color(102, 102, 102));
        UserInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        UserInput.setText("alguien@site.com");
        UserInput.setActionCommand("<Not Set>");
        UserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInputActionPerformed(evt);
            }
        });

        OkBtn.setText("Iniciar");
        OkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBtnActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("Password");

        javax.swing.GroupLayout BoxBackgroundLayout = new javax.swing.GroupLayout(BoxBackground);
        BoxBackground.setLayout(BoxBackgroundLayout);
        BoxBackgroundLayout.setHorizontalGroup(
            BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLabel)
                    .addComponent(UserLabel))
                .addGap(18, 18, 18)
                .addGroup(BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserInput, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        BoxBackgroundLayout.setVerticalGroup(
            BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxBackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BoxBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        CredencialesLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CredencialesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CredencialesLabel.setText("Ingresa tus credenciales");
        CredencialesLabel.setToolTipText("Credenciales");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(CredencialesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)))
                .addGap(502, 502, 502))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(CredencialesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-36, 46, 1050, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserInputActionPerformed

    private void OkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBtnActionPerformed
        // TODO add your handling code here:
        String email = this.UserInput.getText();
        String pass = this.jPasswordField1.getText();
        this.setVisible(false);
        this.vistaCityList.setVisible(true);
    }//GEN-LAST:event_OkBtnActionPerformed

    private void RegistrarseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseBtnActionPerformed
        // TODO add your handling code here:
        this.vistaSignIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BoxBackground;
    private javax.swing.JLabel CredencialesLabel;
    private javax.swing.JPanel HeaderLogin;
    private javax.swing.JLabel NombreApp;
    private javax.swing.JButton OkBtn;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegistrarseBtn;
    private javax.swing.JTextField UserInput;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
