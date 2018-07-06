package com.example.alumno_ct.repaso.entidades;

/**
 * Created by Alumno-CT on 06/07/2018.
 */

public class VentaSistema extends Venta {
    private String proveedor;
    private String cuenta;
    private String password;
    private String periodoMant;
    private String fechaPago;

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPeriodoMant() {
        return periodoMant;
    }

    public void setPeriodoMant(String periodoMant) {
        this.periodoMant = periodoMant;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public double AplicarDscto(int numMeses) {
        double cantSem = Math.floor(numMeses/6);
        double dsct = cantSem*.12;

        return dsct>.48?.48:dsct;
    }
}
