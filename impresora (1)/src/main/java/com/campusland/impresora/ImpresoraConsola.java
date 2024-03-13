package com.campusland.impresora;

public class ImpresoraConsola implements Impresora{

    @Override
    public void imprimir (String contenido){
        System.out.println("Imprimiendo en consola: " + contenido);
    }
}