/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskControl.modelos;

/**
 *
 * @author jonat
 */
public class Tableros {

    private int id_tarea;
    private String lista_tareas;
    private String est_tarea;
    private String sin_comenzar;
    private String en_proceso;
    private String terminada;
    private int id_usuario;
    private String descripcion_tarea;

    public int getId_tarea() {
        return id_tarea;
    }

    public String getLista_tareas() {
        return lista_tareas;
    }

    public String getEst_tarea() {
        return est_tarea;
    }

    public String getSin_comenzar() {
        return sin_comenzar;
    }

    public String getEn_proceso() {
        return en_proceso;
    }

    public String getTerminada() {
        return terminada;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getDescripcion_tarea() {
        return descripcion_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setLista_tareas(String lista_tareas) {
        this.lista_tareas = lista_tareas;
    }

    public void setEst_tarea(String est_tarea) {
        this.est_tarea = est_tarea;
    }

    public void setSin_comenzar(String sin_comenzar) {
        this.sin_comenzar = sin_comenzar;
    }

    public void setEn_proceso(String en_proceso) {
        this.en_proceso = en_proceso;
    }

    public void setTerminada(String terminada) {
        this.terminada = terminada;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setDescripcion_tarea(String descripcion_tarea) {
        this.descripcion_tarea = descripcion_tarea;
    }

}
