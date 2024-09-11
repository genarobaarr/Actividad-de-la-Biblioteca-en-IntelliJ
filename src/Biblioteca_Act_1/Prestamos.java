package Biblioteca_Act_1;

import java.util.*;

public class Prestamos {

    private Libro libroPrestado;
    private Miembros miembro;
    private Date fecha;
    private Date fechaDevolucion;
    private double multa;

    public Prestamos(Libro libroPrestado, Miembros miembro, Date fecha, Date fechaDevolucion, double multa){
        this.libroPrestado = libroPrestado;
        this.miembro = miembro;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
    }

    public void registrarPrestamo(List<Prestamos> listaPrestamos){

    }

    public void registrarDevolucion(List<Prestamos> listaPrestamos){
        this.fechaDevolucion = fechaDevolucion;
        this.fecha = fecha;
    }

    public double calcularMulta(){
        return multa;
    }

    public void verHistorial(){

    }

    //GETTERS AND SETTERS


    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public Miembros getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembros miembro) {
        this.miembro = miembro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
