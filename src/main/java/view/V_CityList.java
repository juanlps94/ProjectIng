/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class V_CityList extends javax.swing.JFrame {
    V_Perfil_Modificar vistaModPerfil;
    V_Inicio vistaInicio;
    V_HotelList vistaHoteles;
    /**
     * Creates new form V_CityList
     */
    public V_CityList(V_Perfil_Modificar vistaModPerfil, V_Inicio vistaInicial,V_HotelList vistaHoteles) {
        initComponents();
        this.vistaModPerfil = vistaModPerfil;
        this.vistaInicio = vistaInicial;
        this.vistaHoteles = vistaHoteles;
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
        BuscadorCiudad = new javax.swing.JTextField();
        CiudadesDisponibles = new javax.swing.JLabel();
        BuscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        ScrollBox = new javax.swing.JPanel();
        CityInfoBox = new javax.swing.JPanel();
        Ver = new javax.swing.JButton();
        InfoCiudad = new javax.swing.JTextField();
        Ciudad_Pic = new javax.swing.JLabel();
        CityInfoBox1 = new javax.swing.JPanel();
        Ver1 = new javax.swing.JButton();
        InfoCiudad1 = new javax.swing.JTextField();
        Ciudad_Pic1 = new javax.swing.JLabel();
        CityInfoBox2 = new javax.swing.JPanel();
        Ver2 = new javax.swing.JButton();
        InfoCiudad2 = new javax.swing.JTextField();
        Ciudad_Pic2 = new javax.swing.JLabel();
        CityInfoBox3 = new javax.swing.JPanel();
        Ver3 = new javax.swing.JButton();
        InfoCiudad3 = new javax.swing.JTextField();
        Ciudad_Pic3 = new javax.swing.JLabel();

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
        NombreApp.setText("123 Viajes C.A");

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
                .addContainerGap()
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

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(720, 480));
        Background.setMinimumSize(new java.awt.Dimension(720, 480));

        BuscadorCiudad.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        BuscadorCiudad.setForeground(new java.awt.Color(102, 102, 102));
        BuscadorCiudad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        BuscadorCiudad.setText("Ciudad");
        BuscadorCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorCiudadActionPerformed(evt);
            }
        });

        CiudadesDisponibles.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        CiudadesDisponibles.setText("Ciudades disponibles");

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout());

        CityInfoBox.setBackground(new java.awt.Color(204, 204, 204));
        CityInfoBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CityInfoBox.setAutoscrolls(true);
        CityInfoBox.setMaximumSize(new java.awt.Dimension(50, 32767));

        Ver.setText("Reservar");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });

        InfoCiudad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InfoCiudad.setText("Info Ciudad");
        InfoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoCiudadActionPerformed(evt);
            }
        });

        Ciudad_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_Pic.setText("Pic");
        Ciudad_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CityInfoBoxLayout = new javax.swing.GroupLayout(CityInfoBox);
        CityInfoBox.setLayout(CityInfoBoxLayout);
        CityInfoBoxLayout.setHorizontalGroup(
            CityInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInfoBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ciudad_Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CityInfoBoxLayout.setVerticalGroup(
            CityInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInfoBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ciudad_Pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CityInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InfoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CityInfoBox1.setBackground(new java.awt.Color(204, 204, 204));
        CityInfoBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CityInfoBox1.setAutoscrolls(true);
        CityInfoBox1.setMaximumSize(new java.awt.Dimension(50, 32767));

        Ver1.setText("Reservar");
        Ver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver1ActionPerformed(evt);
            }
        });

        InfoCiudad1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InfoCiudad1.setText("Info Ciudad");
        InfoCiudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoCiudad1ActionPerformed(evt);
            }
        });

        Ciudad_Pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_Pic1.setText("Pic");
        Ciudad_Pic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CityInfoBox1Layout = new javax.swing.GroupLayout(CityInfoBox1);
        CityInfoBox1.setLayout(CityInfoBox1Layout);
        CityInfoBox1Layout.setHorizontalGroup(
            CityInfoBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInfoBox1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ciudad_Pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ver1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CityInfoBox1Layout.setVerticalGroup(
            CityInfoBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInfoBox1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInfoBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ciudad_Pic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CityInfoBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InfoCiudad1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(Ver1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CityInfoBox2.setBackground(new java.awt.Color(204, 204, 204));
        CityInfoBox2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CityInfoBox2.setAutoscrolls(true);
        CityInfoBox2.setMaximumSize(new java.awt.Dimension(50, 32767));

        Ver2.setText("Reservar");
        Ver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver2ActionPerformed(evt);
            }
        });

        InfoCiudad2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InfoCiudad2.setText("Info Ciudad");
        InfoCiudad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoCiudad2ActionPerformed(evt);
            }
        });

        Ciudad_Pic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_Pic2.setText("Pic");
        Ciudad_Pic2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CityInfoBox2Layout = new javax.swing.GroupLayout(CityInfoBox2);
        CityInfoBox2.setLayout(CityInfoBox2Layout);
        CityInfoBox2Layout.setHorizontalGroup(
            CityInfoBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInfoBox2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ciudad_Pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoCiudad2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ver2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CityInfoBox2Layout.setVerticalGroup(
            CityInfoBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInfoBox2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInfoBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ciudad_Pic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CityInfoBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InfoCiudad2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(Ver2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CityInfoBox3.setBackground(new java.awt.Color(204, 204, 204));
        CityInfoBox3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CityInfoBox3.setAutoscrolls(true);
        CityInfoBox3.setMaximumSize(new java.awt.Dimension(50, 32767));

        Ver3.setText("Reservar");
        Ver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver3ActionPerformed(evt);
            }
        });

        InfoCiudad3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InfoCiudad3.setText("Info Ciudad");
        InfoCiudad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoCiudad3ActionPerformed(evt);
            }
        });

        Ciudad_Pic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_Pic3.setText("Pic");
        Ciudad_Pic3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CityInfoBox3Layout = new javax.swing.GroupLayout(CityInfoBox3);
        CityInfoBox3.setLayout(CityInfoBox3Layout);
        CityInfoBox3Layout.setHorizontalGroup(
            CityInfoBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInfoBox3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ciudad_Pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoCiudad3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ver3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CityInfoBox3Layout.setVerticalGroup(
            CityInfoBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInfoBox3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInfoBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ciudad_Pic3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CityInfoBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InfoCiudad3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(Ver3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout ScrollBoxLayout = new javax.swing.GroupLayout(ScrollBox);
        ScrollBox.setLayout(ScrollBoxLayout);
        ScrollBoxLayout.setHorizontalGroup(
            ScrollBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrollBoxLayout.createSequentialGroup()
                .addGroup(ScrollBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityInfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityInfoBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityInfoBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityInfoBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        ScrollBoxLayout.setVerticalGroup(
            ScrollBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrollBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CityInfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityInfoBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityInfoBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityInfoBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(ScrollBox);

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(BuscadorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CiudadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(BuscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscadorCiudad)
                    .addComponent(BuscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(CiudadesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void BuscadorCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorCiudadActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerActionPerformed

    private void InfoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoCiudadActionPerformed

    private void Ver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver1ActionPerformed

    private void InfoCiudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoCiudad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoCiudad1ActionPerformed

    private void Ver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver2ActionPerformed

    private void InfoCiudad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoCiudad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoCiudad2ActionPerformed

    private void Ver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver3ActionPerformed

    private void InfoCiudad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoCiudad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoCiudad3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BienvenidoMensage;
    private javax.swing.JTextField BuscadorCiudad;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JPanel CityInfoBox;
    private javax.swing.JPanel CityInfoBox1;
    private javax.swing.JPanel CityInfoBox2;
    private javax.swing.JPanel CityInfoBox3;
    private javax.swing.JLabel Ciudad_Pic;
    private javax.swing.JLabel Ciudad_Pic1;
    private javax.swing.JLabel Ciudad_Pic2;
    private javax.swing.JLabel Ciudad_Pic3;
    private javax.swing.JLabel CiudadesDisponibles;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField InfoCiudad;
    private javax.swing.JTextField InfoCiudad1;
    private javax.swing.JTextField InfoCiudad2;
    private javax.swing.JTextField InfoCiudad3;
    private javax.swing.JLabel NombreApp;
    private javax.swing.JButton Perfil;
    private javax.swing.JLabel ProfilePic;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel ScrollBox;
    private javax.swing.JButton Ver;
    private javax.swing.JButton Ver1;
    private javax.swing.JButton Ver2;
    private javax.swing.JButton Ver3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
