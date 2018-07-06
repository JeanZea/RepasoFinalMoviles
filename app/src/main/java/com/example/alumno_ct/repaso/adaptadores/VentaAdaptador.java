package com.example.alumno_ct.repaso.adaptadores;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumno_ct.repaso.R;
import com.example.alumno_ct.repaso.entidades.Venta;
import com.example.alumno_ct.repaso.entidades.VentaApp;

import java.util.ArrayList;

/**
 * Created by Alumno-CT on 06/07/2018.
 */

public class VentaAdaptador extends ArrayAdapter {
    private Context context;
    private ArrayList<Venta> ventas;

    public VentaAdaptador(Context context, ArrayList<Venta> ventas){
        super(context, 0, ventas);
        this.context = context;
        this.ventas = ventas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.venta_item, null, false);

        TextView txtTipo = convertView.findViewById(R.id.txtTipo);
        TextView txtCodigo = convertView.findViewById(R.id.txtCodigo);
        TextView txtCosto = convertView.findViewById(R.id.txtCosto);
        TextView txtRS = convertView.findViewById(R.id.txtRS);

        Venta venta = ventas.get(position);

        txtCodigo.setText(venta.getCodigoProyecto());
        txtCosto.setText(venta.getCostoProyecto()+"");
        txtRS.setText(venta.getRazonSocial());

        txtTipo.setText((venta instanceof VentaApp)?"Aplicación":"Sistema");

        return convertView;
    }
}
