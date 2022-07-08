package com.curso.mipc.Modelos;

public class Gabinete {

    public  String nombreGabi;
    public int imagenGabi; //CAMBIAR A IMAGEN MAS ADELANTE
    public String inforGabi;
    public String precioGabi;

    public Gabinete(String nombreGabi, int imagenGabi, String inforGabi,String precioGabi) {
        this.nombreGabi = nombreGabi;
        this.imagenGabi = imagenGabi;
        this.inforGabi = inforGabi;
        this.precioGabi = precioGabi;
    }


    public String getNombreGabi() {
        return nombreGabi;
    }

    public void setNombreGabi(String nombreGabi) {
        this.nombreGabi = nombreGabi;
    }

    public int getImagenGabi() {
        return imagenGabi;
    }

    public void setImagenGabi(int imagenGabi) {
        this.imagenGabi = imagenGabi;
    }

    public String getInforGabi() {
        return inforGabi;
    }

    public void setInforGabi(String inforGabi) {
        this.inforGabi = inforGabi;
    }

    public String getPrecioGabi() {
        return precioGabi;
    }

    public void setPrecioGabi(String precioGabi) {
        this.precioGabi = precioGabi;
    }
}
