package org.juancalocutor.catalogo.abstractas;

import org.juancalocutor.catalogo.interfaces.IProducto;

abstract public class Producto implements IProducto {

    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}
