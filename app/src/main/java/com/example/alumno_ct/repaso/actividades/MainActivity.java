package com.example.alumno_ct.repaso.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.alumno_ct.repaso.R;
import com.example.alumno_ct.repaso.adaptadores.VentaAdaptador;
import com.example.alumno_ct.repaso.entidades.Venta;
import com.example.alumno_ct.repaso.entidades.VentaApp;
import com.example.alumno_ct.repaso.entidades.VentaSistema;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Venta> ventas = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VentaApp ventaApp1 = new VentaApp();
        ventaApp1.setCodigoProyecto("App001");
        ventaApp1.setCostoProyecto(18600);
        ventaApp1.setRazonSocial("Cencosud SA");
        ventaApp1.setCantLic(600);
        ventaApp1.setTiempoMantGrat(80);

        VentaSistema ventaSistema1 = new VentaSistema();
        ventaSistema1.setCodigoProyecto("Sist001");
        ventaSistema1.setCostoProyecto(83500);
        ventaSistema1.setRazonSocial("Oeschle SAC");

        VentaApp ventaApp2 = new VentaApp();
        ventaApp2.setCodigoProyecto("App002");
        ventaApp2.setCostoProyecto(23000);
        ventaApp2.setRazonSocial("Ripley S.A.");

        ventas.add(ventaApp1);
        ventas.add(ventaSistema1);
        ventas.add(ventaApp2);

        listView = findViewById(R.id.list);
        VentaAdaptador adaptador = new VentaAdaptador(this, ventas);
        listView.setAdapter(adaptador);
    }
}
