/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taskcontrol.vistas;

import TaskControl.interfaces.DAOUsuarios;
import TaskControl.paneles.AgregarTarea;
import TaskControl.paneles.PanelAdmin;
import TaskControl.vistas.DAOUsuarioImpl;
import TaskControl.vistas.DAOUsuarioImpl.SesionUsuario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import taskcontrol.paneles.AcercaDe;
import taskcontrol.paneles.Inicio;
import taskcontrol.paneles.Tablero;

/**
 *
 * @author jonat
 */
public class TCDashboard extends javax.swing.JFrame {

    int xMouse, yMouse;
    private byte[] imagenPerfil;
    private boolean imagenPerfilCargada;
    private String rutaImagenPerfil;
    private String nombreUsuario;

    /**
     * Creates new form interfazUsuario
     */
    public TCDashboard() {
        initComponents();
        btnAdmin.setVisible(false);
        mostrarFecha();
        mostrarPanel(new Inicio());
        cargarImagenPerfil(); // Agregar esta línea para cargar la imagen personalizada
    }

    private void cargarImagenPerfil() {
        try {
            DAOUsuarios dao = new DAOUsuarioImpl();
            byte[] imagen = dao.cargarImagenPerfil(SesionUsuario.id_usuario); // Cambiar el parámetro por el identificador del usuario actualmente conectado
            if (imagen != null) {
                // Si se encuentra una imagen personalizada, se establece en el JLabel
                ImageIcon icono = new ImageIcon(imagen);
                Image imagenEscalada = icono.getImage().getScaledInstance(lbImagenPerfil.getWidth(), lbImagenPerfil.getHeight(), Image.SCALE_SMOOTH);
                lbImagenPerfil.setIcon(new ImageIcon(imagenEscalada));
            } else {
                // Si no hay una imagen personalizada, se establece la imagen predeterminada
                SetImageLabel(lbImagenPerfil, rutaImagenPerfil);
            }
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir al cargar la imagen
            e.printStackTrace();
        }
    }

    private void SetImageLabel(JLabel labelName, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(image);
        labelName.setIcon(resizedIcon);
    }

    public void mostrarBotonAdmin() {
        btnAdmin.setVisible(true);
    }

    private void mostrarFecha() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        lbFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es: 'EEEE',' dd 'de' MMMM 'de' yyyy")));
    }

    public void setUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        lbNombreUsuario.setText(nombreUsuario);
    }

    public static void mostrarPanel(JPanel panel) {
        panel.setSize(1140, 560);
        panel.setLocation(0, 0);

        pContenido.removeAll();
        pContenido.add(panel, BorderLayout.CENTER);
        pContenido.revalidate();
        pContenido.repaint();
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        lbNombreUsuario.setText(nombreUsuario);
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
        pContenedorNavegacion = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnTablero = new javax.swing.JButton();
        lbImagenPerfil = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnGuardarImagen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbFecha = new javax.swing.JLabel();
        pContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pContenedorPadre.setBackground(new java.awt.Color(28, 32, 40));
        pContenedorPadre.setPreferredSize(new java.awt.Dimension(1366, 768));
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
            .addGroup(equisCierrePanelLayout.createSequentialGroup()
                .addComponent(lbEquis, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
        equisCierrePanelLayout.setVerticalGroup(
            equisCierrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equisCierrePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbEquis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraFuncional.add(equisCierrePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 30));

        pContenedorPadre.add(barraFuncional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        pContenedorNavegacion.setBackground(new java.awt.Color(46, 50, 63));
        pContenedorNavegacion.setForeground(new java.awt.Color(255, 255, 255));
        pContenedorNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(73, 56, 56));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/salir-ico.png"))); // NOI18N
        btnSalir.setText("Cerrar sesión");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 11, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSalir.setIconTextGap(10);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 210, 50));

        btnAdmin.setBackground(new java.awt.Color(57, 73, 56));
        btnAdmin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/admin-ico.png"))); // NOI18N
        btnAdmin.setText("Panel admin");
        btnAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAdmin.setBorderPainted(false);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setFocusPainted(false);
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAdmin.setIconTextGap(10);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 210, 50));

        btnTablero.setBackground(new java.awt.Color(56, 59, 73));
        btnTablero.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnTablero.setForeground(new java.awt.Color(255, 255, 255));
        btnTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/tablero-ico.png"))); // NOI18N
        btnTablero.setText("Tablero");
        btnTablero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTablero.setBorderPainted(false);
        btnTablero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTablero.setFocusPainted(false);
        btnTablero.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnTablero.setIconTextGap(10);
        btnTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 50));

        lbImagenPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagenPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/user.png"))); // NOI18N
        lbImagenPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pContenedorNavegacion.add(lbImagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 130));

        lbNombreUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombreUsuario.setText("{user}");
        pContenedorNavegacion.add(lbNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Versión 0.1");
        pContenedorNavegacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 210, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Task Control");
        pContenedorNavegacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dimensiones cuadradas");
        pContenedorNavegacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, -1));

        btnInicio.setBackground(new java.awt.Color(56, 59, 73));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/casa-ico.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setIconTextGap(10);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 50));

        btnGuardarImagen.setBackground(new java.awt.Color(63, 128, 190));
        btnGuardarImagen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarImagen.setText("Cambiar imagen");
        btnGuardarImagen.setBorder(null);
        btnGuardarImagen.setBorderPainted(false);
        btnGuardarImagen.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btnGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImagenActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnGuardarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Espacio de trabajo");
        pContenedorNavegacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, -1));

        btnAcercaDe.setBackground(new java.awt.Color(56, 59, 73));
        btnAcercaDe.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        btnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TaskControl/imagenes/acercade-ico.png"))); // NOI18N
        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAcercaDe.setBorderPainted(false);
        btnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDe.setFocusPainted(false);
        btnAcercaDe.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAcercaDe.setIconTextGap(10);
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        pContenedorNavegacion.add(btnAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 210, 50));

        pContenedorPadre.add(pContenedorNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 770));

        jPanel1.setBackground(new java.awt.Color(32, 36, 47));

        lbFecha.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pContenedorPadre.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1140, 150));

        pContenido.setBackground(new java.awt.Color(32, 36, 47));
        pContenido.setForeground(new java.awt.Color(32, 36, 47));

        javax.swing.GroupLayout pContenidoLayout = new javax.swing.GroupLayout(pContenido);
        pContenido.setLayout(pContenidoLayout);
        pContenidoLayout.setHorizontalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        pContenidoLayout.setVerticalGroup(
            pContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        pContenedorPadre.add(pContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 1140, 560));

        getContentPane().add(pContenedorPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea CERRAR SESIÓN?", "Task Control", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            TCInicioSesion frmInicioSesion = new TCInicioSesion();
            frmInicioSesion.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new PanelAdmin());
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Tablero());
    }//GEN-LAST:event_btnTableroActionPerformed

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

    private void equisCierrePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseExited
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(172, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseExited

    private void equisCierrePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisCierrePanelMouseEntered
        // TODO add your handling code here:
        equisCierrePanel.setBackground(new Color(190, 51, 51));
    }//GEN-LAST:event_equisCierrePanelMouseEntered

    private void lbEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEquisMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbEquisMouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        mostrarPanel(new Inicio());
    }//GEN-LAST:event_btnInicioActionPerformed

    private byte[] obtenerBytesImagen(String imagePath) throws IOException {
        File file = new File(imagePath);
        try (FileInputStream fis = new FileInputStream(file); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return bos.toByteArray();
        }
    }

    private byte[] obtenerImagenSeleccionada() throws IOException {
        byte[] imagenBytes = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home"))); // Establecer el directorio inicial del cuadro de diálogo en el directorio de inicio del usuario
        chooser.setDialogTitle("Seleccionar imagen");
        chooser.setAcceptAllFileFilterUsed(false); // Desactivar la opción "All Files"

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif", "bmp"); // Mostrar solo los formatos de imagen comunes
        chooser.setFileFilter(filter);

        int resultado = chooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = chooser.getSelectedFile();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(archivoSeleccionado);
                imagenBytes = new byte[(int) archivoSeleccionado.length()];
                fis.read(imagenBytes);
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna imagen.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

        return imagenBytes;
    }


    private void btnGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImagenActionPerformed
        try {
            byte[] imagen = obtenerImagenSeleccionada();
            if (imagen == null) {
                return; // Si no se seleccionó ninguna imagen, no se realiza ninguna acción
            }

            DAOUsuarios dao = new DAOUsuarioImpl();
            dao.actualizarImagenPerfil(SesionUsuario.id_usuario, imagen); // Cambiar el primer parámetro por el identificador del usuario actualmente conectado
            JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente");
            cargarImagenPerfil(); // Actualizar la imagen mostrada en el JLabel
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la imagen");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarImagenActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        mostrarPanel(new AcercaDe());
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        UIManager.put("Button.arc", 20);
//        UIManager.put("Component.arc", 999);
//        UIManager.put("ProgressBar.arc", 999);
//        UIManager.put("TextComponent.arc", 999);
        UIManager.put("TabbedPane.selectedBackground", Color.white);
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraFuncional;
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnGuardarImagen;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablero;
    private javax.swing.JPanel equisCierrePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEquis;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbImagenPerfil;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JPanel pContenedorNavegacion;
    private javax.swing.JPanel pContenedorPadre;
    private static javax.swing.JPanel pContenido;
    // End of variables declaration//GEN-END:variables
}
