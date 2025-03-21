/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taskcontrol.vistas;

import TaskControl.interfaces.DAOUsuarios;
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
public class TCInicioSesion extends javax.swing.JFrame {

    int xMouse, yMouse;
    private String nombreUsuario;

    /**
     * Creates new form inicioSesion
     */
    public TCInicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageLabel(lbFondo, "src/TaskControl/imagenes/imagenFondo.png");

    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        txtUsuarioLogin.setText(nombreUsuario);
    }

    public void setUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        txtUsuarioLogin.setText(nombreUsuario);
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
        barraFuncional = new javax.swing.JPanel();
        equisCierrePanel = new javax.swing.JPanel();
        lbEquis = new javax.swing.JLabel();
        flechaVolverPanel = new javax.swing.JPanel();
        lbFlechaVolver = new javax.swing.JLabel();
        pContenedorCont = new javax.swing.JPanel();
        lbInicioSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbUsuario = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        lbContraseña = new javax.swing.JLabel();
        txtContraseñaLogin = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lbImagenInicioSesion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pContenedorPadre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pContenedorCont.setBackground(new java.awt.Color(46, 50, 63));
        pContenedorCont.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pContenedorCont.setEnabled(false);

        lbInicioSesion.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        lbInicioSesion.setForeground(new java.awt.Color(251, 251, 250));
        lbInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInicioSesion.setText("Inicio de Sesión");
        lbInicioSesion.setAlignmentX(0.5F);

        lbUsuario.setBackground(new java.awt.Color(251, 251, 250));
        lbUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(251, 251, 250));
        lbUsuario.setText("Usuario");

        txtUsuarioLogin.setBackground(new java.awt.Color(32, 36, 47));
        txtUsuarioLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuarioLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setMargin(new java.awt.Insets(2, 10, 2, 6));

        lbContraseña.setBackground(new java.awt.Color(251, 251, 250));
        lbContraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(251, 251, 250));
        lbContraseña.setText("Contraseña");

        txtContraseñaLogin.setBackground(new java.awt.Color(32, 36, 47));
        txtContraseñaLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContraseñaLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseñaLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContraseñaLogin.setMargin(new java.awt.Insets(2, 10, 2, 6));

        btnIngresar.setBackground(new java.awt.Color(63, 128, 190));
        btnIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lbImagenInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagenInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout pContenedorContLayout = new javax.swing.GroupLayout(pContenedorCont);
        pContenedorCont.setLayout(pContenedorContLayout);
        pContenedorContLayout.setHorizontalGroup(
            pContenedorContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorContLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pContenedorContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(txtUsuarioLogin)
                    .addComponent(txtContraseñaLogin)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbImagenInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pContenedorContLayout.setVerticalGroup(
            pContenedorContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContenedorContLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lbImagenInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pContenedorPadre.add(pContenedorCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, 430));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/imagenFondo.png"))); // NOI18N
        pContenedorPadre.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 730, 630));

        getContentPane().add(pContenedorPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 607));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraFuncionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraFuncionalMousePressed

    private void barraFuncionalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraFuncionalMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraFuncionalMouseDragged

    private void equisCierrePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseEntered
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(190, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseEntered

    private void equisCierrePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseExited
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(172, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseExited

    private void flechaVolverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaVolverPanelMouseEntered
        // TODO add your handling code here:
        flechaVolverPanel.setBackground(new Color(63, 128, 190));
    }//GEN-LAST:event_flechaVolverPanelMouseEntered

    private void flechaVolverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaVolverPanelMouseExited
        // TODO add your handling code here:
        flechaVolverPanel.setBackground(new Color(24, 36, 68));
    }//GEN-LAST:event_flechaVolverPanelMouseExited

    private void lbEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEquisMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbEquisMouseClicked

    private void lbFlechaVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFlechaVolverMouseClicked
        // TODO add your handling code here:
        System.out.println("Boton funcionando");
        TCPrincipal frmInterfazPrincipal = new TCPrincipal();
        frmInterfazPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbFlechaVolverMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuarioLogin = txtUsuarioLogin.getText();
        String contraseñaLogin = new String(txtContraseñaLogin.getPassword());

        TaskControl.modelos.Usuarios usuario = new TaskControl.modelos.Usuarios();
        usuario.setNombre_user(usuarioLogin);
        usuario.setContra_user(contraseñaLogin);

        try {
            DAOUsuarios dao = new DAOUsuarioImpl();
            boolean inicioExitoso = dao.logear(usuario);

            if (inicioExitoso) {
                boolean esAdmin = dao.esUsuarioAdministrador(usuarioLogin);
                TCDashboard frmInterfazUsuario = new TCDashboard();

                frmInterfazUsuario.setUsuario(usuarioLogin);

                if (esAdmin) {
                    frmInterfazUsuario.mostrarBotonAdmin();
                }

                frmInterfazUsuario.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error: Credenciales inválidas");
            }
        } catch (Exception e) {
            // Manejar la excepción según tus necesidades
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UIManager.put("TextComponent.arc", 10);
        UIManager.put("Panel.arc", 10);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        UIManager.put("Button.arc", 999);
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
                new TCInicioSesion().setVisible(true);
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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel equisCierrePanel;
    private javax.swing.JPanel flechaVolverPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbEquis;
    private javax.swing.JLabel lbFlechaVolver;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbImagenInicioSesion;
    private javax.swing.JLabel lbInicioSesion;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pContenedorCont;
    private javax.swing.JPanel pContenedorPadre;
    private javax.swing.JPasswordField txtContraseñaLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables

}
