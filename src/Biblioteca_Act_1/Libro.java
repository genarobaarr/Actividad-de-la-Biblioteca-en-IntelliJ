package Biblioteca_Act_1;

import java.util.*;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private String ISBN;
    private int copias;
    private String categoria;

    public Libro(String titulo, String autor, String genero, int anio, String ISBN, int copias, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.ISBN = ISBN;
        this.copias = copias;
        this.categoria = categoria;
    }

    public void anadeLibro(List<Libro> listaLibros){
        listaLibros.add(this);
    }

    public void eliminarLibro(List<Libro> listaLibros){
        listaLibros.remove(this);
    }

    public void actualizarLibro(String tituloActual, String autorActual, String generoActual, int anioActual, String ISBNActual, int copiasActual, String categoriaActual){
        this.titulo = tituloActual;
        this.autor = autorActual;
        this.genero = generoActual;
        this.anio = anioActual;
        this.ISBN = ISBNActual;
        this.copias = copiasActual;
        this.categoria = categoriaActual;
    }

    public void clasificar(){
        //genero
        //autor
        //año
    }

    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
