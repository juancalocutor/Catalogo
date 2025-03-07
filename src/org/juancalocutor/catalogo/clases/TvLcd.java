package org.juancalocutor.catalogo.clases;

import org.juancalocutor.catalogo.abstractas.Electronico;

public class TvLcd extends Electronico {

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public int getPrecioProducto() {
        return getPrecio();
    }

}
