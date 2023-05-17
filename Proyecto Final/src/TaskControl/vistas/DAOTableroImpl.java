/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskcontrol.vistas;

import TaskControl.modelos.Tableros;
import TaskControl.vistas.DAOUsuarioImpl.SesionUsuario;
import taskcontrol.database.Database;
import taskcontrol.interfaces.DAOTablero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class DAOTableroImpl extends Database implements DAOTablero {

    @Override
    public void agregarTarea(Tableros tablero) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tbm_tareas_tablero (lista_tareas, id_usuario, descripcion_tarea) VALUES (?, ?, ?);");
            st.setString(1, tablero.getLista_tareas());
            st.setInt(2, SesionUsuario.id_usuario); // Añadir el id_usuario
            st.setString(3, tablero.getDescripcion_tarea());

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void cambiarEstado(int id_tarea, String est_tarea) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tbm_tareas_tablero SET est_tarea = ? WHERE id_tarea = ?");
            st.setString(1, est_tarea);
            st.setInt(2, id_tarea);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminarTarea(int id_tarea) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM tbm_tareas_tablero WHERE id_tarea = ?");
            st.setInt(1, id_tarea);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Tableros> listar() throws Exception {
        List<Tableros> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT id_tarea, lista_tareas, sin_comenzar, en_proceso, terminada, id_usuario, descripcion_tarea FROM tbm_tareas_tablero WHERE id_usuario = ? ORDER BY id_tarea ASC");
            st.setInt(1, SesionUsuario.id_usuario);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Tableros tablero = new Tableros();
                tablero.setId_tarea(rs.getInt("id_tarea"));
                tablero.setLista_tareas(rs.getString("lista_tareas"));
                tablero.setSin_comenzar(rs.getString("sin_comenzar"));
                tablero.setEn_proceso(rs.getString("en_proceso"));
                tablero.setTerminada(rs.getString("terminada"));
                tablero.setId_usuario(rs.getInt("id_usuario"));
                tablero.setDescripcion_tarea(rs.getString("descripcion_tarea"));
                lista.add(tablero);
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

    @Override
    public Tableros obtenerTarea(int id_tarea) throws Exception {
        Tableros tablero = new Tableros();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tbm_tareas_tablero WHERE id_tarea = ? LIMIT 1;");
            st.setInt(1, id_tarea);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                tablero.setId_tarea(rs.getInt("id_tarea"));
                tablero.setLista_tareas(rs.getString("lista_tareas"));
                tablero.setDescripcion_tarea(rs.getString("descripcion_tarea")); // Corregir aquí
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return tablero;
    }

    @Override
    public void editarTarea(Tableros tablero) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tbm_tareas_tablero SET lista_tareas = ?, descripcion_tarea = ? WHERE id_tarea = ?;");
            st.setString(1, tablero.getLista_tareas());
            st.setString(2, tablero.getDescripcion_tarea());
            st.setInt(3, tablero.getId_tarea()); // Asegúrate de tener el campo id_tarea en la clase Tableros y de establecer su valor correctamente

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

}
