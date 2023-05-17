/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskControl.vistas;

import TaskControl.interfaces.DAOUsuarios;
import TaskControl.modelos.Tableros;
import TaskControl.modelos.Usuarios;
import taskcontrol.database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class DAOUsuarioImpl extends Database implements DAOUsuarios {

    @Override
    public List<Usuarios> listarUsuarios() throws Exception {
        List<Usuarios> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT id_user, nombre_user FROM tbm_usuarios  ORDER BY id_user ASC");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId_user(rs.getInt("id_user"));
                usuario.setNombre_user(rs.getString("nombre_user"));
                lista.add(usuario);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public class SesionUsuario {

        public static int id_usuario;
    }

    @Override
    public boolean registrar(Usuarios usuario) throws Exception {
        boolean registroExitoso = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tbm_usuarios WHERE nombre_user = ?");
            st.setString(1, usuario.getNombre_user());
            ResultSet rs = st.executeQuery();

            // Verificar si ya existe el usuario
            if (rs.next()) {
                // Si el resultado no está vacío, entonces el usuario ya existe
                JOptionPane.showMessageDialog(null, "Error: El usuario ya existe");
            } else {
                // Si el resultado está vacío, entonces el usuario no existe y se puede insertar
                st = this.conexion.prepareStatement("INSERT INTO tbm_usuarios (nombre_user, contra_user) VALUES (?, ?);");
                st.setString(1, usuario.getNombre_user());
                st.setString(2, usuario.getContra_user());
                st.executeUpdate();
                registroExitoso = true;
                JOptionPane.showMessageDialog(null, "Datos registrados exitosamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se logró conectar la base de datos.", "Connection Trouble", JOptionPane.ERROR_MESSAGE);
            throw e;
        } finally {
            this.Cerrar();
        }
        return registroExitoso;
    }

    @Override
    public boolean logear(Usuarios usuario) throws Exception {
        boolean inicioExitoso = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT id_user FROM tbm_usuarios WHERE nombre_user = ? AND contra_user = ?");
            st.setString(1, usuario.getNombre_user());
            st.setString(2, usuario.getContra_user());
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                SesionUsuario.id_usuario = rs.getInt("id_user");
                inicioExitoso = true;
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se logró conectar la base de datos.", "Connection Trouble", JOptionPane.ERROR_MESSAGE);
            throw e;
        } finally {
            this.Cerrar();
        }
        return inicioExitoso;
    }

    @Override
    public boolean esUsuarioAdministrador(String nombreUsuario) throws Exception {
        boolean esAdministrador = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT admin_user FROM tbm_usuarios WHERE nombre_user = ?");
            st.setString(1, nombreUsuario);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String adminUser = rs.getString("admin_user");
                if (adminUser.equals("S")) {
                    esAdministrador = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se logró conectar la base de datos.", "Connection Trouble", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.Cerrar();
        }
        return esAdministrador;
    }

    @Override
    public byte[] cargarImagenPerfil(int idUsuario) throws Exception {
        byte[] imagenPerfil = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT imagenperfil_user FROM tbm_usuarios WHERE id_user = ?");
            st.setInt(1, idUsuario);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                imagenPerfil = rs.getBytes("imagenperfil_user");
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return imagenPerfil;
    }

    @Override
    public void actualizarImagenPerfil(int idUsuario, byte[] imagen) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tbm_usuarios SET imagenperfil_user = ? WHERE id_user = ?");
            st.setBytes(1, imagen);
            st.setInt(2, idUsuario);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void guardarImagenPerfil(int idUsuario, byte[] imagen) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tbm_usuarios (id_user, imagenperfil_user) VALUES (?, ?)");
            st.setInt(1, idUsuario);
            st.setBytes(2, imagen);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

}
