package com.curso.mipc.Modelos;

public class Placa {

    public  String nombrePlaca;
    public int imagenPlaca;
    public String inforPlaca;
    public String precioPlaca;

    public Placa(String nombrePlaca, int imagenPlaca, String inforPlaca, String precioPlaca) {
        this.nombrePlaca = nombrePlaca;
        this.imagenPlaca = imagenPlaca;
        this.inforPlaca = inforPlaca;
        this.precioPlaca = precioPlaca;
    }

    public String getNombrePlaca() {
        return nombrePlaca;
    }

    public void setNombrePlaca(String nombrePlaca) {
        this.nombrePlaca = nombrePlaca;
    }

    public int getImagenPlaca() {
        return imagenPlaca;
    }

    public void setImagenPlaca(int imagenPlaca) {
        this.imagenPlaca = imagenPlaca;
    }

    public String getInforPlaca() {
        return inforPlaca;
    }

    public void setInforPlaca(String inforPlaca) {
        this.inforPlaca = inforPlaca;
    }

    public String getPrecioPlaca() {
        return precioPlaca;
    }

    public void setPrecioPlaca(String precioPlaca) {
        this.precioPlaca = precioPlaca;
    }
}
