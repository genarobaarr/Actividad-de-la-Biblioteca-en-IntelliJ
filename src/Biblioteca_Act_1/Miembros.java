package Biblioteca_Act_1;

import java.util.*;

public class Miembros {

    private long id;
    private String persona;
    private String nombre;
    private String direccion;
    private String membresia;

    public Miembros(long id, String persona, String nombre, String direccion, String membresia){
        this.id = id;
        this.persona = persona;
        this.nombre = nombre;
        this.direccion = direccion;
        this.membresia = membresia;
    }

    public void registrarMiembro(List<Miembros> listaMiembros){
        listaMiembros.add(this);
    }

    public void actualizarMiembro(String nombreActual, String direccionActual, String membresiaActual){
        this.nombre = nombreActual;
        this.direccion = direccionActual;
        this.membresia = membresiaActual;
    }

    public void cancelarMembresia(List<Miembros> listaMiembros){
        listaMiembros.remove(this);
    }

    //GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
}
