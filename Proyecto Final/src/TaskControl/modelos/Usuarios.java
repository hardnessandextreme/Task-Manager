/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskControl.modelos;

/**
 *
 * @author jonat
 */
public class Usuarios {

    private int id_user;
    private String nombre_user;
    private String contra_user;
    private String admin_user;
    private byte[] imagenperfil_user;

    public int getId_user() {
        return id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public String getContra_user() {
        return contra_user;
    }

    public String getAdmin_user() {
        return admin_user;
    }

    public byte[] getImagenperfil_user() {
        return imagenperfil_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public void setContra_user(String contra_user) {
        this.contra_user = contra_user;
    }

    public void setAdmin_user(String admin_user) {
        this.admin_user = admin_user;
    }

    public void setImagenperfil_user(byte[] imagenperfil_user) {
        this.imagenperfil_user = imagenperfil_user;
    }
}
