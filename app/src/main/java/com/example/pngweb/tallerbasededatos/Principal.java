package com.example.pngweb.tallerbasededatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView opciones;
    private  String []opc;
    private ArrayAdapter adapter;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        opciones=(ListView)findViewById(R.id.lstOpciones);
        opc = getResources().getStringArray(R.array.opciones);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        opciones.setAdapter(adapter);
        opciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i = new Intent(Principal.this,Registrar.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this,Listado.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(Principal.this,ReporteBalconSombra.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(Principal.this,ReportePisoCaro.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(Principal.this,ReporteMayorTamanio.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(Principal.this,ReportePormedioPiso.class);
                        startActivity(i);
                        break;
                }

            }
        });
    }
}
