package org.juancalocutor.catalogo.abstractas;

import org.juancalocutor.catalogo.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {

    protected String Fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        Fabricante = fabricante;
    }

    public String getFabricante() {
        return Fabricante;
    }

}
