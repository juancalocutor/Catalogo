package org.juancalocutor.catalogo.clases;

import org.juancalocutor.catalogo.abstractas.Electronico;

public class Iphone extends Electronico {

    private String Modelo;
    private String Color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        Modelo = modelo;
        Color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public int getPrecioProducto() {
        return getPrecio();
    }

}
