package com.curso.mipc.Modelos;

public class Memoria {

    public  String nombreMemo;
    public int imagenMemo;
    public String inforMemo;
    public String precioMemo;

    public Memoria(String nombreMemo, int imagenMemo, String inforMemo, String precioMemo) {
        this.nombreMemo = nombreMemo;
        this.imagenMemo = imagenMemo;
        this.inforMemo = inforMemo;
        this.precioMemo = precioMemo;
    }

    public String getNombreMemo() {
        return nombreMemo;
    }

    public void setNombreMemo(String nombreMemo) {
        this.nombreMemo = nombreMemo;
    }

    public int getImagenMemo() {
        return imagenMemo;
    }

    public void setImagenMemo(int imagenMemo) {
        this.imagenMemo = imagenMemo;
    }

    public String getInforMemo() {
        return inforMemo;
    }

    public void setInforMemo(String inforMemo) {
        this.inforMemo = inforMemo;
    }

    public String getPrecioMemo() {
        return precioMemo;
    }

    public void setPrecioMemo(String precioMemo) {
        this.precioMemo = precioMemo;
    }
}
