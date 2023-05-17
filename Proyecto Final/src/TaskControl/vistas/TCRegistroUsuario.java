/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taskcontrol.vistas;

import TaskControl.interfaces.DAOUsuarios;
import TaskControl.modelos.Usuarios;
import TaskControl.vistas.DAOUsuarioImpl;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author jonat
 */
public class TCRegistroUsuario extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form registroUsuario
     */
    public TCRegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageLabel(lbFondo, "src/TaskControl/imagenes/imagenFondo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pContenedorPadre = new javax.swing.JPanel();
        pContenedorCont1 = new javax.swing.JPanel();
        pContenedorRegistro = new javax.swing.JPanel();
        lbRegistro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbUsuario = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        lbContraseña = new javax.swing.JLabel();
        txtContraseñaRegistro = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        lbImagenInicioSesion = new javax.swing.JLabel();
        lbContraseña1 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        pContenidoAviso = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        barraFuncional = new javax.swing.JPanel();
        equisCierrePanel = new javax.swing.JPanel();
        lbEquis = new javax.swing.JLabel();
        flechaVolverPanel = new javax.swing.JPanel();
        lbFlechaVolver = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pContenedorPadre.setPreferredSize(new java.awt.Dimension(720, 607));
        pContenedorPadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pContenedorCont1.setBackground(new java.awt.Color(46, 50, 63));
        pContenedorCont1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pContenedorCont1.setEnabled(false);
        pContenedorCont1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pContenedorRegistro.setBackground(new java.awt.Color(46, 50, 63));
        pContenedorRegistro.setEnabled(false);

        lbRegistro.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        lbRegistro.setForeground(new java.awt.Color(251, 251, 250));
        lbRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegistro.setText("Registro de Usuario");
        lbRegistro.setAlignmentX(0.5F);

        lbUsuario.setBackground(new java.awt.Color(251, 251, 250));
        lbUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(251, 251, 250));
        lbUsuario.setText("Usuario");

        txtUsuarioRegistro.setBackground(new java.awt.Color(32, 36, 47));
        txtUsuarioRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuarioRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioRegistro.setCaretColor(new java.awt.Color(255, 255, 255));

        lbContraseña.setBackground(new java.awt.Color(251, 251, 250));
        lbContraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(251, 251, 250));
        lbContraseña.setText("Contraseña");

        txtContraseñaRegistro.setBackground(new java.awt.Color(32, 36, 47));
        txtContraseñaRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContraseñaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseñaRegistro.setCaretColor(new java.awt.Color(255, 255, 255));

        btnRegistrar.setBackground(new java.awt.Color(63, 128, 190));
        btnRegistrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbImagenInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagenInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/user.png"))); // NOI18N

        lbContraseña1.setBackground(new java.awt.Color(251, 251, 250));
        lbContraseña1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbContraseña1.setForeground(new java.awt.Color(251, 251, 250));
        lbContraseña1.setText("Confirmación");

        txtConfirmacion.setBackground(new java.awt.Color(32, 36, 47));
        txtConfirmacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmacion.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pContenedorRegistroLayout = new javax.swing.GroupLayout(pContenedorRegistro);
        pContenedorRegistro.setLayout(pContenedorRegistroLayout);
        pContenedorRegistroLayout.setHorizontalGroup(
            pContenedorRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContenedorRegistroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pContenedorRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbImagenInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuarioRegistro)
                    .addComponent(lbContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraseñaRegistro)
                    .addComponent(txtConfirmacion)
                    .addComponent(lbContraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(43, 43, 43))
        );
        pContenedorRegistroLayout.setVerticalGroup(
            pContenedorRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorRegistroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbImagenInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pContenedorCont1.add(pContenedorRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        pContenidoAviso.setBackground(new java.awt.Color(46, 50, 63));
        pContenidoAviso.setLayout(null);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pContenidoAviso.add(jSeparator2);
        jSeparator2.setBounds(6, 14, 58, 480);

        jPanel2.setBackground(new java.awt.Color(46, 50, 63));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ten en cuenta:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html><center>El campo confirmación debe ser igual al de contraseña.");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html><center>El nombre de usuario no puede ser menor a 3 carácteres.");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html><center>La contraseña debe tener un mínimo de 8 carácteres, e incluir al menos una mayúscula, y un número.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(148, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)))
        );

        pContenidoAviso.add(jPanel2);
        jPanel2.setBounds(20, 120, 230, 260);

        pContenedorCont1.add(pContenidoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, -2, 260, 500));

        pContenedorPadre.add(pContenedorCont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 610, 500));

        barraFuncional.setBackground(new java.awt.Color(24, 36, 68));
        barraFuncional.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraFuncional.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraFuncionalMouseDragged(evt);
            }
        });
        barraFuncional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraFuncionalMousePressed(evt);
            }
        });
        barraFuncional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equisCierrePanel.setBackground(new java.awt.Color(172, 51, 51));
        equisCierrePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        equisCierrePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equisCierrePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equisCierrePanelMouseExited(evt);
            }
        });

        lbEquis.setBackground(new java.awt.Color(172, 51, 51));
        lbEquis.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lbEquis.setForeground(new java.awt.Color(255, 255, 255));
        lbEquis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEquis.setText("X");
        lbEquis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEquis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEquisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout equisCierrePanelLayout = new javax.swing.GroupLayout(equisCierrePanel);
        equisCierrePanel.setLayout(equisCierrePanelLayout);
        equisCierrePanelLayout.setHorizontalGroup(
            equisCierrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEquis, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        equisCierrePanelLayout.setVerticalGroup(
            equisCierrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEquis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        barraFuncional.add(equisCierrePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 30));

        flechaVolverPanel.setBackground(new java.awt.Color(24, 36, 68));
        flechaVolverPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        flechaVolverPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flechaVolverPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                flechaVolverPanelMouseExited(evt);
            }
        });

        lbFlechaVolver.setBackground(new java.awt.Color(24, 36, 68));
        lbFlechaVolver.setForeground(new java.awt.Color(255, 255, 255));
        lbFlechaVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFlechaVolver.setText("← Volver");
        lbFlechaVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFlechaVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFlechaVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout flechaVolverPanelLayout = new javax.swing.GroupLayout(flechaVolverPanel);
        flechaVolverPanel.setLayout(flechaVolverPanelLayout);
        flechaVolverPanelLayout.setHorizontalGroup(
            flechaVolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFlechaVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        flechaVolverPanelLayout.setVerticalGroup(
            flechaVolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFlechaVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        barraFuncional.add(flechaVolverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        pContenedorPadre.add(barraFuncional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/imagenFondo.png"))); // NOI18N
        pContenedorPadre.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 730, 620));

        getContentPane().add(pContenedorPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 607));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equisCierrePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseEntered
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(190, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseEntered

    private void equisCierrePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseExited
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(172, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseExited

    private void barraFuncionalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraFuncionalMouseDragged

    private void barraFuncionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraFuncionalMousePressed

    private void lbEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEquisMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbEquisMouseClicked

    private void flechaVolverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaVolverPanelMouseEntered
        // TODO add your handling code here:
        flechaVolverPanel.setBackground(new Color(63, 128, 190));
    }//GEN-LAST:event_flechaVolverPanelMouseEntered

    private void flechaVolverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaVolverPanelMouseExited
        // TODO add your handling code here:
        flechaVolverPanel.setBackground(new Color(24, 36, 68));
    }//GEN-LAST:event_flechaVolverPanelMouseExited

    private void lbFlechaVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFlechaVolverMouseClicked
        // TODO add your handling code here:
        System.out.println("Boton funcionando");
        TCPrincipal frmInterfazPrincipal = new TCPrincipal();
        frmInterfazPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbFlechaVolverMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String usuarioRegistro = txtUsuarioRegistro.getText();
        String contraseñaRegistro = new String(txtContraseñaRegistro.getPassword());
        String confirmacionRegistro = new String(txtConfirmacion.getPassword());

        //Validaciones al registrar
        if ((usuarioRegistro.length() < 3) || (contraseñaRegistro.equals(usuarioRegistro)) || (!contraseñaRegistro.matches(".*\\d.*")) || (!contraseñaRegistro.matches(".*[A-Z].*")) || (!contraseñaRegistro.equals(confirmacionRegistro))) {
            JOptionPane.showMessageDialog(null, "Error: Datos inválidos. \nLeer Indicaciones de la derecha.");
            return;
        }

        Usuarios usuario = new Usuarios();
        usuario.setNombre_user(usuarioRegistro);
        usuario.setContra_user(contraseñaRegistro);
        try {
            DAOUsuarios dao = new DAOUsuarioImpl();
            boolean registroExitoso = dao.registrar(usuario);

            if (registroExitoso) {
                TCInicioSesion frmInicioSesion = new TCInicioSesion();
                frmInicioSesion.setUsuario(usuarioRegistro);
                frmInicioSesion.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se logró registrar los datos.");
            System.err.println("ERROR");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        UIManager.put("Button.arc", 200);
//        UIManager.put("Component.arc", 999);
//        UIManager.put("ProgressBar.arc", 999);
//        UIManager.put("TextComponent.arc", 999);
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCRegistroUsuario().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_AREA_AVERAGING));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraFuncional;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel equisCierrePanel;
    private javax.swing.JPanel flechaVolverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbContraseña1;
    private javax.swing.JLabel lbEquis;
    private javax.swing.JLabel lbFlechaVolver;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbImagenInicioSesion;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pContenedorCont1;
    private javax.swing.JPanel pContenedorPadre;
    private javax.swing.JPanel pContenedorRegistro;
    private javax.swing.JPanel pContenidoAviso;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JPasswordField txtContraseñaRegistro;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}