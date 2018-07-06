package com.example.alumno_ct.repaso.entidades;

/**
 * Created by Alumno-CT on 06/07/2018.
 */

public abstract class Venta {
    protected String razonSocial;
    protected String ruc;
    protected String codigoProyecto;
    protected double costoProyecto;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public double getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(double costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public abstract double AplicarDscto(int numMeses);
}
