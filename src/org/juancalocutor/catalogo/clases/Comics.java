package org.juancalocutor.catalogo.clases;

public class Comics extends Libro {

    private String personaje;

    public Comics(int precio, String titulo, String autor, String editorial, int fechaPublicacion, String personaje) {
        super(precio, titulo, autor, editorial, fechaPublicacion);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public int getPrecioProducto() {
        return getPrecio();
    }
}
