package com.example.pngweb.tallerbasededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportePormedioPiso extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Apartamento> apartamentos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_pormedio_piso);
        tabla = (TableLayout)findViewById(R.id.tblPisoGrande);
        apartamentos = Datos.Promediopiso(getApplicationContext());
        for (int i =0;i<apartamentos.size(); i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            c1.setText(apartamentos.get(i).getPiso());
            c2.setText(apartamentos.get(i).getMts());
            fila.addView(c1);
            fila.addView(c2);
            tabla.addView(fila);

        }
    }
}
