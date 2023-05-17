/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taskcontrol.interfaces;

import TaskControl.modelos.Tableros;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface DAOTablero {
    public void agregarTarea (Tableros tablero) throws Exception;
    public void cambiarEstado (int id_tarea, String est_tarea) throws Exception;
    public void eliminarTarea (int id_tarea) throws Exception;
    public void editarTarea (Tableros tablero) throws Exception;
    public List<Tableros> listar() throws Exception;
    public Tableros obtenerTarea (int id_tarea) throws Exception;
}
