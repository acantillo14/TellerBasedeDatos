package com.example.pngweb.tallerbasededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ReporteBalconSombra extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_balcon_sombra);
        int a=0;
        TextView cantidad = (TextView)findViewById(R.id.txtcandad);
        a = Datos.listarConBalconySombra(getApplicationContext());
        cantidad.setText(String.valueOf(a));


    }
}
