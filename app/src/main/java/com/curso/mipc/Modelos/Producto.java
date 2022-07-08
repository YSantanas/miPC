package com.curso.mipc.Modelos;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Producto {
    //variables que vamos a usar
   public  String nombreProducto;
    public int imagenProducto; //CAMBIAR A IMAGEN MAS ADELANTE
    public int numeroEstrella;

    public Producto(String nombreProducto, int imagenProducto, int numeroEstrella) {
        this.nombreProducto = nombreProducto;
        this.imagenProducto = imagenProducto;
        this.numeroEstrella = numeroEstrella;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(int imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getNumeroEstrella() {
        return numeroEstrella;
    }

    public void setNumeroEstrella(int numeroEstrella) {
        this.numeroEstrella = numeroEstrella;
    }
}
