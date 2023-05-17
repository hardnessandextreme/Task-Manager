/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TaskControl.interfaces;

import TaskControl.modelos.Usuarios;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface DAOUsuarios {

    public boolean registrar(Usuarios usuario) throws Exception;

    public boolean logear(Usuarios usuario) throws Exception;

    public boolean esUsuarioAdministrador(String nombreUsuario) throws Exception;

    public List<Usuarios> listarUsuarios() throws Exception;

    byte[] cargarImagenPerfil(int idUsuario) throws Exception;

    void actualizarImagenPerfil(int idUsuario, byte[] imagen) throws Exception;

    void guardarImagenPerfil(int idUsuario, byte[] imagen) throws Exception;
}
