package com.curso.mipc.Modelos;

public class Procesador {
    public  String nombreProcesador;
    public int imagenProcesador;
    public String inforProcesador;
    public String precioProcesador;

    public Procesador(String nombreProcesador, int imagenProcesador, String inforProcesador, String precioProcesador) {
        this.nombreProcesador = nombreProcesador;
        this.imagenProcesador = imagenProcesador;
        this.inforProcesador = inforProcesador;
        this.precioProcesador = precioProcesador;
    }


    public String getNombreProcesador() {
        return nombreProcesador;
    }

    public void setNombreProcesador(String nombreProcesador) {
        this.nombreProcesador = nombreProcesador;
    }

    public int getImagenProcesador() {
        return imagenProcesador;
    }

    public void setImagenProcesador(int imagenProcesador) {
        this.imagenProcesador = imagenProcesador;
    }

    public String getInforProcesador() {
        return inforProcesador;
    }

    public void setInforProcesador(String inforProcesador) {
        this.inforProcesador = inforProcesador;
    }

    public String getPrecioProcesador() {
        return precioProcesador;
    }

    public void setPrecioProcesador(String precioProcesador) {
        this.precioProcesador = precioProcesador;
    }
}
