package com.curso.mipc.Modelos;

public class Laptop {

    public  String nombreLap;
    public int imagenLap;
    public String inforLap;
    public String precioLap;

    public Laptop(String nombreLap, int imagenLap, String inforLap, String precioLap) {
        this.nombreLap = nombreLap;
        this.imagenLap = imagenLap;
        this.inforLap = inforLap;
        this.precioLap = precioLap;
    }

    public String getNombreLap() {
        return nombreLap;
    }

    public void setNombreLap(String nombreLap) {
        this.nombreLap = nombreLap;
    }

    public int getImagenLap() {
        return imagenLap;
    }

    public void setImagenLap(int imagenLap) {
        this.imagenLap = imagenLap;
    }

    public String getInforLap() {
        return inforLap;
    }

    public void setInforLap(String inforLap) {
        this.inforLap = inforLap;
    }

    public String getPrecioLap() {
        return precioLap;
    }

    public void setPrecioLap(String precioLap) {
        this.precioLap = precioLap;
    }
}
