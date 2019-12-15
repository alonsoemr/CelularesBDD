package com.example.celulares.modelo;

import com.example.celulares.R;

public class Celular {
    private String nombre;
    private String descripcion;
    private int idFoto;

    public static final Celular [] celulares={
            new Celular("Samsung s10",
                    "Tamaño:6,1 Tipo pantalla:Super AMOLED Resolución: 2960 x 1440 Densidad de píxeles:540 pppTipo de protección:Corning Gorilla Glass 6",
                    R.drawable.s10),

            new Celular("Iphone 11",
                    "Capacidad 64GB Peso: 194 g  Pantalla LCD Multi-Touch de 6,1 pulgadas (en diagonal) con tecnología IPS  Resolución de 1.792 por 828 píxeles  Cubierta oleófuga antihuellas",
                    R.drawable.iphone11)
    };

    public Celular (String nombre, String descripcion, int idFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdFoto() {
        return idFoto;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
