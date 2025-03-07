package org.juancalocutor.catalogo.clases;

import org.juancalocutor.catalogo.abstractas.Producto;
import org.juancalocutor.catalogo.interfaces.ILibro;

public class Libro extends Producto implements ILibro {

    private String titulo, autor, editorial;
    private int fechaPublicacion;
    
    public Libro(int precio, String titulo, String autor, String editorial, int fechaPublicacion) {
        super(precio);
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public int getPrecioProducto() {
        return getPrecio();
    }
    
}
