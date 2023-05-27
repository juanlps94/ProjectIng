/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class V_Modificar_Hotel extends javax.swing.JFrame {

    /**
     * Creates new form V_Modificar_Hotel
     */
    public V_Modificar_Hotel() {
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

        Header = new javax.swing.JPanel();
        NombreApp = new javax.swing.JLabel();
        BienvenidoMensage = new javax.swing.JLabel();
        Perfil = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        ProfilePic = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        ModCiudadLabel = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        HotelInfoBox = new javax.swing.JPanel();
        NombreField = new javax.swing.JTextField();
        RankingField = new javax.swing.JTextField();
        HabitacionesField = new javax.swing.JTextField();
        OpinionesField = new javax.swing.JTextField();
        ZonaField = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        RankingLabel = new javax.swing.JLabel();
        HabitacionesLabel = new javax.swing.JLabel();
        OpinionesLabel = new javax.swing.JLabel();
        ZonaLabel = new javax.swing.JLabel();
        CambiarBtn = new javax.swing.JButton();
        AdjuntarImgLabel = new javax.swing.JLabel();
        HotelImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("123 Viajes C.A.");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(204, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(720, 80));

        NombreApp.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        NombreApp.setText(" 123 Viajes C.A");

        BienvenidoMensage.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BienvenidoMensage.setText("Bienvenido/a");

        Perfil.setBackground(new java.awt.Color(153, 255, 255));
        Perfil.setMnemonic('3');
        Perfil.setText("Perfil");
        Perfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 255), null));
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(153, 255, 255));
        Salir.setMnemonic('3');
        Salir.setText("Salir");
        Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 255), null));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        ProfilePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfilePic.setText("ProfilePic");
        ProfilePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(NombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(Perfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BienvenidoMensage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NombreApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(BienvenidoMensage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perfil)
                            .addComponent(Salir)))
                    .addComponent(ProfilePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Background.setPreferredSize(new java.awt.Dimension(720, 480));

        ModCiudadLabel.setText("Modificar Hotel");

        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });

        HotelInfoBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        NombreLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreLabel.setText("Nombre");

        RankingLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RankingLabel.setText("Ranking");

        HabitacionesLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        HabitacionesLabel.setText("Habitaciones");

        OpinionesLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        OpinionesLabel.setText("Opiniones");

        ZonaLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ZonaLabel.setText("Zona");

        CambiarBtn.setText("Cambiar");

        javax.swing.GroupLayout HotelInfoBoxLayout = new javax.swing.GroupLayout(HotelInfoBox);
        HotelInfoBox.setLayout(HotelInfoBoxLayout);
        HotelInfoBoxLayout.setHorizontalGroup(
            HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelInfoBoxLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HabitacionesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpinionesLabel)
                    .addComponent(RankingLabel)
                    .addComponent(NombreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZonaLabel))
                .addGap(36, 36, 36)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OpinionesField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HabitacionesField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RankingField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZonaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(HotelInfoBoxLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(CambiarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HotelInfoBoxLayout.setVerticalGroup(
            HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelInfoBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RankingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RankingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HabitacionesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HabitacionesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpinionesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpinionesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HotelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZonaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZonaLabel))
                .addGap(26, 26, 26)
                .addComponent(CambiarBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        AdjuntarImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdjuntarImgLabel.setText("Adjuntar imagen");

        HotelImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HotelImageLabel.setText("HotelImage");
        HotelImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(AdjuntarImgLabel)
                                .addGap(115, 115, 115))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(HotelImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addComponent(HotelInfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(ModCiudadLabel)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(RegresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(ModCiudadLabel)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HotelInfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(RegresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HotelImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AdjuntarImgLabel)
                        .addGap(159, 159, 159))))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdjuntarImgLabel;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BienvenidoMensage;
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JTextField HabitacionesField;
    private javax.swing.JLabel HabitacionesLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HotelImageLabel;
    private javax.swing.JPanel HotelInfoBox;
    private javax.swing.JLabel ModCiudadLabel;
    private javax.swing.JLabel NombreApp;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField OpinionesField;
    private javax.swing.JLabel OpinionesLabel;
    private javax.swing.JButton Perfil;
    private javax.swing.JLabel ProfilePic;
    private javax.swing.JTextField RankingField;
    private javax.swing.JLabel RankingLabel;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField ZonaField;
    private javax.swing.JLabel ZonaLabel;
    // End of variables declaration//GEN-END:variables
}
