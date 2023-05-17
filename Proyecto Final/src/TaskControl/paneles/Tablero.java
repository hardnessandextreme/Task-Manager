/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package taskcontrol.paneles;

import TaskControl.modelos.Tableros;
import TaskControl.paneles.AgregarTarea;
import TaskControl.paneles.EdicionTarea;
import TaskControl.paneles.MostrarTareaNomDescp;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import taskcontrol.interfaces.DAOTablero;
import taskcontrol.vistas.DAOTableroImpl;
import static taskcontrol.vistas.TCDashboard.mostrarPanel;

/**
 *
 * @author jonat
 */
public class Tablero extends javax.swing.JPanel {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        cargarTareas();
    }

    private void cargarTareas() {
        try {
            DAOTablero dao = new DAOTableroImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Limpiar tabla
            model.setRowCount(0);

            // Agregar filas
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getId_tarea(), u.getLista_tareas(), u.getSin_comenzar(), u.getEn_proceso(), u.getTerminada(), u.getDescripcion_tarea()}));

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private void eliminarTarea() {
        DAOTablero dao = new DAOTableroImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea ELIMINAR la tarea?", "Task Control", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        dao.eliminarTarea((int) jTable1.getValueAt(i, 0));
                        JOptionPane.showMessageDialog(null, "Tarea eliminada satisfactoriamente.");
                        model.removeRow(i);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una tarea en la tabla.");
        }

    }

    private void cambiarEstadoTarea() {
        DAOTablero dao = new DAOTableroImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int idTarea = (int) jTable1.getValueAt(selectedRow, 0);
            String estado = (String) cbEstadosTareas.getSelectedItem();
            try {
                if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea CAMBIAR el ESTADO de la tarea?", "Task Control", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    dao.cambiarEstado(idTarea, estado);
                    model.setValueAt(estado, selectedRow, 3);

                    cargarTareas();
                    JOptionPane.showMessageDialog(null, "Estado de tarea cambiado satisfactoriamente.");
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una tarea en la tabla.");
        }
    }

    private void editarTareaPanel() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            int idTarea = (int) jTable1.getValueAt(selectedRow, 0);

            try {
                DAOTablero dao = new DAOTableroImpl();
                Tableros tablero = dao.obtenerTarea(idTarea);

                // Abrir el panel de EdicionTarea y llenar los campos
                EdicionTarea edicionTarea = new EdicionTarea();
                edicionTarea.setNombreTarea(tablero.getLista_tareas());
                edicionTarea.setDescripcionTarea(tablero.getDescripcion_tarea());
                edicionTarea.setIdTarea(tablero.getId_tarea());
                mostrarPanel(edicionTarea);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una tarea en la tabla.");
        }
    }

    private void visualizarTarea() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            int idTarea = (int) jTable1.getValueAt(selectedRow, 0);

            try {
                DAOTablero dao = new DAOTableroImpl();
                Tableros tablero = dao.obtenerTarea(idTarea);

                // Abrir el panel de EdicionTarea y llenar los campos
                
                MostrarTareaNomDescp vertarea = new MostrarTareaNomDescp();
                vertarea.setNombreTarea(tablero.getLista_tareas());
                vertarea.setDescripcionTarea(tablero.getDescripcion_tarea());
                vertarea.setIdTarea(tablero.getId_tarea());
                mostrarPanel(vertarea);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una tarea en la tabla.");
        }
    }

    private void agregarTarea() {
        try {
            mostrarPanel(new AgregarTarea());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCambiarEst = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbEstadosTareas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarTarea = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVisualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 36, 47));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona la fila de tu tarea para ejecutar las acciones de los botones.");

        jTable1.setBackground(new java.awt.Color(43, 48, 63));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lista tareas", "Sin terminar", "En proceso", "Terminada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(74, 83, 109));
        jTable1.setShowGrid(true);
        jTable1.setShowHorizontalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(1);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCambiarEst.setBackground(new java.awt.Color(63, 128, 190));
        btnCambiarEst.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCambiarEst.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarEst.setText("Cambiar");
        btnCambiarEst.setBorder(null);
        btnCambiarEst.setBorderPainted(false);
        btnCambiarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar tarea:");

        btnEliminar.setBackground(new java.awt.Color(63, 128, 190));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado de tareas:");

        cbEstadosTareas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbEstadosTareas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "P", "T" }));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar tarea:");

        btnEditar.setBackground(new java.awt.Color(63, 128, 190));
        btnEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar tarea:");

        btnAgregarTarea.setBackground(new java.awt.Color(63, 128, 190));
        btnAgregarTarea.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTarea.setText("Agregar");
        btnAgregarTarea.setBorder(null);
        btnAgregarTarea.setBorderPainted(false);
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("I - Sin terminar");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("P - En proceso");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("T - Terminada");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ver tarea:");

        btnVisualizar.setBackground(new java.awt.Color(63, 128, 190));
        btnVisualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setBorder(null);
        btnVisualizar.setBorderPainted(false);
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEstadosTareas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(btnAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstadosTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCambiarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(27, 27, 27)
                            .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(27, 27, 27)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstActionPerformed
        // TODO add your handling code here:
        cambiarEstadoTarea();
    }//GEN-LAST:event_btnCambiarEstActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarTarea();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarTareaPanel();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        // TODO add your handling code here:
        agregarTarea();
    }//GEN-LAST:event_btnAgregarTareaActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        visualizarTarea();
    }//GEN-LAST:event_btnVisualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnCambiarEst;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cbEstadosTareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void mostralPanel(EdicionTarea edicionTarea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
