package com.example.alumno_ct.repaso.entidades;

/**
 * Created by Alumno-CT on 06/07/2018.
 */

public class VentaApp extends Venta {
    private int tiempoMantGrat;
    private int cantLic;

    public int getTiempoMantGrat() {
        return tiempoMantGrat;
    }

    public void setTiempoMantGrat(int tiempoMantGrat) {
        this.tiempoMantGrat = tiempoMantGrat;
    }

    public int getCantLic() {
        return cantLic;
    }

    public void setCantLic(int cantLic) {
        this.cantLic = cantLic;
    }

    @Override
    public double AplicarDscto(int numMeses) {
        double cantAnos = Math.floor(numMeses/12);
        double dscto = cantAnos*.1;
        return dscto>.3?.3:dscto;

        /*
        * if(dscto>.3) return .3;
        * else return dscto;
        * */
    }
}
