package com.curso.mipc.Modelos;

public class Disco {

    public  String nombreDisco;
    public int imagenDisco; //CAMBIAR A IMAGEN MAS ADELANTE
    public String inforDisco;
    public String inforPrecioDisco;

    public Disco(String nombreDisco, int imagenDisco, String inforDisco, String inforPrecioDisco) {
        this.nombreDisco = nombreDisco;
        this.imagenDisco = imagenDisco;
        this.inforDisco = inforDisco;
        this.inforPrecioDisco = inforPrecioDisco;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public int getImagenDisco() {
        return imagenDisco;
    }

    public void setImagenDisco(int imagenDisco) {
        this.imagenDisco = imagenDisco;
    }

    public String getInforDisco() {
        return inforDisco;
    }

    public void setInforDisco(String inforDisco) {
        this.inforDisco = inforDisco;
    }

    public String getInforPrecioDisco() {
        return inforPrecioDisco;
    }

    public void setInforPrecioDisco(String inforPrecioDisco) {
        this.inforPrecioDisco = inforPrecioDisco;
    }
}
